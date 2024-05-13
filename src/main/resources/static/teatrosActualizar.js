function editarTeatro(){

    var table = document.getElementById("tabla_teatro");

    for(var i = 1; i < table.ariaRowSpan.length; i++){
        table.rows[i].onclick = function(){
            document.getElementById("idteatroAct").value = this.cells[0].innerHTML;
            document.getElementById("nombreAct").value = this.cells[1].innerHTML;
            document.getElementById("presentacionAct").value = this.cells[2].innerHTML;
        };
    }
}

function eliminarTeatro(){

    var table = document.getElementById("tabla_teatro");

    for(var i = 1; i < table.ariaRowSpan.length; i++){
        table.rows[i].onclick = function(){
            document.getElementById("idteatroElm").value = this.cells[0].innerHTML;
            document.getElementById("nombreElm").value = this.cells[1].innerHTML;
            document.getElementById("presentacionElm").value = this.cells[2].innerHTML;
        };
    }
}
