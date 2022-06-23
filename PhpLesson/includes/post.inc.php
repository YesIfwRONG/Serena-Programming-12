<?php
session_start();
if (isset($_POST['submit'])) {
    include_once 'dbh.inc.php';
    $uid = mysqli_real_escape_string($conn, $_POST['uid']);
    $subject = mysqli_real_escape_string($conn, $_POST['subject']);
    $content = mysqli_real_escape_string($conn, $_POST['content']);
    //error handlers
    //check for empty
    if(empty($subject) || empty($content)){
        header("Location: ../post.php?post=empty");
        exit();
    }else{
        // if the database exists, then jumps to the else statement
        $sql = "CREATE TABLE IF NOT EXISTS '$uid' (
                id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
                subject VARCHAR(128) NOT NULL,
                content VARCHAR(1000) NOT NULL,
                date datetime NOT NULL
                );";
        if(mysqli_query($conn, $sql)){
            header("Location: ../post.php?post=database-success");
        } else{
            header("Location: ../post.php?post=database-fail-to-create");
        }
        //insert the user into the database
        $sql = "INSERT INTO '$uid'(subject, content) VALUES('$subject', '$content');";
        mysqli_query($conn, $sql);
        header("Location: ../post.php?post=success");
        exit();
    }
}else{
    header("Location: ../post.php");
    exit();
}