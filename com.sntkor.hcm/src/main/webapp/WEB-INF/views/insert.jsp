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
<body>
	<div class="wrap" style="padding-top: 50px;">
		<div class="container">
			<form id="hcm" action="/insert_db" method="POST" enctype="multipart/form-data">
				<div class="pi_content">
					<div class="pi_top">
						<input type="button" id="btn_back" onclick="back();" value="리스트보기">
						<input type="button" id="btn_submit" onclick="check();" value="등록하기">
						<h1>인적사항</h1>
						<div class="info_wrap">
							<ul>
								<li class="label">
									<span>성명</span>
								</li>
								<li class="input">
									<input type="text" id="name" name="name" placeholder="이름">
								</li>
								<li class="label">
									<span>나이</span>
								</li>
								<li class="input">
									<input type="text" id="age" name="age" placeholder="년생">
								</li>
								<li class="label">
									<span>성별</span>
								</li>
								<li class="input">
									<select name="sex" id="sex">
										<option value="남">남</option>
										<option value="여">여</option>
									</select>
								</li>
								<li class="label">
									<span>최종학력</span>
								</li>
								<li class="input">
									<input type="text" id="education" name="education" placeholder="최종학력">
								</li>
							</ul>
						</div>
						<div class="info_wrap">
							<ul>
								<li class="label">
									<span>회사</span>
								</li>
								<li class="input">
									<input type="text" id="company" name="company" placeholder="회사명">
								</li>
								<li class="label">
									<span>직위</span>
								</li>
								<li class="input">
									<input type="text" id="position" name="position" placeholder="직위">
								</li>
								<li class="label">
									<span>기술등급</span>
								</li>
								<li class="input">
									<input type="text" id="techinicalrating" name="techinicalrating" placeholder="기술등급">
								</li>
								<li class="label">
									<span>경력</span>
								</li>
								<li class="input">
									<input type="text" id="career" name="career" placeholder="경력">
								</li>
							</ul>
						</div>
						<div class="info_wrap">
							<ul>
								<li class="label">
									<span>연락처</span>
								</li>
								<li class="input">
									<input type="text" id="phone" name="phone" placeholder="연락처">
								</li>
								<li class="label">
									<span>이메일</span>
								</li>
								<li class="input">
									<input type="text" id="mail" name="mail" placeholder="이메일">
								</li>
								<li class="label">
									<span>자격증</span>
								</li>
								<li class="input">
									<input type="text" id="certificate" name="certificate" placeholder="자격증">
								</li>
							</ul>
						</div>
						<div class="info_box">
							<ul>
								<li class="label">
									<span>주소</span>
								</li>
								<li>
									<input type="text" id="postcode" name="postcode" placeholder="우편번호">
									<input type="button" id="find" onclick="find_addr()" value="우편번호 찾기"><br/>
									<input type="text" id="addr1" name="addr1" placeholder="도로명주소">
									<input type="text" id="addr2" name="addr2" placeholder="상세주소">
								</li>
							</ul>
						</div>
					</div><!-- ./pi_top -->
					
					<div class="pi_middle">
						<h1>경력사항</h1>
						<div class="career_box">
							<span class="del_column">삭제하기</span>
							<span class="add_column">추가하기</span>
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
									<c:forEach varStatus="index" end="3" begin="1">
										<tr>
											<td><input type="text" id="pro_tit" name="pro_tit" placeholder="프로젝트 명"></td>
											<td><input type="text" id="pro_detail" name="pro_detail" placeholder="상세기술"></td>
											<td><input type="text" id="pro_term1" name="pro_term1" placeholder="시작 기간"></td>
											<td><input type="text" id="pro_term2" name="pro_term2" placeholder="종료 기간"></td>
											<td><input type="text" id="pro_part" name="pro_part" placeholder="역할"></td>
											<td><input type="text" id="pro_reference" name="pro_reference" placeholder="발주처"></td>
											<td><input type="text" id="pro_technic" name="pro_technic" placeholder="기술"></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div><!-- ./pi_middle -->
					
					<div class="pi_down">
						<h1>파일첨부</h1>
						<div class="file_box">
							<span class="del_file">삭제하기</span>
							<span class="add_file">추가하기</span>
							<div class="file_wrap_l">
								<c:forEach varStatus="index" end="1" begin="1">
									<input multiple="multiple" id="file" name="file_name" type="file">
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


