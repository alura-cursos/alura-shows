<%@ include file="/WEB-INF/views/cabecalho.jsp"%>
<div class="container">
	<div class="row" style="margin-top:10%" >
		<h1 style="margin-bottom:20px">Perfil usuário!</h1>
		<div class="col-md-4" style="padding-left: 0 !important">
			<img src="<c:url value="/image/${usuario.nomeImagem}"/>" class="img-responsive" style="height:380px; padding-left: 0 !important" />
		</div>
		<div class="col-md-8">
			<h4>${usuario.nome}</h4>
			<hr>
			<p>
				<i class="glyphicon glyphicon-envelope"></i> ${usuario.email}
			</p>
			<hr>
		</div>

	<form action="${s:mvcUrl('UC#logout').build()}">
		<button type="submit" class="btn btn-primary pull-left" >Logout</button>
	</form>

	</div>
</div>
<%@ include file="/WEB-INF/views/rodape.jsp"%>
