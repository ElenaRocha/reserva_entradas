function editarUsuario(){

    var table = document.getElementById("tabla_usuario");

    for(var i = 1; i < table.ariaRowSpan.length; i++){
        table.rows[i].onclick = function(){
            document.getElementById("idusuarioAct").value = this.cells[0].innerHTML;
            document.getElementById("emailAct").value = this.cells[1].innerHTML;
            document.getElementById("contrasenaAct").value = this.cells[2].innerHTML;
            document.getElementById("nombreAct").value = this.cells[3].innerHTML;
            document.getElementById("apellido1Act").value = this.cells[4].innerHTML;
            document.getElementById("apellido2Act").value = this.cells[5].innerHTML;
            document.getElementById("telefonoAct").value = this.cells[6].innerHTML;
            document.getElementById("rolAct").value = this.cells[7].innerHTML;
            document.getElementById("teatroAct").value = this.cells[8].innerHTML;
        };
    }
}

function eliminarUsuario(){

    var table = document.getElementById("tabla_usuario");

    for(var i = 1; i < table.ariaRowSpan.length; i++){
        table.rows[i].onclick = function(){
            document.getElementById("idusuarioElm").value = this.cells[0].innerHTML;
            document.getElementById("emailElm").value = this.cells[1].innerHTML;
            document.getElementById("contrasenaElm").value = this.cells[2].innerHTML;
            document.getElementById("nombreElm").value = this.cells[3].innerHTML;
            document.getElementById("apellido1Elm").value = this.cells[4].innerHTML;
            document.getElementById("apellido2Elm").value = this.cells[5].innerHTML;
            document.getElementById("telefonoElm").value = this.cells[6].innerHTML;
            document.getElementById("rolElm").value = this.cells[7].innerHTML;
            document.getElementById("teatroElm").value = this.cells[8].innerHTML;
        };
    }
}
