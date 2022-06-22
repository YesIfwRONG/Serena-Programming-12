<?php
include_once 'header.php';
?>
<section class="main-container">
    <div class="main-wrapper">
        <h2>Personal Posts</h2>
        <?php
        if (!isset($_SESSION['u_uid'])) {
            echo '<div class="user-sets">
                     <div class="post-sections">
                        <div class="info">
                            <img class="avatar" src="statics/default-user-image-2.png" alt="avatar">
                            <p class="user-name">12345</p>
                        </div>
                        <form action="includes/post.inc.php">
                            <input class="subject" type="text" name="subject" placeholder="Subject">
                            <input class="content" type="text" name="content" placeholder="Content">
                            <button class="post-sets" type="submit" name="submit">POST</button>
                        </form>
                    </div>
                </div>';
        }else{
            echo '<div class="user-sets">'.
                '<img class="avatar" src="statics/default-user-image-2.png" alt="avatar">'.
                '<p class="user-name">'.$_SESSION['u_uid'].'</p>'.'<div class="post-sets" action="includes/post.inc.php" method="POST">POST</div>'.
                '</div>';
        }
        ?>
    </div>
</section>
<?php
include_once 'footer.php';
?>
