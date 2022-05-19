var i = 0;
var j = 0;
var q = 0;
var a = 0;
var b = 0;
var c = 0;
var txt1 = 'Sora is an eighteen-year-old male who excels at strategies and cold readings while his eleven-year-old stepsister, Shiro, excels at calculations and logic.  ';
var txt2 = 'Together, the two form the undefeated gaming identity Blank (空白, Kūhaku, stylized as『　　』) due to their trademark of using only spaces as their in-game names. After their parents died, the two no longer had emotional ties to society and eventually became agoraphobic and hikikomori. When the two are separated from each other, they begin to suffer panic attacks. ';
var txt3 = 'After Sora and Shiro are summoned to Disboard, they decide to uphold their undefeated reputation as Blank by defeating Tet. Sora is voiced by Yoshitsugu Matsuoka and Shiro by Ai Kayano. In Sentai Filmworks\' English localization, Sora and Shiro are dubbed by Scott Gibbs and Caitlynn French respectively. ';
var txt4 = "In the present, Izuna and Tet play a game of chess on which they have wagered food. As they begin their next game, Tet decides to tell her the story of how the world came to be in its current state.";
var txt5 = "The tale begins 6000 years in the past, during the Great War, a worldwide conflict that pitted the sentient races of the world against each other as the Old Deus fought for control of the Suniaster, a conceptual device which would only reveal itself to the strongest being on the planet and make the holder the One True God. ";
var txt6 = "To that end, the Old Deus and the other races have effectively destroyed the world, and have driven humankind, the only race unable to use the world's magic, to the brink of extinction. ";
var speed = 15; /* The speed/duration of the effect in milliseconds */

window.onload = function() {
    typeWriterSS();
};

var startLoop = setInterval( function() {
    typeWriterSS();
},speed);


function typeWriterSS() {
    if (i < txt1.length) {
        document.getElementById("plot1").innerHTML += txt1.charAt(i);
        i++;
    }
    if (j < txt2.length) {
        document.getElementById("plot2").innerHTML += txt2.charAt(j);
        j++;
    }
    if (q < txt3.length) {
        document.getElementById("plot3").innerHTML += txt3.charAt(q);
        q++;
    }

}

function typeWriterRS() {
    if (a < txt4.length) {
        document.getElementById("plot1").innerHTML += txt4.charAt(a);
        i++;
        setTimeout(typeWriter, speed);
    }
    if (b < txt5.length) {
        document.getElementById("plot2").innerHTML += txt5.charAt(b);
        j++;
        setTimeout(typeWriter, speed);
    }
    if (c < txt6.length) {
        document.getElementById("plot3").innerHTML += txt6.charAt(c);
        q++;
        setTimeout(typeWriter, speed);
    }

}