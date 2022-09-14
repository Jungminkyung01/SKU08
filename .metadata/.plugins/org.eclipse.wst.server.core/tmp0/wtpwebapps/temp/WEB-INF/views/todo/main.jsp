<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2522-투두리스트</title>
<link rel="stylesheet" type="text/css" href="css/todo.css">
<link rel="stylesheet" type="text/css" href="css/custom.css">
</head>
<body>

<!--  
	<div id="myDIV" class="header">
	  <h2>My To Do List</h2>
	  <input type="text" id="myInput" placeholder="Title...">
	  <span onclick="newElement()" class="addBtn">Add</span>
	</div>
	
	<ul id="myUL">
	  <li>Hit the gym</li>
	  <li class="checked">Pay bills</li>
	  <li>Meet George</li>
	  <li>Buy eggs</li>
	  <li>Read a book</li>
	  <li>Organize office</li>
	</ul>
	-->
	<div class="todo-list-template">
		<div class="button_2">
				<button onclick="location.href='member/login'">로그인</button>
				<button onclick="location.href='member/add'">회원가입</button>
		</div>		
		<div class="title">투두리스트 ^3^</div>
		<section class="form-wrapper">
			<div class="form">
				<input type="text" id="myInput" placeholder="할 일을 적어주세요!!!!!" />
				<div class="add-button">추가</div>
			</div>
		</section>
		<section class="todos-wrapper">
			<ul id="todo-item-list">
			 	
			</ul>
			
		</section>		
	<script src="js/todo.js"></script> 
	</div> 
	
	
	
</body>
</html>