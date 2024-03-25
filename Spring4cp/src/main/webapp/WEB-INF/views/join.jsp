<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="join.do" method="post">
		아이디<input type="text" name="id" class="form-control"><button id="checkDuplicate">중복확인</button><br>
		비밀번호<input type="password" name="pw" class="form-control"><br>
		비밀번호 확인<input type="text"><br>
		이름<input type="text" name="name" class="form-control"><br>
		닉네임<input type="text" name="nick" class="form-control"><br>
		생일<input type="date" name="birth" class="form-control"><br>
		휴대폰번호<input type="text" name="phone" placeholder= "010-1111-1111" class="form-control">
		<button>인증번호 발송</button><br>
		인증번호<input type="text">
		학교
		학년<input type="number" name="grade" class="form-control">
		학생 인증<button>학생증 인증</button>
		이메일<input type="text" name="email" class="form-control">
	</form>
	
	<script type="text/javascript">
	document.getElementByID("checkDuplicate").addEventListener('click',checkAndPop)
	
	function checkAndPop () {
		
	}
	</script>
</body>
</html>