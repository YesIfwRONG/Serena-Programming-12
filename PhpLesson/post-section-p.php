<div class="user-sets">
    <p class="new-post">Post Here</p>
    <div class="post-sections">
        <div class="info">
            <img class="avatar" src="statics/default-user-image-2.png" alt="avatar">
            <div class="center">
                <?php
                    echo '<p class="user-name">'.$_SESSION['u_uid'].'</p>';
                ?>
            </div>
        </div>
        <form class="post-body" action="includes/post.inc.php" method="post">
            <input class="subject" type="text" name="subject" placeholder="Subject">
            <input class="content" type="text" name="content" placeholder="Content">
            <button class="post-sets" type="submit" name="submit">POST</button>
        </form>
    </div>

    <p class="new-post">History Posts</p>
        <?php
        include_once 'includes/dbh.inc.php';
        $uid = $_SESSION['u_uid'];
        $sql = "SELECT subject, content, user_uid, date FROM post WHERE user_uid='$uid'";
        $result = mysqli_query($conn, $sql);
        if (mysqli_num_rows($result) > 0) {
            while ($row = mysqli_fetch_assoc($result)) {
                echo ' <div class="post-sections">
                            <div class="info">
                                <img class="avatar" src="statics/default-user-image-2.png" alt="avatar">
                                <div class="center">
                                    <p class="user-name">' . $row["user_uid"] . '</p>
                                </div>
                                <div id="time" class="center">
                                    <p>' . $row["date"] . '</p>
                                </div>
                            </div>
                            <div>
                                <div class="subject">
                                    <p>' . $row["subject"] . '</p>
                                </div>
                                <div class="content">
                                    <p>' . $row["content"] . '</p>
                                </div>
                            </div>
                        </div>';
            }
        }
        ?>
</div>
