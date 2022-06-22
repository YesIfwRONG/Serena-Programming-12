<?php
include_once 'header.php';
?>
<section class="main-container">
    <div class="main-wrapper">
        <h2>Home Page</h2>
        <?php
        if (!isset($_SESSION['u_uid'])) {
            echo '<div class="user-sets">
                        <iframe width="98%" height="49.9%" src="https://www.youtube.com/embed/r2IS8TyIDwk?autoplay=1&mute=1"></iframe>
                        <h3>This is a place to record your own dream. </h3>
                  </div>';
        }else{
            echo '<div class="user-sets">'.
                '<img class="avatar" src="statics/default-user-image-2.png" alt="avatar">'.
                '<p class="user-name">'.$_SESSION['u_uid'].'</p><br><div><p>About</p><p>There is nothing here. </p></div>'.
                '</div>';
        }
        ?>
    </div>
</section>
<?php
include_once 'footer.php';
?>
