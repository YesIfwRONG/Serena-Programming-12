<?php
include_once 'header.php';
?>
<section class="main-container">
    <div class="main-wrapper">
        <h2>Home Page</h2>
        <?php
        if (isset($_SESSION['u_id'])) {
            echo $_SESSION['u_id'];
        }
        ?>
    </div>
</section>
<?php
include_once 'footer.php';
?>
