<div class="user-sets">
    <p class="new-post">Old Posts</p>
<?php
include_once 'includes/dbh.inc.php';
$sql = "SELECT subject, content, user_uid, date FROM post";
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
