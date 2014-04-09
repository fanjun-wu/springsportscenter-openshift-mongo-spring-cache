<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<jsp:include page="/WEB-INF/views/includes/header.jsp" />
	<body>
	<jsp:include page="/WEB-INF/views/includes/logo.jsp" />
		<div>
		
			<h1>Modify Reservation</h1>
			
			
			<form:form name="modifyReservationForm" commandName="reservation" action="updateReservation" method="post">
				<jsp:include page="/WEB-INF/views/includes/reservation/reservationDetails.jsp" />
				<br/>
				<a href="reservationList">Back to list</a>&nbsp;&nbsp;&nbsp;
				<a href="javascript: document.forms.modifyReservationForm.submit();">Update reservation</a>&nbsp;&nbsp;&nbsp;
				<a href="deleteReservation?reservationId=${reservation.id}">Delete reservation</a>&nbsp;&nbsp;&nbsp;
				
			</form:form>
			
			<jsp:include page="/WEB-INF/views/includes/footer.jsp" />
		
		 </div>
	 </body>
 </html>