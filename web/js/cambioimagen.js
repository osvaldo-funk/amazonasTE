
    /**
     * Array con las imagenes y enlaces que se iran mostrando en la web
     */
    var imagenes=new Array(
        ['img/puerto-chiapas-mexico.jpg','http://www.lawebdelprogramador.com/cursos/'],
        ['img/chichen-itza.jpg','http://www.lawebdelprogramador.com/foros/']
    );
 
    /**
     * Funcion para cambiar la imagen y link
     */
    function rotarImagenes()
    {
        // obtenemos un numero aleatorio entre 0 y la cantidad de imagenes que hay
        var index=Math.floor((Math.random()*imagenes.length));
 
        // cambiamos la imagen y la url
        document.getElementById("imagen2").src=imagenes[index][0];
        document.getElementById("link").href=imagenes[index][1];
    }
 
    /**
     * Función que se ejecuta una vez cargada la página
     */
    onload=function()
    {
        // Cargamos una imagen aleatoria
        rotarImagenes();
 
        // Indicamos que cada 5 segundos cambie la imagen
        setInterval(rotarImagenes,5000);
    }


