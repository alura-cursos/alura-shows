<%@ include file="/WEB-INF/views/cabecalho.jsp"%>
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Admin Alura Shows!</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#">Dashboard</a></li>
				<li><a href="#">Configurações perfil</a></li>
				<li><a href="#">Perfil</a></li>
			</ul>
			<form class="navbar-form navbar-right">
				<input type="text" class="form-control" placeholder="Procurar...">
			</form>
		</div>
	</div>
</nav>

<div class="container-fluid" style="margin-top: 100px">
	<div class="row">
		<div class="col-sm-3 col-md-2 sidebar">
			<ul class="nav nav-sidebar">
				<li class="active"><a href="#">Overview <span
						class="sr-only">(current)</span></a></li>
				<li><a href="#">Relatórios</a></li>
				<li><a href="#">Analytics</a></li>
				<li><a href="#">Exportar arquivo</a></li>
				<li><a href="#">Cadastrar banda</a></li>
				<li><a href="#">Cadastrar músico</a></li>
				<li><a href="#">Visualizar clientes</a></li>
			</ul>
		</div>
		<div class="col-sm-6 col-md-10 main">
			<h1 class="page-header" style="margin: 0 0 20px !important">Painél administrativo</h1>

			<div class="row placeholders">
				<div class="col-xs-6 col-sm-3 placeholder">
					<img
						src="<c:url value="/image/banda_1.jpg"/>"
						width="200" height="200" class="img-responsive"
						alt="Generic placeholder thumbnail">
					<h4>The Wiz</h4>
					<span class="text-muted">São Paulo - SP</span>
				</div>
				<div class="col-xs-6 col-sm-3 placeholder">
					<img
						src="<c:url value="/image/banda_2.jpg"/>"
						width="200" height="200" class="img-responsive"
						alt="Generic placeholder thumbnail">
					<h4>The Lixiers</h4>
					<span class="text-muted">Salvador - BA</span>
				</div>
				<div class="col-xs-6 col-sm-3 placeholder">
					<img
						src="<c:url value="/image/banda_3.jpg"/>"
						width="200" height="200" class="img-responsive"
						alt="Generic placeholder thumbnail">
					<h4>The Azzwas</h4>
					<span class="text-muted">Manaus - AM</span>
				</div>
				<div class="col-xs-6 col-sm-3 placeholder">
					<img
						src="<c:url value="/image/banda_4.jpg"/>"
						width="200" height="200" class="img-responsive"
						alt="Generic placeholder thumbnail">
					<h4>The Iouzias</h4>
					<span class="text-muted">Cuiabá - MS</span>
				</div>
			</div>
			<hr>
			<h2 class="sub-header">Próximos shows</h2>
			<div class="table-responsive">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Data</th>
							<th>Banda</th>
							<th>Local</th>
							<th>Valor Ingresso</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>5/10/2017</td>
							<td>The Wiz</td>
							<td>São Paulo - SP</td>
							<td>R$ 200,00</td>
						</tr>
						<tr>
							<td>12/10/2017</td>
							<td>The Lixiers</td>
							<td>Salvador - BA</td>
							<td>R$ 250,00</td>
						</tr>	
						<tr>
							<td>15/10/2017</td>
							<td>The Azzwas</td>
							<td>Manaus - AM</td>
							<td>R$ 120,00</td>
						</tr>		
						<tr>
							<td>19/10/2017</td>
							<td>The Iouzias</td>
							<td>Cuiabá - MS</td>
							<td>R$ 170,00</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/views/rodape.jsp"%>