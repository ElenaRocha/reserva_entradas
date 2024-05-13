function editarPase(){

    var table = document.getElementById("tabla_pase");

    for(var i = 1; i < table.ariaRowSpan.length; i++){
        table.rows[i].onclick = function(){
            document.getElementById("idpaseAct").value = this.cells[0].innerHTML;
            document.getElementById("diaAct").value = this.cells[1].innerHTML;
            document.getElementById("horaAct").value = this.cells[2].innerHTML;
            document.getElementById("precioAct").value = this.cells[3].innerHTML;
            document.getElementById("obraAct").value = this.cells[4].innerHTML;
        };
    }
}

function eliminarPase(){

    var table = document.getElementById("tabla_pase");

    for(var i = 1; i < table.ariaRowSpan.length; i++){
        table.rows[i].onclick = function(){
            document.getElementById("idpaseElm").value = this.cells[0].innerHTML;
            document.getElementById("diaElm").value = this.cells[1].innerHTML;
            document.getElementById("horaElm").value = this.cells[2].innerHTML;
            document.getElementById("precioElm").value = this.cells[3].innerHTML;
            document.getElementById("obraElm").value = this.cells[4].innerHTML;
        };
    }
}
