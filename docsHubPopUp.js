let ytVideo;
let player;

function openRightVideo(n) {
    switch (n) {
        case 1:
            ytVideo = document.getElementById("videoOne")
            player = document.getElementById("playerOne")
            break;
        case 2:
            ytVideo = document.getElementById("videoTwo")
            player = document.getElementById("playerTwo")
            break;
        case 3:
            ytVideo = document.getElementById("videoThree")
            player = document.getElementById("playerThree")
            break;
        case 4:
            ytVideo = document.getElementById("videoFour")
            player = document.getElementById("playerFour")
            break;
    }

    openYtVideo();
}

function openYtVideo() {
    ytVideo.classList.add("openYtVideo");
}

function closeYtVideo() {
    ytVideo.classList.remove("openYtVideo");
    player.pauseVideo();
}