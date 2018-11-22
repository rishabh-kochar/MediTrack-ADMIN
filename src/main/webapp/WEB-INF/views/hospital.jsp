
<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<section class="vbox">
	<section class="scrollable padder">
		<ul class="breadcrumb no-border no-radius b-b b-light pull-in">
			<li><a href="/admin/home"><i class="fa fa-home"></i> Home</a></li>
			<li class="active">Hospital</li>
		</ul>

		<div class="row">
			<div class="col-md-10">
				<h1>Hospitals</h1>
			</div>
			<div class="col-md-2" style="margin-top: 15px;">
				<a href="/admin/addhospital" class="btn btn-success">Insert
					Hospital</a>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="col-md-12">
				<table id="example">
					<thead>
						<th>Hospital Name</th>
						<th>Hospital Contact Number</th>
						<th>Hospital Email ID</th>
						<th>Website</th>
						<th>Timings</th>
						<th></th>
					</thead>
					<tbody>
						<c:forEach items="${hospitals}" var="hospital">
							<tr>
								<td>${hospital.hospitalName}</td>
								<td>${hospital.hospitalContactNo}</td>
								<td>${hospital.hospitalEmailID}</td>
								<td><a target="_blank"
									href="https://${hospital.hospitalWebsiteURL }">${hospital.hospitalWebsiteURL }</a></td>
								<td>${hospital.openingTime}- ${hospital.closingTime}</td>
								<td><a href="/admin/addhospital?id=${hospital.hospitalID}"
									class="btn btn-sm btn-icon btn-info"><i class="fa fa-info"></i></a>
									<c:if test="${hospital.status == 1}">
										<a href="/admin/deactivehospital?id=${hospital.hospitalID}"
											class="btn btn-sm btn-icon btn-success"><i
											class="fa fa-check"></i></a>
									</c:if> <c:if test="${hospital.status == 0}">
										<a href="/admin/activehospital?id=${hospital.hospitalID}"
											class="btn btn-sm btn-icon btn-danger"><i
											class="fa fa-times"></i></a>
									</c:if> <a target="_blank" href="${hospital.hospitalLocationURL}"
									class="btn btn-sm btn-icon btn-warning"><i
										class="fa fa-map-marker"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</section>
</section>
<%@ include file="../common/footer.jspf"%>