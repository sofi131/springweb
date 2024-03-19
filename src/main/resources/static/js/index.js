window.onload = () => {
    document.getElementById("btnPedirDatos").onclick = () => {
        let url= location.href + "api/pedirdatos";
        fetch(url)
            .then(datos => datos.json())
            .then(datos=>{
                console.log(datos);
            })

    }
}