<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<jsp:include page="/WEB-INF/views/includes/header.jsp" />
	<body>
	<jsp:include page="/WEB-INF/views/includes/logo.jsp" />
		<div>
		
			<h1>Modify Hall</h1>
			
			
			<form:form name="modifyHallForm" commandName="hall" action="updateHall" method="post">
				<jsp:include page="/WEB-INF/views/includes/hall/hallDetails.jsp" />
				<br/>
				<a href="hallList">Back to list</a>&nbsp;&nbsp;&nbsp;
				<a href="javascript: document.forms.modifyHallForm.submit();">Update hall</a>&nbsp;&nbsp;&nbsp;
				<a href="deleteHall?hallId=${hall.id}">Delete hall</a>&nbsp;&nbsp;&nbsp;
				
			</form:form>
			
			<jsp:include page="/WEB-INF/views/includes/footer.jsp" />
		
		 </div>
	 </body>
 </html>