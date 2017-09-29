<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/cabecalho.jsp"%> 
<div id="myCarousel" class="carousel slide" data-ride="carousel">
	<h1 class="alura-show element"></h1>
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
	</ol>
	<div class="carousel-inner" role="listbox">
		<div class="item active">
			<img class="second-slide"
				src='<c:url value="/image/banda_1.jpg"/>'>

		</div>
		<div class="item">
			<img class="second-slide"
				src='<c:url value="/image/banda_2.jpg"/>'>
		</div>
		<div class="item">
			<img class="third-slide"
				src='<c:url value="/image/banda_3.jpg"/>'
				alt="Third slide">

		</div>
	</div>
</div>

<div class="container marketing">

	<div class="row">
		<div class="col-lg-4">
			<img class="img-circle"
				src="<c:url value="/image/banda_1.jpg"/>"
				alt="Generic placeholder image" width="140" height="140">
			<h2>The Wiz</h2>
			<p>Donec sed odio dui. Etiam porta sem malesuada magna mollis
				euismod. Nullam id dolor id nibh ultricies vehicula ut id elit.
				Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
				Praesent commodo cursus magna.</p>
			<p>
				<a class="btn btn-default" href="#" role="button">Detalhes
					&raquo;</a>
			</p>
		</div>
		<!-- /.col-lg-4 -->
		<div class="col-lg-4">
			<img class="img-circle"
				src='<c:url value="/image/banda_2.jpg" />'
				alt="Generic placeholder image" width="140" height="140">
			<h2>The Lixiers</h2>
			<p>Duis mollis, est non commodo luctus, nisi erat porttitor
				ligula, eget lacinia odio sem nec elit. Cras mattis consectetur
				purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo,
				tortor mauris condimentum nibh.</p>
			<p>
				<a class="btn btn-default" href="#" role="button">Detalhes
					&raquo;</a>
			</p>
		</div>

		<div class="col-lg-4">
			<img class="img-circle"
				src="<c:url value="/image/banda_3.jpg" />"
				alt="Generic placeholder image" width="140" height="140">
			<h2>The Azzwas</h2>
			<p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in,
				egestas eget quam. Vestibulum id ligula porta felis euismod semper.
				Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum
				nibh, ut fermentum massa justo sit amet risus.</p>
			<p>
				<a class="btn btn-default" href="#" role="button">Detalhes
					&raquo;</a>
			</p>
		</div>

	</div>

	<hr class="featurette-divider">

	<div class="row featurette">
		<div class="col-md-7">
			<h2 class="featurette-heading">The Wiz</h2>
			<p class="lead">Donec ullamcorper nulla non metus auctor
				fringilla. Vestibulum id ligula porta felis euismod semper. Praesent
				commodo cursus magna, vel scelerisque nisl consectetur. Fusce
				dapibus, tellus ac cursus commodo.</p>
		</div>
		<div class="col-md-5">
			<img class="featurette-image img-responsive center-block"
				src="<c:url value="/image/banda_1.jpg"/>"
				alt="Generic placeholder image">
		</div>
	</div>

	<hr class="featurette-divider">

	<div class="row featurette">
		<div class="col-md-7 col-md-push-5">
			<h2 class="featurette-heading">
				The Lixiers</h2>
				<p class="lead">Donec ullamcorper nulla non metus auctor
					fringilla. Vestibulum id ligula porta felis euismod semper.
					Praesent commodo cursus magna, vel scelerisque nisl consectetur.
					Fusce dapibus, tellus ac cursus commodo.</p>
		</div>
		<div class="col-md-5 col-md-pull-7">
			<img class="featurette-image img-responsive center-block"
				src="<c:url value="/image/banda_2.jpg" />"
				alt="Generic placeholder image">
		</div>
	</div>

	<hr class="featurette-divider">

	<div class="row featurette">
		<div class="col-md-7">
			<h2 class="featurette-heading">
				The Azzwas</h2>
				<p class="lead">Donec ullamcorper nulla non metus auctor
					fringilla. Vestibulum id ligula porta felis euismod semper.
					Praesent commodo cursus magna, vel scelerisque nisl consectetur.
					Fusce dapibus, tellus ac cursus commodo.</p>
		</div>
		<div class="col-md-5">
			<img class="featurette-image img-responsive center-block"
				src="<c:url value="/image/banda_3.jpg" />"
				alt="Generic placeholder image">
		</div>
	</div>

	<hr class="featurette-divider">

</div>
<%@include file="/WEB-INF/views/rodape.jsp"%>