$('#form-login').submit(function(e) {
    e.preventDefault();
    // 
    dados = $('#form-login').serialize();

    $.ajax({
        type: "post",
        url: "start.php",
        data: dados,
        dataType: "json",
        beforeSend: function() {
            $('.alert-danger').addClass('d-none fw-bolder')
        },
        success: function(resp) {
            if (resp.status == 200) {
                alert(resp.status)
                window.location.href = 'menu.php'

            } else if (resp.status == 202) {
                $('.alert-danger').removeClass('d-none')
                $('.alert-danger').text(resp.mensagem)
            } else {
                $('.alert-danger').removeClass('d-none')
                $('.alert-danger').text(resp.mensagem)
            }

        },
        error: function(erros) {
            $('.alert-danger').removeClass('d-none')
            $('.alert-danger').text(erros.responseText)
        }
    });

});