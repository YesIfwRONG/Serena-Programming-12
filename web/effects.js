var i = 0;
var j = 0;
var q = 0;
var txt1 = 'Sora is an eighteen-year-old male who excels at strategies and cold readings while his eleven-year-old stepsister, Shiro, excels at calculations and logic.  ';
var txt2 = 'Together, the two form the undefeated gaming identity Blank (空白, Kūhaku, stylized as『　　』) due to their trademark of using only spaces as their in-game names. After their parents died, the two no longer had emotional ties to society and eventually became agoraphobic and hikikomori. When the two are separated from each other, they begin to suffer panic attacks. ';
var txt3 = 'After Sora and Shiro are summoned to Disboard, they decide to uphold their undefeated reputation as Blank by defeating Tet. Sora is voiced by Yoshitsugu Matsuoka and Shiro by Ai Kayano. In Sentai Filmworks\' English localization, Sora and Shiro are dubbed by Scott Gibbs and Caitlynn French respectively. ';
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

