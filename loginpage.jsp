
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Login</title>
<style>
span
{
font-size:40px;
color:white;
font-weight:bold;
}
input[type=submit]
{
width:30%;
background:#809fff;

  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
}
label {
  padding: 12px 12px 12px 0;
  display: inline-block;
  color:white;
  font-size:25px;
}
input[type=password]
{
width:100%;

 box-sizing: border-box;
  border: 2px solid #ccc;
  border-radius: 4px;
}

input[type=text]
{
width:100%;

 box-sizing: border-box;
  border: 2px solid #ccc;
  border-radius: 4px;
}
.boxed
{
padding:40px 90px;
background-image:url('blue.jpg');
background-repeat: no-repeat;
background-size:cover;
width:20%;
border:1px solid black;
}
div
{
	margin:100px auto;
}
.button
{
font-weight:bold;
border:	1px solid #b3b3b3 ;
padding:15px;
width:60%;
font-family:script;
font-size:25px ;
text-align:center;
background:black;
color:white;
text-decoration:none;
display:block;
margin:10px auto;
}

</style>

</head>
<body>
	
<div class="boxed"><span>Login</span>
<form action="xyz" method="post">
<label for="sid">Student ID</label><br><br>
  <input type="text" id="sid" name="sid"><br><br>
  <label for="pass">Password</label><br><br>
  <input type="password" id="pass" name="pass"><br><br><br>
  <input type="submit" value="Login">
</form></div>
</body>
</html>