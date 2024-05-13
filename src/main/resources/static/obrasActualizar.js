function editarObra(){

    var table = document.getElementById("tabla_obra");

    for(var i = 1; i < table.ariaRowSpan.length; i++){
        table.rows[i].onclick = function(){
            document.getElementById("idobraAct").value = this.cells[0].innerHTML;
            document.getElementById("tituloAct").value = this.cells[1].innerHTML;
            document.getElementById("autorAct").value = this.cells[2].innerHTML;
            document.getElementById("sinopsisAct").value = this.cells[3].innerHTML;
            document.getElementById("duracion_minAct").value = this.cells[4].innerHTML;
            document.getElementById("teatroAct").value = this.cells[5].innerHTML;
        };
    }
}

function eliminarObra(){

    var table = document.getElementById("tabla_obra");

    for(var i = 1; i < table.ariaRowSpan.length; i++){
        table.rows[i].onclick = function(){
            document.getElementById("idobraElm").value = this.cells[0].innerHTML;
            document.getElementById("tituloElm").value = this.cells[1].innerHTML;
            document.getElementById("autorElm").value = this.cells[2].innerHTML;
            document.getElementById("sinopsisElm").value = this.cells[3].innerHTML;
            document.getElementById("duracion_minElm").value = this.cells[4].innerHTML;
            document.getElementById("teatroElm").value = this.cells[5].innerHTML;
        };
    }
}
