<%@ page language="java" contentType="text/html; charset=windows-1256"
pageEncoding="windows-1256"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript" src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta charset="windows-1256">
<title>Modifier un Voiture</title>
</head>
<body>
<div class="container">
<div class="card-body">
<form action="updateVoiture" method="post">
<div class="form-group">
<label class="control-label">matricule du Voiture :</label>
<input type="text" name="matriculeVoit" value="${voiture.matriculeVoit}" readonly class="form-control"/>
</div>
<div class="form-group">
<label class="control-label">marqueVoit :</label>
<input type="text" name="marqueVoit" value="${voiture.marqueVoit}" class="form-control"/>
</div>
<div class="form-group">
<label class="control-label">Prix Voiture :</label>
<input type="text" name="prixVoit" value="${voiture.prixVoit}" class="form-control"/>
</div>
<div class="form-group">
<label class="control-label"> Date création :</label>
<fmt:formatDate pattern="yyyy-MM-dd" value="${voiture.dateRelease}" var="formatDate" />
<input type="date" name="date" value="${formatDate}" class="form-control"/>
</div>
<div>
<button type="submit" class="btn btn-primary">Modifier</button>
<a href="ListeVoitures" class="btn btn-success">Liste Voitures</a>
</div>
</form>
</div>
<br/>
<br/>

</div>
</body>
</html>