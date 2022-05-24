var i = 0;
var txt1 = "No Game No Life";


window.onload = function() {
    delay(1000).then(typeWriter());
};

function delay(time) {
    return new Promise(resolve => setTimeout(resolve, time));
}

var startLoop = setInterval( function() {
    typeWriter();
},15);


function typeWriter() {
    if (i < txt1.length) {
        document.getElementById("title").innerHTML += txt1.charAt(i);
        i++;
    }

}