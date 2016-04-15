<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:if test="${empty category.name}">
		<spring:url value="addCategory" var="actionUrl" />
	</c:if>
	<c:if test="${not empty movieForm.title}">
		<spring:url value="updateCategory/${category.categoryId }" var="actionUrl" />
	</c:if>
<div class="right_col" role="main">

	<!-- top tiles -->
	<div class="row tile_count" style="min-height: 700px;">
	<div class="col-md-6 col-md-offset-1">
		<h3>Add New Categtory</h3>
		<form:form method="post" modelAttribute="category" action="${actionUrl}">
		<div class="form-group">
			<label class="control-label">Enter Category Name</label> 
			<form:input path="name" type="text" />
		</div>
		<div class="form-group">
			<button type="submit" class="btn btn-md btn-primary">Submit</button>
		</div>
		</form:form>
	</div>
	</div>
</div>