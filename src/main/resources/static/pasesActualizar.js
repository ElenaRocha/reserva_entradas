function seleccionarModificarPase(){

    var table = document.getElementById("tabla_pase");

    for(var i = 1; i < table.ariaRowSpan.length; i++){
        table.rows[i].onclick = function(){
            document.getElementById("idpase").value = this.cells[0].innerHTML;
            document.getElementById("dia").value = this.cells[1].innerHTML;
            document.getElementById("hora").value = this.cells[2].innerHTML;
            document.getElementById("precio").value = this.cells[3].innerHTML;
            document.getElementById("obra").value = this.cells[4].innerHTML;
        };
    }
}
