<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" type="text/css" href="../css/login.css">
<link rel="stylesheet" type="text/css" href="../css/custom.css">
</head>
<body>
 <div style="position:absolute; left:300; top:180;">
	<h1>로그인</h1>
</div>
<br>
	<br>
	<br> ${errorMessage}
	<br>

<form action="login" method="post">
  <div class="imgcontainer">
    <img src="../img/2522.jpeg" alt="Avatar" class="avatar"> 
  </div>

  <div class="container">
    <label for="id"><b>아이디</b></label>
    <input type="text" placeholder="Enter Id" name="id" required>

    <label for="psw"><b>비밀번호</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>
        
    <button type="submit">로그인</button>
    <!-- 
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
	-->
	</div>
  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn" onclick="location.href='/mbti_hi/main'">취소</button>
    <!-- 
    <span class="psw">Forgot <a href="#">password?</a></span>
    -->
  </div>
</form>
</body>
</html>