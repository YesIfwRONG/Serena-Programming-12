<?php session_start(); ?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login System</title>
    <link href="reset.css" rel="stylesheet" type="text/css">
    <link href="style.css" rel="stylesheet" type="text/css">
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Amatic+SC:wght@700&display=swap');
    </style>
</head>
<body>
    <header>
        <nav>
            <div class="main-wrapper">
                <ul>
                    <li><a href="index.php">HOME&nbsp;</a></li>
                    <li><a href="post.php">&nbsp;POSTS</a></li>
                </ul>
                <div class="nav-login">
                    <?php
                    if (isset($_SESSION['u_id'])) {
                        echo'<form action="includes/logout.inc.php" method="POST">
                        <button type="submit" name="submit">Log out</button>
                        </form>';
                    }else{
                        echo'<form action="includes/login.inc.php" method="POST">
                        <input type="text" name="uid" placeholder="Username/email">
                        <input type="password" name="pwd" placeholder="Password">
                        <button type="submit" name="submit">Login</button>
                        </form>';
                    }
                    ?>

                    <a href="signup.php">Sign up</a>
                </div>
            </div>
        </nav>
    </header>
