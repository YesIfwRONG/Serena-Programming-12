package com.zaremba.graphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Node> graph;
    public static ArrayList<Integer> access = new ArrayList<>();;
    public static void main(String[] args) throws FileNotFoundException {
        setupTree();
        BFS(0);
        for (Integer i : access) {
            System.out.println(i+"");
        }
    }

    // get the first one then access the second of the line then the third, then find the second one and access all second one's slavers, then the third one's slavers
    private static void BFS(int index) { // We can start from 0-15th term of the "graph", the case below is when we start at 1;
        Node line = graph.get(index);
        if(!line.isVisited()) {
            access.add(line.getKey());
        }
        line.setVisited(true);
        for(Integer i : line.getNodes()){ // loop through the nodes and add them in;
            int key = 0;
            for (Integer j : access) { // if access has occurred the number (i == j ), it won't add
                if(i == j){
                    key = 1;
                }
            }
            if (key != 1) {
                access.add(i);
            }
        }
        for(Integer i : line.getNodes()){ // loop through the nodes again but this time get into the nodes' lines
            if(!graph.get(i-1).isVisited()) {
                BFS(i-1);
            }
        }

    }

    private static void setupTree() throws FileNotFoundException { // Read tree.txt, store the line then apply function "parseLine".
        graph = new ArrayList<>();
        Scanner scan = new Scanner(new File("tree.txt"));
        while(scan.hasNext()){
            String line = scan.nextLine();
            parseLine(line);
        }
    }

    private static void parseLine(String line) { // Separate the given line to different keys then store them into a list
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]); // Convert the first value in the line to int as the key
        ArrayList<Integer> points = new ArrayList<>();
        for(int i = 1; i < keys.length;i++){ // Add the rest of the numbers in line to "points"
            points.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, points)); // Add new object Node by giving the numbers to Node type ArrayList called "graph"
    }
}
