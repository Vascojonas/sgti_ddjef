	function deletarViatura(event,id){
		
		console.log(event.target)
		
		Swal.fire({
			title:  "Eliminar viatura?",
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