function editarReserva(){

    var table = document.getElementById("tabla_reserva");

    for(var i = 1; i < table.ariaRowSpan.length; i++){
        table.rows[i].onclick = function(){
            document.getElementById("idreservaAct").value = this.cells[0].innerHTML;
            document.getElementById("time_stampAct").value = this.cells[1].innerHTML;
            document.getElementById("usuarioAct").value = this.cells[2].innerHTML;
            document.getElementById("paseAct").value = this.cells[3].innerHTML;
        };
    }
}

function eliminarReserva(){

    var table = document.getElementById("tabla_reserva");

    for(var i = 1; i < table.ariaRowSpan.length; i++){
        table.rows[i].onclick = function(){
            document.getElementById("idreservaElm").value = this.cells[0].innerHTML;
            document.getElementById("time_stampElm").value = this.cells[1].innerHTML;
            document.getElementById("usuarioElm").value = this.cells[2].innerHTML;
            document.getElementById("paseElm").value = this.cells[3].innerHTML;
        };
    }
}
