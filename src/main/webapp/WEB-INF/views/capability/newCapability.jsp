<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<jsp:include page="/WEB-INF/views/includes/header.jsp" />
	<body>
	<jsp:include page="/WEB-INF/views/includes/logo.jsp" />
		<div>
		
			<h1>New Capability</h1>
			
			
			<form:form name="newCapabilityForm" commandName="capability" action="saveCapability" method="post">
				<jsp:include page="/WEB-INF/views/includes/capability/capabilityDetails.jsp" />
				<br/>
				<a href="capabilityList">Back to list</a>&nbsp;&nbsp;&nbsp;
				<a href="javascript: document.forms.newCapabilityForm.submit();">Create new capability</a>&nbsp;&nbsp;&nbsp;
			</form:form>
			
			<jsp:include page="/WEB-INF/views/includes/footer.jsp" />
		
		 </div>
	 </body>
 </html>