<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<jsp:include page="/WEB-INF/views/includes/header.jsp" />
	<body>
	<jsp:include page="/WEB-INF/views/includes/logo.jsp" />
		<div>
		
			<h1>Modify TimeInterval</h1>
			
			
			<form:form name="modifyTimeIntervalForm" commandName="timeInterval" action="updateTimeInterval" method="post">
				<jsp:include page="/WEB-INF/views/includes/timeInterval/timeIntervalDetails.jsp" />
				<br/>
				<a href="timeIntervalList">Back to list</a>&nbsp;&nbsp;&nbsp;
				<a href="javascript: document.forms.modifyTimeIntervalForm.submit();">Update timeInterval</a>&nbsp;&nbsp;&nbsp;
				<a href="deleteTimeInterval?timeIntervalId=${timeInterval.id}">Delete timeInterval</a>&nbsp;&nbsp;&nbsp;
				
			</form:form>
			
			<jsp:include page="/WEB-INF/views/includes/footer.jsp" />
		
		 </div>
	 </body>
 </html>