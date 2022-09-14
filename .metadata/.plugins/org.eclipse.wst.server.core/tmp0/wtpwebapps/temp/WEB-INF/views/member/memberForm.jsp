<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join member</title>
<link rel="stylesheet" type="text/css" href="../css/add.css">
<link rel="stylesheet" type="text/css" href="../css/custom.css">
</head>
<!-- 
<script>
	var func = function(){
		//정보가 모두 입려되었다면
		var 
	}
</script>
 -->

<body>
 <form action="add" style="border:1px solid #ccc" method="post">
  <div class="container">
    <h1>회원가입</h1>
    <p>정보를 입력해주세요.</p>
    <hr>
    
    <label for="id"><b>아이디</b></label>
    <input type="text" placeholder="Enter Id" name="id" required>
    
    <label for="psw"><b>비밀번호</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
    
    <label for="name"><b>이름</b></label>
    <input type="text" placeholder="Enter Name" name="name" required>

    <label for="email"><b>이메일</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>
    
    <label for="mbti"><b>MBTI</b></label>
    <input type="text" placeholder="Enter MBTI" name="mbti" required>
    
    <!-- 
    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" required>
    -->
   
    <div class="clearfix">
      <button type="button" class="cancelbtn"  onclick="location.href='/mbti_hi/main'">취소</button>
      <button type="submit" class="signupbtn">회원가입</button>
    </div>
  </div>
</form>
</body>
</html>