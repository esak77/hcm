<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="/resources/hcm/css/common.css" type="text/css" rel="stylesheet">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript" src="/resources/hcm/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/resources/hcm/js/common.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<title>에스엔티코리아 인력관리</title>
</head>
<body class="detail">
	<div class="wrap" style="padding-top: 50px;">
		<div class="container">
			<form id="hcm" action="/update_db" method="POST" enctype="multipart/form-data">
				<input type="hidden" name="idx" value="${pd.idx}">
				<div class="pi_content">
					<div class="pi_top">
						<input type="button" id="btn_back" name="btn_back" onclick="back();" value="리스트보기">
						<input type="button" id="btn_submit" onclick="check();" value="등록하기">
						<input type="button" id="btn_edit" name="btn_edit" onclick="edit();" value="수정하기">
						<h1>인적사항</h1>
						<div class="info_wrap">
							<ul>
								<li class="label">
									<span>성명</span>
								</li>
								<li class="input">
									<input type="text" id="name" name="name" value="${pd.name }">
								</li>
								<li class="label">
									<span>나이</span>
								</li>
								<li class="input">
									<input type="text" id="age" name="age" value="${pd.age }">
								</li>
								<li class="label">
									<span>성별</span>
								</li>
								<li class="input">
								
<script type="text/javascript">
	$(function(){
		var sex = "${pd.sex}";
		if(sex=="여"){
			$("#sex option[value='여']").attr("selected",true);
		}else{
			$("#sex option[value='남']").attr("selected",true);
		}
	})
</script>
								<select name="sex" id="sex">
									<option value="남">남</option>
									<option value="여">여</option>
								</select>
								
								</li>
								<li class="label">
									<span>최종학력</span>
								</li>
								<li class="input">
									<input type="text" id="education" name="education" value="${pd.education }">
								</li>
							</ul>
						</div>
						<div class="info_wrap">
							<ul>
								<li class="label">
									<span>회사</span>
								</li>
								<li class="input">
									<input type="text" id="company" name="company" value="${pd.company }">
								</li>
								<li class="label">
									<span>직위</span>
								</li>
								<li class="input">
									<input type="text" id="position" name="position" value="${pd.position }">
								</li>
								<li class="label">
									<span>기술등급</span>
								</li>
								<li class="input">
									<input type="text" id="techinicalrating" name="techinicalrating" value="${pd.techinicalrating }">
								</li>
								<li class="label">
									<span>경력</span>
								</li>
								<li class="input">
									<input type="text" id="career" name="career" value="${pd.career }">
								</li>
							</ul>
						</div>
						<div class="info_wrap">
							<ul>
								<li class="label">
									<span>연락처</span>
								</li>
								<li class="input">
									<input type="text" id="phone" name="phone" placeholder="연락처" onkeydown="onlyNumber(this)" value="${pd.phone }">
								</li>
								<li class="label">
									<span>이메일</span>
								</li>
								<li class="input">
									<input type="text" id="mail" name="mail" placeholder="이메일" value="${pd.mail }">
								</li>
								<li class="label">
									<span>자격증</span>
								</li>
								<li class="input">
									<input type="text" id="certificate" name="certificate" placeholder="자격증" value="${pd.certificate }">
								</li>
							</ul>
						</div>
						<div class="info_box">
							<ul>
								<li class="label">
									<span>주소</span>
								</li>
								<li>
									<input type="text" id="postcode" name="postcode" placeholder="우편번호" value="${pd.postcode }">
									<input type="button" id="find" onclick="find_addr()" value="우편번호 찾기"><br/>
									<input type="text" id="addr1" name="addr1" placeholder="도로명주소" value="${pd.addr1 }">
									<input type="text" id="addr2" name="addr2" placeholder="상세주소" value="${pd.addr2 }">
								</li>
							</ul>
						</div>
					</div><!-- ./pi_top -->
					
					<div class="pi_middle">
						<h1>경력사항</h1>
						<div class="career_box">
							<button type="button" class="del_column" onclick="del_column();">삭제하기</button>
							<button type="button" class="add_column" onclick="add_column();">추가하기</button>
							<table>
								<thead>
									<th>프로젝트 사업명</th>
									<th>당담 개발업무 상세기술</th>
									<th>참여기간 시작</th>
									<th>참여기간 종료</th>
									<th>역할</th>
									<th>발주처</th>
									<th>비고</br>(주요,기술)</th>
								</thead>
								<tbody>
									<c:forEach var="pc" varStatus="index" items="${pc}">
										<tr>
											<td><input type="text" id="pro_tit" name="pro_tit" value="${pc.pro_tit}" placeholder="프로젝트 명"></td>
											<td><input type="text" id="pro_detail" name="pro_detail" value="${pc.pro_detail}" placeholder="상세기술"></td>
											<td><input type="text" id="pro_term1" name="pro_term1" value="${pc.pro_term1}" maxlength="8" placeholder="시작 기간"></td>
											<td><input type="text" id="pro_term2" name="pro_term2" value="${pc.pro_term2}" maxlength="8" placeholder="종료 기간"></td>
											<td><input type="text" id="pro_part" name="pro_part" value="${pc.pro_part}" placeholder="역할"></td>
											<td><input type="text" id="pro_reference" name="pro_reference" value="${pc.pro_reference}" placeholder="발주처"></td>
											<td><input type="text" id="pro_technic" name="pro_technic" value="${pc.pro_technic}" placeholder="기술"></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div><!-- ./pi_middle -->
					
					<div class="pi_down">
						<h1>파일첨부</h1>
						<div class="file_box">
							<button type="button" class="del_file" onclick="del_file();">삭제하기</button>
							<button type="button" class="add_file" onclick="add_file();">추가하기</button>
							<div class="file_wrap_l">
								<c:forEach varStatus="index" var="files" items="${files}">
									<input multiple="multiple" id="file" name="file_name" type="file">
								</c:forEach>
								<c:forEach varStatus="index" var="files" items="${files}">
									<p><a href="/file_download?file_name=${files.file_name}">${files.file_name}</a></p>
								</c:forEach>
							</div>
							<div class="file_wrap_r">
							</div>
						</div>
					</div><!-- ./pr_down -->
					
				</div><!-- ./pi_content -->
			</form><!-- ./form -->
			
		</div><!-- ./container -->
	</div><!-- ./wrap -->
	
</body>
</html>


