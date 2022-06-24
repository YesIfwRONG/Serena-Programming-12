<?php
session_start();
if (isset($_POST['submit'])) {
    include_once 'dbh.inc.php';
    $uid = $_SESSION["u_uid"];
    $subject = mysqli_real_escape_string($conn, $_POST['subject']);
    $content = mysqli_real_escape_string($conn, $_POST['content']);
    //error handlers
    //check for empty
    if(empty($subject) || empty($content)||empty($uid)){
        header("Location: ../post.php?post=empty");
        exit();
    }else{
        // if the user logged in, then insert post to the else statement
        if(isset($_SESSION['u_uid'])){
            $sql = "INSERT INTO post(subject, content, user_uid, date) VALUES('$subject', '$content', '$uid',CURRENT_TIMESTAMP());";
            mysqli_query($conn, $sql);
            header("Location: ../post.php?post=success");
            exit();
        }else{
            header("Location: ../post.php?post=login_error");
        }
    }
}else{
    header("Location: ../post.php");
    exit();
}