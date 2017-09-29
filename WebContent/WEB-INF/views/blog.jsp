<%@include file="/WEB-INF/views/cabecalho.jsp"%>
<div class="container formulario-cadastro-usuario">
	<form:form action="${s:mvcUrl('BC#enviaMensagem').build()}"
		commandName="blog" method="post">
		<div class="form-group">
			<label for="titulo">Título:</label> <input type="text"
				class="form-control" id="titulo" name="titulo" placeholder="Título">
		</div>
		<div class="form-group">
			<label for="textarea">Mensagem:</label>
			<textarea class="form-control" id="textarea" name="mensagem"
				placeholder="Mensagem para o blog" rows="8"></textarea>
		</div>

		<button type="submit" class="btn btn-success">Enviar</button>
	</form:form>

	<c:if test="${not empty lista}">
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
