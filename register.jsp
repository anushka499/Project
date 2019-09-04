
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Page</title>
</head>
<body>
<div class="boxed"><span>Register here!</span>
<form action="abc" onsubmit="return valid();" method="post">
  <label for="sname">Student Name</label><br>
  <input type="text" id="sname" name="sname" ><br>
<label for="semail">Student Email</label><br>
  <input type="email" id="semail" name="semail"><br>
<label for="scourse">Select Course</label><br>
  <select name="scourse">
  <option value="btech">B.Tech</option>
  <option value="bcom">B.Com</option>
  <option value="bca">BCA</option>
  <option value="bpharma">B.Pharma</option>
</select><br>
  <label for="pass">Password</label><br>
  <input type="password" id="pass" name="pass"><br><br>
  <input type="submit" value="Register">
</form></div>
<style>
span
{
font-size:40px;
color:white;
font-weight:bold;
}

.select
{
width:30%;
background:#809fff;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
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

input[type=text]
{
width:100%;
box-sizing: border-box;
  border: 2px solid #ccc;
  border-radius: 4px;
}
input[type=email]
{
width:100%;
box-sizing: border-box;
  border: 2px solid #ccc;
  border-radius: 4px;
}
input[type=password]
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
width:20%;
border:1px solid black;
background-repeat:no-repeat;
background-size:cover;
}
div
{margin-top:40px;
margin-left:350px;}
</style>
<script>
    function valid()
    {
        var sid=document.getElementById("sname");
        var pass=document.getElementById("pass");
        /* username is not empty,password is minimum 3 characters and no spaces are allowed*/
        if(sid.value.trim()=="")
        {
            sid.style.border="solid 3px red";
            return false;
        }
         if(pass.value.length<3)
        {
            pass.style.border="solid 3px red";
            return false;
        }
        for(var i=0;i<pass.value.length;i++){
       if(pass.value.charAt(i)==" "){
        return false;}
    }}
</script>
</body>
</html>