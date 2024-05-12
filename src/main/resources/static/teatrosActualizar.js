function editarTeatro(){

    var table = document.getElementById("tabla_teatro");

    for(var i = 1; i < table.ariaRowSpan.length; i++){
        table.rows[i].onclick = function(){
            document.getElementById("idteatro").value = this.cells[0].innerHTML;
            document.getElementById("nombre").value = this.cells[1].innerHTML;
            document.getElementById("presentacion").value = this.cells[2].innerHTML;
        };
    }
}
