<?php
include_once "includes/dbh.inc.php";
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login System</title>
    <link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>
    <header>
        <nav>
            <div class="main-wrapper">
                <ul>
                    <li><a href="index.php">HOME</a></li>
                </ul>
                <div class="nav-login">
                    <form>
                        <input type="text" name="uid" placeholder="Username/email">
                        <input type="password" name="pwd" placeholder="Password">
                        <button type="submit" name="submit">Login</button>
                    </form>
                    <a href="signup.php">Sign up</a>
                </div>
            </div>
        </nav>
    </header>
