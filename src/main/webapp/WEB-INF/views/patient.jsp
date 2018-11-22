
<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<section class="vbox">
	<section class="scrollable padder">
		<ul class="breadcrumb no-border no-radius b-b b-light pull-in">
			<li><a href="/admin/home"><i class="fa fa-home"></i> Home</a></li>
			<li class="active">Patient</li>
		</ul>

		<div class="row">
			<div class="col-md-10">
				<h1>Patients</h1>
			</div>
			<div class="col-md-2" style="margin-top: 15px;">
				<a href="/admin/addpatient" class="btn btn-success">Insert
					Patient</a>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="col-md-12">
				<table id="example">
					<thead>
						<th>Patient Name</th>

						<th>address</th>
						<th>gender</th>
						<th>email</th>
						<th>date_of_birth</th>
						<th>contact</th>
						<th>joining</th>
						<th></th>
					</thead>
					<tbody>
						<c:forEach items="${patients}" var="patient">
							<tr>
								<td>${patient.patientName}</td>
								<td>${patient.address}</td>
								<td>${patient.gender}</td>
								<td>${patient.email}</td>
								<td>${patient.dateOfBirth}</td>
								<td>${patient.contact}</td>
								<td>${patient.joining}</td>
								<td>
								<a href="/admin/deletepatient?id=${patient.patientID}"
									class="btn btn-sm btn-icon btn-danger"><i class="fa fa-trash-o"></i></a>
									<%-- <a href="/admin/addpatient?id=${patient.patientID}"
									class="btn btn-sm btn-icon btn-info"><i class="fa fa-info"></i></a> --%>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</section>
</section>
<%@ include file="../common/footer.jspf"%>