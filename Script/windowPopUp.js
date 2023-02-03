var blur = document.getElementById("container");
let doc;

function openRightDoc(n) {
    switch (n) {
        case 1:
            doc = document.getElementById("videoOne")
            break;
        case 2:
            doc = document.getElementById("videoTwo")
            break;
        case 3:
            doc = document.getElementById("videoThree")
            break;
        case 4:
            doc = document.getElementById("videoFour")
            break;
        case 5:
            doc = document.getElementById("pdfOne")
            break;
        case 6:
            doc = document.getElementById("pdfTwo")
            break;
        case 7:
            doc = document.getElementById("pdfThree")
            break;
        case 8:
            doc = document.getElementById("pdfFour")
            break;
        case 9:
            doc = document.getElementById("authentication")

    }

    toggleBackroundBlur();
}

function toggleBackroundBlur() {
    blur.classList.toggle('active');
    doc.classList.toggle('active');
}
