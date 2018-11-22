
<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<section class="vbox">
	<section class="scrollable padder">
		<ul class="breadcrumb no-border no-radius b-b b-light pull-in">
			<li><a href="/admin/home"><i class="fa fa-home"></i> Home</a></li>
			<li class="active">Doctor</li>
		</ul>

		<div class="row">
			<div class="col-md-10">
				<h1>Doctors</h1>
			</div>
			
		</div>
		<br>
		<div class="row">
			<div class="col-md-12">
				<table id="example">
					<thead>
						<th>Doctor Name</th>
						<th>Designation</th>
						<th>Specialization</th>
						<th>Contact</th>
						<th>Address</th>
					</thead>
					<tbody>
						<c:forEach items="${doctors}" var="doctor">
							<tr>
								<td>${doctor.doctorName}</td>
								<td>${doctor.doctorDesignation}</td>
								<td>${doctor.doctorSpecialization}</td>
								<td>${doctor.doctorContact}</td>
								<td>${doctor.doctorAddress}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</section>
</section>
<%@ include file="../common/footer.jspf"%>