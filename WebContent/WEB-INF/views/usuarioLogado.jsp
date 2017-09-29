<%@ include file="/WEB-INF/views/cabecalho.jsp"%>
<div class="container">
	<div class="row">
		<div class="col-md-12" style="padding-top: 150px">
			<div class="well well-sm">
				<div class="row">
					<div class="col-sm-6 col-md-4">
						<img src="image/${usuario.nomeImagem}"
							class="img-rounded img-responsive" />
					</div>
					<div class="col-sm-6 col-md-8">
						<h4>${usuario.nome}</h4>
						<p>
							<i class="glyphicon glyphicon-envelope"></i>${usuario.email}

						</p>
						<!-- Split button -->
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/views/rodape.jsp"%>
