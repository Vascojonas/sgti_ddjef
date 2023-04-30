
	$(document).on('submit', '#form-funcionario', function (e) {
		e.preventDefault();
		
		let nome = $('#nome').val();
		let apelido = $('#apelido').val();
		let telefone = $('#telefone').val();
		let email = $('#email').val();
		let tipo_doc = $('#tipo_doc').val();
		let numero_doc = $('#numero_doc').val();
		let cargo = $('#cargo').val();
		

		Swal.fire({
			title:  "Pronto para salvar?",
			icon: 'question',
			showCancelButton: true,
			confirmButtonColor: '#3085d6',
			cancelButtonColor: '#d33',
			confirmButtonText: 'Sim'
		  }).then((result) => {
			if (result.isConfirmed) {


				$.ajax({
					url: "/funcionarios/salvar",
					type: 'POST',
					dataType: "JSON",
					data: {nome,apelido,telefone,email,tipo_doc,numero_doc,cargo},
					
					success: function (data) {
						console.log(data)
						
						if(data.status==200){
							Swal.fire({
							text:  data.message,
							icon: 'success',
							showCancelButton: false,
							confirmButtonColor: '#3085d6',
							cancelButtonColor: '#d33',
							confirmButtonText: 'Ok'
						  }).then(()=>{
							  location.reload();
						  })
						}else{
							if(data.errorValidation)
							  setErrorValidation(data.errorValidation);
						}
					},
					error: function (response) {
						console.log(response)

						Swal.fire({
							text:  "Ocorreu um erro no processo de Salvar!",
							icon: 'error',
							showCancelButton: false,
							confirmButtonColor: '#3085d6',
							cancelButtonColor: '#d33',
							confirmButtonText: 'Ok'
						  })
					}
				})

			}
		  })
		
	})
	
	
	function actualizarFuncionario(e){
		e.preventDefault();
		
		let id = $('#id').val();
		let nome = $('#nome').val();
		let apelido = $('#apelido').val();
		let telefone = $('#telefone').val();
		let email = $('#email').val();
		let tipo_doc = $('#tipo_doc').val();
		let numero_doc = $('#numero_doc').val();
		let cargo = $('#cargo').val();
		

		Swal.fire({
			title:  "Desejas actualizar os dados?",
			icon: 'question',
			showCancelButton: true,
			confirmButtonColor: '#3085d6',
			cancelButtonColor: '#d33',
			confirmButtonText: 'Sim'
		  }).then((result) => {
			if (result.isConfirmed) {


				$.ajax({
					url: "/funcionarios/actualizar",
					type: 'POST',
					dataType: "JSON",
					data: {id,nome,apelido,telefone,email,tipo_doc,numero_doc,cargo},
					
					success: function (data) {
						console.log(data)
						
						if(data.status==200){
							Swal.fire({
							text:  data.message,
							icon: 'success',
							showCancelButton: false,
							confirmButtonColor: '#3085d6',
							cancelButtonColor: '#d33',
							confirmButtonText: 'Ok'
						  })
						}else{
							if(data.errorValidation)
							  setErrorValidation(data.errorValidation);
						}
					},
					error: function (response) {
						console.log(response)

						Swal.fire({
							text:  "Ocorreu um erro no processo de actualizar os dados!",
							icon: 'error',
							showCancelButton: false,
							confirmButtonColor: '#3085d6',
							cancelButtonColor: '#d33',
							confirmButtonText: 'Ok'
						  })
					}
				})

			}
		  })
	}
	
	
	function deletarFuncionario(event,id){
		
		console.log(event.target)
		
		Swal.fire({
			title:  "Eliminar usuário?",
			icon: 'question',
			showCancelButton: true,
			confirmButtonColor: '#3085d6',
			cancelButtonColor: '#d33',
			confirmButtonText: 'Sim'
		  }).then((result) => {
			if (result.isConfirmed) {


				$.ajax({
					url: "/funcionarios/deletar",
					type: 'delete',
					dataType: "JSON",
					data: {id},
					
					success: function (data) {
						console.log(data)
						
						if(data.status==200){
							Swal.fire({
							text:  data.message,
							icon: 'success',
							showCancelButton: false,
							confirmButtonColor: '#3085d6',
							cancelButtonColor: '#d33',
							confirmButtonText: 'Ok'
						  }).then(()=>{
								location.reload();	
						  })
						}
					},
					error: function (response) {
						console.log(response)

						Swal.fire({
							text:  "Ocorreu um erro no processo de actualizar os dados!",
							icon: 'error',
							showCancelButton: false,
							confirmButtonColor: '#3085d6',
							cancelButtonColor: '#d33',
							confirmButtonText: 'Ok'
						  })
					}
				})

			}
		  })
	}