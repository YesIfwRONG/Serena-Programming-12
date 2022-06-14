package com.serena.database;

import org.apache.derby.impl.store.raw.log.Scan;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static DatabaseHandler handler;

    public static void addMember(String id, String name, String email, String nickName){
        String qu = "INSERT INTO MEMBER VALUES (" +
                "'" + id + "'," +
                "'" + name + "'," +
                "'" + email + "'," +
                "'" + nickName + "')";
        handler.execAction(qu);
    }


    public static void retrieveInfoMember() {
        String qu = "SELECT * FROM MEMBER";
        ResultSet resultSet = handler.execQuery(qu);
        try{
            while (resultSet.next()){
                String id = resultSet.getString("ID");
                String name = resultSet.getString("NAME");
                System.out.println("Entry: ID" + id + "\tName: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void retrieveInfoFile() {
        String qu = "SELECT * FROM FILE";
        ResultSet resultSet = handler.execQuery(qu);
        try{
            while (resultSet.next()){
                String name = resultSet.getString("NAME");
                String path = resultSet.getString("PATH");
                String extension = resultSet.getString("EXTENSION");
                String fileSize = resultSet.getString("FILE_SIZE");
                System.out.println("File Name: " + name + "\t| File Path: " + path + "\t| File Extension: "+ extension+"\t| File Size: " + fileSize);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addFiles(String name, String path, String extension, String fileSize){ // need to work on this one
        String qu = "INSERT INTO FILE (name, path, extension, file_size) VALUES (" +
                "'" + name + "'," +
                "'" + path + "'," +
                "'" + extension + "'," +
                "'" + fileSize + "')";
        handler.execAction(qu);
    }


    public static void main(String[] args) {
        handler = DatabaseHandler.getHandler();
        Scanner myObj = new Scanner(System.in);
        String path = myObj.next();
        File folder = new File(path);
        ReadFolder.ReadFiles(folder);
    }
}
