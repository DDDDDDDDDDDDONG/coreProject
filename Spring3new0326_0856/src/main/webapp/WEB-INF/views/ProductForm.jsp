<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
 
<div class="container">
<!-- 자영 생성(240325) -->
  <h2>ProductForm - 상품등록 작성 화면</h2>
  <div class="panel panel-default">
    <div class="panel-heading">내 물건 팔기</div>
    <div class="panel-body">
    
    	<form action ="ProductInsert.do" method="post" enctype="multipart/form-data">
    	<table class="table">
    		<tbody>
    			<tr>
	    			<td>사진 파일</td>
	    			<td><input type="file" name="prod_img_path" class="form-control"></td>
    			</tr>
    			
    			<tr>
	    			<td>상품명</td>
	    			<td><input type="text" name="prod_name" class="form-control"></td>
    			</tr>
    			
    			<tr>
	    			<td>상품가격</td>
	    			<!-- 자영:가격이라서 number타입으로 적었어요 -->
	    			<td><input type="number" name="prod_price" class="form-control"></td>
    			</tr>
    			
    			
    			<tr>
	    			<td>상품에 대한 자세한 설명</td>
	    			<td>
	    				<textarea name="prod_desc" rows="7" class="form-control"></textarea>
	    			</td>

    			</tr>
    			<tr>
    			<!--자영(0325): 원래 작성자 있었는데, 작성자는 세션에서 받아온 id값 유지하면 될 것 같고, 당근에 거래희망장소가 있길래 가져왔어요 -->
	    			<td>거래희망 장소</td>
	    			<!-- 자영(0235) 거래희망 장소를 새로 Product에 추가해야할까요? -->
	    			<td><input type="text" name="place" class="form-control"></td>
    			</tr>
    			
    			
    			<tr>
    			<td colspan="2" align="center">
    				<button type="reset" class="btn btn-danger">글작성 취소</button>
    				<button type="submit" class="btn btn-warning">글작성 완료</button>
    				
    			</td>
    			</tr>
    		</tbody>
    	
    	</table>
    	
    	</form>
    
    
    
    </div>
    
    
    
    
    
    <div class="panel-footer">ProductForm</div>
  </div>
</div>

</body>
</html>




