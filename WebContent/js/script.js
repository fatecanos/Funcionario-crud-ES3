(function () {
    $('#moveDireita').click(function (e) {
        var selectedOpts = $('#listaEsquerda option:selected');
        if (selectedOpts.length == 0) {
            e.preventDefault();
        }
        $(selectedOpts).addClass('selecione');
        $('#listaDireita').append($(selectedOpts).clone());
        $(selectedOpts).remove();
        e.preventDefault();
    });
    $('#moveTudoDireita').click(function (e) {
        var selectedOpts = $('#listaEsquerda option');
        if (selectedOpts.length == 0) {
            e.preventDefault();
        }
        $(selectedOpts).addClass('selecione');
        $('#listaDireita').append($(selectedOpts).clone());
        $(selectedOpts).remove();
        e.preventDefault();
    });
    $('#moveEsquerda').click(function (e) {
        var selectedOpts = $('#listaDireita option:selected');
        if (selectedOpts.length == 0) {
            e.preventDefault();
        }
   	 	$(selectedOpts).removeClass('selecione');
        $('#listaEsquerda').append($(selectedOpts).clone());
        $(selectedOpts).remove();
        e.preventDefault();
    });
    $('#moveTudoEsquerda').click(function (e) {
        var selectedOpts = $('#listaDireita option');
        if (selectedOpts.length == 0) {
            e.preventDefault();
        }
        $(selectedOpts).removeClass('selecione');
        $('#listaEsquerda').append($(selectedOpts).clone());
        $(selectedOpts).remove();
        e.preventDefault();
    });
}(jQuery));

function selecionaTodos() {
	const options = document.getElementById("listaEsquerda").getElementsByTagName("option");
	
	Array.from(options).forEach(e => e.setAttribute('selected', true));
}