<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<section class="vbox">
	<section class="scrollable padder">
		<ul class="breadcrumb no-border no-radius b-b b-light pull-in">
			<li><a href="/admin/home"><i class="fa fa-home"></i> Home</a></li>
			<li class="active">Add Hospital</li>
		</ul>


		<div class="m-b-md">
			<h3 class="m-b-none">Add Hospital</h3>
		</div>
		<section class="panel panel-default">
			<!-- <header class="panel-heading font-bold"> </header> -->
			<div class="panel-body">
				<form class="form-horizontal" action="/admin/addhospital"
					method="post">
					<input type="hidden" name="hospitalID" id="hospitalID"
						value="${hospitalID}">
					<div class="form-group">
						<label class="col-sm-2 control-label">Hospital Name</label>

						<div class="col-sm-10">
							<input type="text" id="hospitalName" name="hospitalName"
								value="<c:out value="${hospitalData.hospitalName}" />"
								class="form-control" placeholder="Hospital Name" required>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Hospital Address</label>

						<div class="col-sm-10">
							<textarea id="hospitalAddress" name="hospitalAddress"
								class="form-control" placeholder="Hospital Address" required><c:out
									value="${hospitalData.hospitalAddress}" /></textarea>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Hospital
							Registration Name</label>

						<div class="col-sm-10">
							<input type="text" id="hospitalRegistrationNo"
								name="hospitalRegistrationNo"
								value="<c:out value="${hospitalData.hospitalRegistrationNo}" />"
								class="form-control" placeholder="Hospital Registration Name"
								required>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Hospital Contact No</label>

						<div class="col-sm-10">
							<input type="text" maxlength="10" id="hospitalContactNo"
								name="hospitalContactNo"
								value="${hospitalData.hospitalContactNo}" class="form-control"
								placeholder="Hospital Contact Number" required>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Hospital Email Id</label>

						<div class="col-sm-10">
							<input type="text" id="hospitalemail" name="hospitalemail"
								value="${hospitalData.hospitalEmailID}" class="form-control"
								placeholder="Hospital Email Address" required>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Hospital Type</label>

						<div class="col-sm-10">
							<select name="hospitalTypeId" id="hospitalTypeId"
								class="form-control m-b">
								<option>Select Hospital Type</option>
								<c:forEach items="${hospitalType}" var="val">
									<option value="${val.hospitalTypeID}"
										<c:if test="${hospitalData.hospitalTypeID.hospitalTypeID == val.hospitalTypeID }"> <c:out value="selected" /> </c:if>><c:out
											value="${val.hospitalType}"></c:out></option>
								</c:forEach>
							</select>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Hospital Location
							URL</label>

						<div class="col-sm-10">
							<input type="text" id="hospitallocation" name="hospitallocation"
								value="${hospitalData.hospitalLocationURL}" class="form-control"
								placeholder="Hospital Location URL" required>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Hospital Website</label>

						<div class="col-sm-10">
							<input type="text" id="hospitalwebsite" name="hospitalwebsite"
								value="${hospitalData.hospitalWebsiteURL}" class="form-control"
								placeholder="Hospital Website" required>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Opening Timing</label>

						<div class="col-sm-10">
							<input type="time" value="${hospitalData.openingTime}"
								name="openingTime" required>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Closing Timing </label>

						<div class="col-sm-10">
							<input type="time" value="${hospitalData.closingTime}"
								name="closingTime" required>
						</div>
					</div>



					<div class="line line-dashed line-lg pull-in"></div>
					<div class="form-group">
						<div class="col-sm-4 col-sm-offset-2">
							<button class="btn btn-default">Cancel</button>
							<button type="submit" class="btn btn-primary">Save
								changes</button>
						</div>
					</div>
				</form>
			</div>
		</section>
	</section>
</section>


<%@ include file="../common/footer.jspf"%>