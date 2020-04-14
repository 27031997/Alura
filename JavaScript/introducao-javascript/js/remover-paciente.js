var pacientes = document.querySelectorAll(".paciente");

var tabela = document.querySelector("table");

tabela.addEventListener("dblclick", function(event){

    if (event.target.tagName == 'TD') {
    	event.target.parentNode.classList.add("fadeOut");

        setTimeout(function(){
        	event.target.parentNode.remove();
		}, 500);
    }

	/*var alvoEvento = event.target;
	var paiDoAlvo = alvoEvento.parentNode;
	paiDoAlvo.remove();*/ //Faz o mesmo que o de cima porém em uma linha só
	 
});
 

 /*pacientes.forEach(function(paciente){

		paciente.addEventListener("dblclick", function(){
			console.log("Duplo click");
			this.remove();
		});

	});*/

