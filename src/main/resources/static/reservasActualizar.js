function editarReserva(){

    var table = document.getElementById("tabla_reserva");

    for(var i = 1; i < table.ariaRowSpan.length; i++){
        table.rows[i].onclick = function(){
            document.getElementById("idreserva").value = this.cells[0].innerHTML;
            document.getElementById("time_stamp").value = this.cells[1].innerHTML;
            document.getElementById("usuario").value = this.cells[2].innerHTML;
            document.getElementById("pase").value = this.cells[3].innerHTML;
        };
    }
}
