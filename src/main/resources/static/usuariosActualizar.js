function editarUsuario(){

    var table = document.getElementById("tabla_usuario");

    for(var i = 1; i < table.ariaRowSpan.length; i++){
        table.rows[i].onclick = function(){
            document.getElementById("idusuario").value = this.cells[0].innerHTML;
            document.getElementById("email").value = this.cells[1].innerHTML;
            document.getElementById("contrasena").value = this.cells[2].innerHTML;
            document.getElementById("nombre").value = this.cells[3].innerHTML;
            document.getElementById("apellido1").value = this.cells[4].innerHTML;
            document.getElementById("apellido2").value = this.cells[5].innerHTML;
            document.getElementById("telefono").value = this.cells[6].innerHTML;
            document.getElementById("rol").value = this.cells[7].innerHTML;
            document.getElementById("teatro").value = this.cells[8].innerHTML;
        };
    }
}

function eliminarUsuario(){

    var table = document.getElementById("tabla_usuario");

    for(var i = 1; i < table.ariaRowSpan.length; i++){
        table.rows[i].onclick = function(){
            document.getElementById("idusuario").value = this.cells[0].innerHTML;
            document.getElementById("email").value = this.cells[1].innerHTML;
            document.getElementById("contrasena").value = this.cells[2].innerHTML;
            document.getElementById("nombre").value = this.cells[3].innerHTML;
            document.getElementById("apellido1").value = this.cells[4].innerHTML;
            document.getElementById("apellido2").value = this.cells[5].innerHTML;
            document.getElementById("telefono").value = this.cells[6].innerHTML;
            document.getElementById("rol").value = this.cells[7].innerHTML;
            document.getElementById("teatro").value = this.cells[8].innerHTML;
        };
    }
}
