var a = 0;
var b = 0;
var c = 0;
var txt1 = "In the present, Izuna and Tet play a game of chess on which they have wagered food. As they begin their next game, Tet decides to tell her the story of how the world came to be in its current state.";
var txt2 = "The tale begins 6000 years in the past, during the Great War, a worldwide conflict that pitted the sentient races of the world against each other as the Old Deus fought for control of the Suniaster, a conceptual device which would only reveal itself to the strongest being on the planet and make the holder the One True God. ";
var txt3 = "To that end, the Old Deus and the other races have effectively destroyed the world, and have driven humankind, the only race unable to use the world's magic, to the brink of extinction. ";
var speed = 15;


window.onload = function() {
    typeWriterRS();
};

var startLoop = setInterval( function() {
    typeWriterRS();
},speed);


function typeWriterRS() {
    if (a < txt1.length) {
        document.getElementById("plot1").innerHTML += txt1.charAt(a);
        a++;
    }
    if (b < txt2.length) {
        document.getElementById("plot2").innerHTML += txt2.charAt(b);
        b++;
    }
    if (c < txt3.length) {
        document.getElementById("plot3").innerHTML += txt3.charAt(c);
        c++;
    }

}