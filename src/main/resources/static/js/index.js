window.onload = () => {
    document.getElementById("btnPedirDatos").onclick = () => {

        let url = location.origin + "/api/pedirdatos?dat=34&texto=hola";
        fetch(url)
            .then(datos => datos.json())
            .then(datos => {
                let lista=document.getElementById("lista");
                for (let i = 0; i < datos.length; i++) {
                    let liElement=document.createElement("li");
                    liElement.textContent=datos[i];
                    lista.append(liElement);
                }
            })
    }

    document.getElementById("btnEnviarAlumno").onclick=()=>{
        let url = location.origin + "/api/alumno";
        fetch(url,{
            method:'POST',
            headers:{
                'Content-Type': 'application/json' // Especifica el tipo de contenido como JSON
            },
            body: JSON.stringify(alumno)
        })
            .then(datos=>datos.json())
            .then(datos=>{
                console.log(datos);
            })
            .catch(err=>{
                console.log(err);
            })
    }
}