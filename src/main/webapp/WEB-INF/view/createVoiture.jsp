<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
	src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta charset="windows-1256">
<title>Créer un Voiture</title>
</head>
<body>
	<div class="container">
		<div class="card-body">
			<form action="saveVoiture" method="post">
				<div class="form-group">
					<label class="control-label">matricule du voiture :</label> <input
						type="text" name="matriculeVoit" class="form-control" />
				</div>
				<div class="form-group">
					<label class="control-label">Marque Voiture :</label> <input
						type="text" name="marqueVoit" class="form-control" />
				</div>
				<div class="form-group">
					<label class="control-label">Prix Voiture :</label> <input
						type="text" name="prixVoit" class="form-control" />
				</div>
				<div class="form-group">
					<label class="control-label">date création :</label> <input
						type="date" name="date" class="form-control" />
				</div>
				<div>
					<button type="submit" class="btn btn-primary">Ajouter</button>
					<a href="ListeVoitures" class="btn btn-success">Liste Voitures</a>

				</div>
			</form>
		</div>
		${msg} <br /> <br />
	</div>
</body>
</html>