$('.toastsDefaultDanger').click(function() {
    $(document).Toasts('create', {
        class: 'bg-danger',
        title: 'Toast Title',
        subtitle: 'Subtitle',
        body: 'Erro ao cadastrar'
    })
});
$('.toastsDefaultSuccess').click(function() {
    $(document).Toasts('create', {
        class: 'bg-success',
        title: 'Toast Title',
        subtitle: 'Subtitle',
        body: 'Cadastrado com sucesso'
    })
});