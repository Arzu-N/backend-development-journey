<html>
	<head>
		<title>WPAP</title>
		<link rel="stylesheet" type="text/css" href="style.css">
		<link href='https://fonts.googleapis.com/css?family=Titillium+Web' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Righteous' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Handlee' rel='stylesheet' type='text/css'>
		<style>
		body{
        	background-color:#eee;
        	margin-top:120px;
        	margin-left:20%;
        	margin-right:20%;
        }

        #header {
        	text-align:center;
        	font-family: 'Titillium Web', sans-serif;
        	color:white;
        	background-color:#16a085;
        	padding:30px;
        	border-radius:5pt;
        }

        #navigation {
        	position: fixed;
        	background-color: #3498db;
        	border-bottom-width:5px;
        	border-bottom-color:purple;
        }

        #navigation li {
        	list-style:none;
        	text-decoration:none;
        }

        #navigation a{
        	text-decoration:none;
        	font-family: 'Righteous', cursive;
        	color:white;
        	border-radius:5pt;
        	background-color:#2c3e50;
        	padding:16px;
        	display:inline-block;
        }

        #navigation a:hover{
        	color:#8e44ad;
        }

        #navigation ul li {
        	float: left;
        	padding: 10px;
        }

        .float-left {
        	float:left;
        	display:inline-block;
        }


        .float-right {
        	float:right;
        	display:inline-block;
        }

        .top {
        	top:0;
        	left:0;
        	right:0;
        }

        #container{
        	margin-top:40px;
        }

        .content1{
        	float:left;
        	padding:20px;
        	font-family: 'Handlee', cursive;
        	width:35%;
        	text-align:center;
        	background-color:#95a5a6;
        	border-radius:5pt;
        }

        .content2{
        	float:right;
        	padding:20px;
        	font-family: 'Handlee', cursive;
        	width:35%;
        	text-align:center;
        	background-color:#95a5a6;
        	border-radius:5pt;
        }

        footer{
        	margin-top:250px;
        	position:relative;
        }
		</style>
	</head>

	<body>
		<nav id="navigation" class="top">
			<ul>
				<div class="float-left">
					<li id="logo"><img width="50px" src="https://4.bp.blogspot.com/-sNb0cgVHwOI/VQO34IX5SJI/AAAAAAAAAbM/qb8u_9LFK6w/s1600/long%2Bshadow1.jpg" title="Visit my Blog!"></li>
				</div>

				<div class="float-right">
					<li><a href="#">HOME</a></li>
					<li><a href="#">PORTOFOLIO</a></li>
					<li><a href="#">ABOUT</a></li>
				</div>
			</ul>
		</nav>

		<div id="header">
			<h1>WPAP</h1>
			<hr color="white" width="40% auto">
			<h3>Wedha's Pop Art Portrait</h3>
		</div>

		<div id="container">
			<div class="content1">
				<h2>Heading</h2>
				<p>Text</p>
			</div>

			<div class="content2">
				<h2>Heading</h2>
				<p>Text</p>
			</div>
		</div>

		<footer>
			<hr color="black">
			<p align="center">&copy; lokasamgraha.blogspot.com. All Right Reserved.</p>
		</footer>

	</body>
</html>

