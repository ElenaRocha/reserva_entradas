function editarObra(){

    var table = document.getElementById("tabla_obra");

    for(var i = 1; i < table.ariaRowSpan.length; i++){
        table.rows[i].onclick = function(){
            document.getElementById("idobra").value = this.cells[0].innerHTML;
            document.getElementById("titulo").value = this.cells[1].innerHTML;
            document.getElementById("autor").value = this.cells[2].innerHTML;
            document.getElementById("sinopsis").value = this.cells[3].innerHTML;
            document.getElementById("duracion_min").value = this.cells[4].innerHTML;
            document.getElementById("teatro").value = this.cells[5].innerHTML;
        };
    }
}
