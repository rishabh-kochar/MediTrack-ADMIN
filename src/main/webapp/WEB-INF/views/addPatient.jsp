<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<section class="vbox">
	<section class="scrollable padder">
		<ul class="breadcrumb no-border no-radius b-b b-light pull-in">
			<li><a href="/admin/home"><i class="fa fa-home"></i> Home</a></li>
			<li class="active">Add Patient</li>
		</ul>


		<div class="m-b-md">
			<h3 class="m-b-none">Add Patient</h3>
		</div>
		<section class="panel panel-default">
			<!-- <header class="panel-heading font-bold"> </header> -->
			<div class="panel-body">
				<form class="form-horizontal" action="/admin/addpatient"
					method="post">
					<input type="hidden" name="PatientID" id="PatientID"
						value="${PatientID}">
					<div class="form-group">
						<label class="col-sm-2 control-label">Patient Name</label>

						<div class="col-sm-10">
							<input type="text" id="PatientName" name="PatientName"
								value="<c:out value="${patientData.patientName}" />"
								class="form-control" placeholder="Patient Name" required>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Username</label>

						<div class="col-sm-10">
						<input type="text" id="username" name="username"
								value="<c:out value="${patientData.username}" />"
								class="form-control" placeholder="Username" required>
							
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Password</label>

						<div class="col-sm-10">
							<input type="password" id="password" name="password"
								value="<c:out value="${patientData.password}" />"
								class="form-control" placeholder="Password" required>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Address</label>

						<div class="col-sm-10">
							<input type="text" id="address" name="address"
								value="${patientData.address}" class="form-control"
								placeholder="Address" required>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Gender</label>

						<div class="col-sm-10">
							<input type="text" id="gender" name="gender"
								value="${patientData.gender}" class="form-control"
								placeholder="Gender" required>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Email</label>

						<div class="col-sm-10">
							<input type="text" id="email" name="email"
								value="${patientData.email}" class="form-control"
								placeholder="E-mail Address" required>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Date-of-birth</label>

						<div class="col-sm-10">
							<input type="date" id="date_of_birth" name="date_of_birth"
								value="${patientData.dateOfBirth}" class="form-control"
								placeholder="Date-of-birth" required>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Contact</label>

						<div class="col-sm-10">
							<input type="text" maxlength="13" id="contact" name="contact"
								value="${patientData.contact}" class="form-control"
								placeholder="Contact Number" required>
						</div>
					</div>







					<div class="line line-dashed line-lg pull-in"></div>
					<div class="form-group">
						<div class="col-sm-4 col-sm-offset-2">
							<a href="/admin/patient" class="btn btn-default">Cancel</a>
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