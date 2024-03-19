window.onload = () => {
    document.getElementById("btnPedirDatos").onclick = () => {
        let url = location.href + "api/pedirdatos";
        fetch(url)
            .then(datos => datos.json())
            .then(datos => {
                for (let i = 0; i < datos.length; i++) {
                    console.log(datos[i]);
                }
            })
    }
}