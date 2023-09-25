console.log("Hola a toda la cohorte 2022");

let i = 0;

setInterval(function(){
    console.log(i);
    i++;

    if( i == 5){
        console.log("Forzamos un error");
        let a = 3 + z;
    }
}, 1000);