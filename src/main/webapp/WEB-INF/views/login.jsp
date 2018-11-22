<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html lang="en" class="bg-dark">
<head>
<link rel="stylesheet" href="css/app.css" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Medi-Track | Admin</title>
<style>
.error{
	font-size: 18px;
	color: #b94a48;
	padding: 15px;  
}
</style>
</head>
<body>
	<section id="content" class="m-t-lg wrapper-md animated fadeInUp">
		<div class="container aside-xxl">
			<a class="navbar-brand block" href="index.html">Medi-Track</a>
			<section class="panel panel-default bg-white m-t-lg">
				<header class="panel-heading text-center">
					<strong>Login</strong>
				</header>
				<form action="/admin/login" method="post"
					class="panel-body wrapper-lg">
					<div class="form-group">
						<label class="control-label">Username</label> <input type="text"
							placeholder="Username" class="form-control input-lg" name="userName">
					</div>
					<div class="form-group">
						<label class="control-label">Password</label> <input
							type="password" id="inputPassword" placeholder="Password"
							class="form-control input-lg" name="password">
					</div>
					<!-- <a href="#" class="pull-right m-t-xs"> <small>Forgot
							password?</small>
					</a> -->
					<button type="submit" class="btn btn-primary">Sign in</button>
					<p class="error"> ${errorMessage} </p>
					

				</form>
			</section>
			<footer id="footer">
				<div class="text-center padder">
					<p>
						<small>Medi-Track<br>&copy; 2018
						</small>
					</p>
				</div>
			</footer>
		</div>
	</section>
</body>
</html>
