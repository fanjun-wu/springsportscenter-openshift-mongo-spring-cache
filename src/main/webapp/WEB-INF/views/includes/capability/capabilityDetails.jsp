<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

				<table>
					<tr>
						<td>Resource Type</td>
						<td>
							<form:input type="hidden" path="id" value="${capability.id}"/>
							<form:input type="text" path="resource" value="${capability.resource}"/>
						</td>
					</tr>
					
					<tr>
						<td>Condition</td>
						<td>
							<form:input type="text" path="conditionCap" value="${capability.conditionCap}"/>
						</td>
					</tr>
					
					<tr>
						<td>Discription</td>
						<td>
							<form:input type="text" path="discriptionCap" value="${capability.discriptionCap}"/>
						</td>
					</tr>
					
					
				</table>