<%@include file="/WEB-INF/views/cabecalho.jsp"%>
<div class="container">
	<div class="row" style="padding-top: 150px">
		<div class="col-md-6 col-md-offset-3">
			<div class="panel panel-login">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-6">
							<a href="#" class="active" id="login-form-link">Login</a>
						</div>
						<div class="col-xs-6">
							<a href="#" id="register-form-link">Registrar</a>
						</div>
					</div>
					<hr>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-12">
							<form id="login-form" action="https://phpoll.com/login/process"
								method="post" role="form" style="display: block;">
								<div class="form-group">
									<input type="text" name="email" id="email" tabindex="1"
										class="form-control" placeholder="E-mail" value="">
								</div>
								<div class="form-group">
									<input type="password" name="senha" id="senha" tabindex="2"
										class="form-control" placeholder="Senha">
								</div>
								<div class="form-group">
									<div class="row">
										<div class="col-sm-6 col-sm-offset-3">
											<input type="submit" name="login-submit" id="login-submit"
												tabindex="4" class="form-control btn btn-login"
												value="Log In">
										</div>
									</div>
								</div>
							</form>
							<form:form id="register-form"
								action="${s:mvcUrl('UC#registrar').build()}" method="post"
								role="form" style="display: none;" commandName="usuario"
								enctype="multipart/form-data">
								<div class="form-group">
									<input type="text" name="nome" id="nome" tabindex="1"
										class="form-control" placeholder="Nome">
								</div>
								<div class="form-group">
									<input type="email" name="email" id="email" tabindex="1"
										class="form-control" placeholder="E-mail">
								</div>
								<div class="form-group">
									<input type="password" name="senha" id="senha" tabindex="2"
										class="form-control" placeholder="Senha">
								</div>
								<div>
									<label for="imagem">Imagem perfil: </label> <input type="file"
										name="imagem" multiple="multiple" />
								</div>

								<div class="form-group">
									<div class="row">
										<div class="col-sm-6 col-sm-offset-3">
											<input type="submit" name="register-submit"
												id="register-submit" tabindex="4"
												class="form-control btn btn-register" value="Registrar">
										</div>
									</div>
								</div>
							</form:form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<%@include file="/WEB-INF/views/rodape.jsp"%>
