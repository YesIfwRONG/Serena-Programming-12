<?php
include_once 'header.php';
?>
<section class="main-container">
    <div class="main-wrapper">
        <?php
        if (!isset($_SESSION['u_uid'])) {
            echo '<h2>General Posts</h2>
                    <div class="user-sets">
                        <div class="post-sections">
                            <div class="info">
                                <img class="avatar" src="statics/default-user-image-2.png" alt="avatar">
                                <div class="center">
                                    <p class="user-name">User</p>
                                </div>
                            </div>
                            <form action="includes/post.inc.php" method="post">
                                <input class="subject" type="text" name="subject" placeholder="Subject">
                                <input class="content" type="text" name="content" placeholder="Content">
                                <button class="post-sets" type="submit" name="submit">POST</button>
                            </form>
                        </div>
                    </div>';
        }else{
            echo '<h2>Personal Posts</h2>
                    <div class="user-sets">
                         <div class="post-sections">
                            <div class="info">
                                <img class="avatar" src="statics/default-user-image-2.png" alt="avatar">
                                <div class="center">
                                    <p class="user-name">'.$_SESSION['u_uid'].'</p>
                                </div>
                            </div>
                            <form action="includes/post.inc.php" method="post">
                                <input class="subject" type="text" name="subject" placeholder="Subject">
                                <input class="content" type="text" name="content" placeholder="Content">
                                <button class="post-sets" type="submit" name="submit">POST</button>
                            </form>
                        </div>
                    </div>';
        }
        ?>
    </div>
</section>
<?php
include_once 'footer.php';
?>
