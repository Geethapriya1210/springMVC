<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body>
<body>

		<div class="container">
			<form action="register.doc" method="post">
				<div class="form-group" col-sm-3>
					<label for="place"></label> <input name="place" type="text"
						class="form-control" placeholder="Placename" id="PLACENAME">
				</div>

				<div class="form-group" col-sm-3>
					<label for="date"></label> <input name="date" type="text"
						class="form-control" placeholder="Date" id="DATE">
				</div>

				<div class="form-group" col-sm-3>
					<label for="capturedby"></label> <input name="capturedBy"
						type="text" class="form-control" placeholder="CapturedBy"
						id="CAPTUREDBY">
				</div>

				<div class="form-group" col-sm-3>
					<label for="calamityType"></label> <select class="form-control" name="calamityType" id="CAPTUREDTYPE">
							<option>--Select--</option>
							<option>Flood</option>
							<option>Rain</option>
							<option>Cyclone</option>
							<option>Earth Quake</option>
					</select>
					
					
				</div>

				<div class="form-group" col-sm-3>
					<label for="AREA"></label> <input name="area" type="text"
						class="form-control" placeholder="area" id="AREA">
				</div>

				<div class="form-group" col-sm-3>
					<label for="AvgLoss"></label> <input name="avgLoss" type="text"
						class="form-control" placeholder="avgLoss" id="AVGLOSS">
				</div>

				<div class="form-group" col-sm-3>
					<label for="Deaths"></label> <input name="deaths" type="text"
						class="form-control" placeholder="deaths" id="DEATHS">
				</div>

				<div class="form-group" col-sm-3>
					<label for="Injured"></label> <input name="injured" type="text"
						class="form-control" placeholder="injured" id="INJURED">
				</div>

				<center><span style="color:blue; font-size:30pt;"><button type="Register" class="btn btn-success">REGISTER</button></span></center>

				<span style="color: yellow; float-size:300pt; font-family: fantasy;">${success}</span>
				<span style="color: red; font-family: cursive;">${failure}</span></div>
		</form>
	</div>
	
</body></body>

</html>
