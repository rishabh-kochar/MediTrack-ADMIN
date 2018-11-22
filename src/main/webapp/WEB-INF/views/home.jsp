
<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

<section class="vbox">
	<section class="scrollable padder">
		<ul class="breadcrumb no-border no-radius b-b b-light pull-in">
			<li><a href="/admin/home"><i class="fa fa-home"></i> Home</a></li>
			<li class="active">Dashboard</li>
		</ul>
		<div class="m-b-md">
			<h3 class="m-b-none">Dashboard</h3>
			<small>Welcome back, <c:out
					value="${sessionScope.sessionName}" />
			</small>
		</div>
		<section class="panel panel-default">
			<div class="row m-l-none m-r-none bg-light lter">
				<div class="col-sm-8 col-md-4 padder-v b-r b-light">
					<span class="fa-stack fa-2x pull-left m-r-sm"> <i
						class="fa fa-circle fa-stack-2x text-info"></i> <i
						class="fa fa-male fa-stack-1x text-white"></i>
					</span> <a class="clear" href="#"> <span class="h3 block m-t-xs"><strong><c:out
									value="${noOfPatients }" /></strong></span> <small class="text-muted text-uc">Patients</small>
					</a>
				</div>
				<div class="col-sm-8 col-md-4 padder-v b-r b-light lt">
					<span class="fa-stack fa-2x pull-left m-r-sm"> <i
						class="fa fa-circle fa-stack-2x text-warning"></i> <i
						class="fa fa-bug fa-stack-1x text-white"></i> <span
						class="easypiechart pos-abt easyPieChart" data-percent="100"
						data-line-width="4" data-track-color="#fff"
						data-scale-color="false" data-size="50" data-line-cap="butt"
						data-animate="2000" data-target="#bugs" data-update="3000"
						style="width: 50px; height: 50px; line-height: 50px;"><canvas
								width="50" height="50"></canvas></span>
					</span> <a class="clear" href="#"> <span class="h3 block m-t-xs"><strong
							id="bugs"><c:out value="${noOfDoctors }" /></strong></span> <small
						class="text-muted text-uc">Doctor</small>
					</a>
				</div>
				<div class="col-sm-8 col-md-4 padder-v b-r b-light">
					<span class="fa-stack fa-2x pull-left m-r-sm"> <i
						class="fa fa-circle fa-stack-2x text-danger"></i> <i
						class="fa fa-fire-extinguisher fa-stack-1x text-white"></i> <span
						class="easypiechart pos-abt easyPieChart" data-percent="100"
						data-line-width="4" data-track-color="#f5f5f5"
						data-scale-color="false" data-size="50" data-line-cap="butt"
						data-animate="3000" data-target="#firers" data-update="5000"
						style="width: 50px; height: 50px; line-height: 50px;"><canvas
								width="50" height="50"></canvas></span>
					</span> <a class="clear" href="#"> <span class="h3 block m-t-xs"><strong
							id="firers"><c:out value="${noOfHospitals }" /></strong></span> <small
						class="text-muted text-uc">Hospital</small>
					</a>
				</div>

			</div>
		</section>
	</section>
</section>
<%@ include file="../common/footer.jspf"%>