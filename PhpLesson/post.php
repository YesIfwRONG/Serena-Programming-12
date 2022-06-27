<?php
include_once 'header.php';
?>
<section class="main-container">
    <div class="main-wrapper">
        <?php

        if (!isset($_SESSION['u_uid'])) {
            echo '<h2>General Posts</h2>';
            include_once 'post-section.php';

        }else{
            echo '<h2>Personal Posts</h2>';
            include_once 'post-section-p.php';
        }
        ?>
    </div>
</section>
<?php
include_once 'footer.php';
?>
