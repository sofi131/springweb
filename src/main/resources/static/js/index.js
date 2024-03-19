window.onload = () => {
    document.getElementById("btnPedirDatos").onclick = () => {
        let url = location.href + "api/pedirdatos";
        fetch(url)
            .then(datos => datos.text())
            .then(datos => {
                console.log(datos);
            })
    }
}