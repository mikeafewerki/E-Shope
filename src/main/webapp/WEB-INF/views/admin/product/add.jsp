<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="context" value="${pageContext.request.contextPath}" />
<c:if test="${empty product.name}">
	<spring:url value="addProduct" var="actionUrl" />
</c:if>
<c:if test="${not empty product.name}">
	<spring:url value="/admin/editProduct/${product.productId }"
		var="actionUrl" />
</c:if>
<div class="right_col" role="main">

	<!-- top tiles -->
	<div class="row tile_count" style="min-height: 700px;">
		<div class="col-md-6 col-md-offset-1">
			<c:if test="${empty product.name}">
				<h3>Add New Product</h3>
			</c:if>
			<c:if test="${not empty product.name}">
				<h3>Update Product</h3>
			</c:if>

			<form:form method="post" modelAttribute="product"
				action="${actionUrl}">
				<div class="form-group">
					<label class="control-label">Category</label> <select name="cat">
						<c:if test="${empty product.name}">
							<option value="" />
						</c:if>
						<c:set var="currentCat" value="${currentCat.categoryId }"/>
						<c:forEach var="item" items="${categories}">
							<c:choose>
								<c:when test="${item.categoryId == currentCat}">
									<option value="${item.categoryId}" selected>${item.name}</option>
								</c:when>
								<c:otherwise>
									<option value="${item.categoryId}">${item.name}</option>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</select>
				</div>
				<div class="form-group">
					<label class="control-label">Name</label>
					<form:input path="name" type="text" />
				</div>
				<div class="form-group">
					<label class="control-label">Description</label>
					<form:textarea path="description" rows="5" cols="30" />
				</div>
				<div class="form-group">
					<label class="control-label">Unit Price</label>
					<form:input path="price" type="text" />
				</div>
				<div class="form-group">
					<label class="control-label">Quantity</label>
					<form:input path="currQty" type="text" />
				</div>

				<!-- 				<div class="form-group"> -->
				<!-- 					<label class="control-label">Category Name</label> -->
				<%-- 					<form:input path="category" type="text" /> --%>
				<%-- 					<form:select path="category"> --%>
				<%-- 						<form:option value=""> --SELECT--</form:option> --%>
				<%-- 						<form:options items="${catNameList}" /> --%>
				<%-- 					</form:select> --%>
				<!-- 				</div> -->
				<div class="form-group">
					<button type="submit" class="btn btn-md btn-primary">Submit</button>
				</div>
			</form:form>
		</div>
	</div>
</div>