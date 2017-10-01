<%@ include file="/WEB-INF/views/cabecalho.jsp"%>
<div class="modal-dialog" style="margin-top: 10%">
	<div class="modal-content">
		<div class="modal-header">
			<h3 class="text-center">Área administrativa!</h3>
			<p style="color: red;font-weight:bold">${mensagem}</p>
		</div>
		<form id="login-form" action="${s:mvcUrl('AC#loginAdmin').build()}"
			method="post" role="form" style="display: block;">
			<div class="modal-body">
				<div class="form-group">
					<input type="text" class="form-control input-lg"
						placeholder="E-mail" name="email" required="required" />
				</div>

				<div class="form-group">
					<input type="password" class="form-control input-lg"
						placeholder="Senha" name="senha" required="required"/>
				</div>

				<div class="form-group">
					<input type="submit" class="btn btn-block btn-lg btn-primary"
						value="Login" />
				</div>
			</div>
		</form>
	</div>
</div>
<%@ include file="/WEB-INF/views/rodape.jsp"%>
