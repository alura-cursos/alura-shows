<%@include file="/WEB-INF/views/cabecalho.jsp"%>
<div class="container formulario-cadastro-usuario">
	<h1>Blog</h1>
	<form:form action="${s:mvcUrl('BC#enviaMensagem').build()}"
		commandName="blog" method="post">
		<div class="form-group">
			<label for="titulo">Título:</label> 
			<input type="text"
				class="form-control" id="titulo" name="titulo" placeholder="Título" required="required">
		</div>
		<div class="form-group">
			<label for="textarea">Mensagem:</label>
			<textarea class="form-control" id="textarea" name="mensagem"
				placeholder="Mensagem para o blog" rows="8" required="required"></textarea>
		</div>

		<button type="submit" class="btn btn-success pull-right">Enviar</button>
	</form:form>

	<c:if test="${not empty lista}">
		<h2 style="margin-top: 10%">Postagens</h2>
		<table class="table">
			<thead>
				<tr>
					<th>Título</th>
					<th>Mensagem</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="blog" items="${lista}">
					<tr>
						<td>${blog.titulo}</td>
						<td>${blog.mensagem}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
</div>
<%@include file="/WEB-INF/views/rodape.jsp"%>
