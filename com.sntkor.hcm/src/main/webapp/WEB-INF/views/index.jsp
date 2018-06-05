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

<title>에스엔티코리아 인력관리</title>
</head>
<body>
	<div class="wrap">
		<div class="container">
			<div class="hcm_content">
				<h3>SNTKorea 인력관리</h3>
				<div class="hcm_content_header">
					<ul>
						<li><span>총 <font>${maxIdx }</font> 명<span></li>
						<li><span>프로젝트 투입 <font>${maxIdx }</font> 명</span></li>
						<li><span>휴식 <font>${maxIdx }</font> 명</span></li>
					</ul>
					<span class="today"></span>
					<span class="insert_btn" onclick="insert();">등록하기</span>
				</div><!-- ./hcm_content_header -->
				
				<div class="hcm_content_area">
					<div class="keyword_area">
						<ul>
							<li><span>Window</span></li>
							<li><span>Linux</span></li>
							<li><span>JAVA/JSP</span></li>
							<li><span>Javascript</span></li>
							<li><span>JQuery</span></li>
							<li><span>Oracle</span></li>
							<li><span>MYSQL</span></li>
						</ul>
					</div>
					<div class="main_area">
						<table>
							<thead>
								<th>No <span></span></th>
								<th>성명 <span></span></th>
								<th>기술등급<span></span></th>
								<th>경력<span></span></th>
								<th>프로젝트 종료일<span></span></th>
								<th>남은기간<span></span></th>
								<th>상세보기<span></span></th>
							</thead>
							<tbody>
								<c:forEach var="item" items="${total}"  varStatus="index">
									<tr>
										<td>${item.value}</td>
										<td>${item.value}</td>
										<td>${item.value}</td>
										<td>${item.value}</td>
										<td>${item.value}</td>
										<td>q</td>
										<td><span><a href="">보기</a></span></td>
									</tr>
								</c:forEach>
							</tbody>					
						</table>
					</div>
				</div><!-- ./hcm_content_area -->
			</div><!-- ./hcm_content -->
		</div><!-- ./container -->
	</div><!-- ./wrap -->
</body>
</html>