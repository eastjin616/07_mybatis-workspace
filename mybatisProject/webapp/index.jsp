<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 
		*프레임워크
		- 개발자가 보다 편리한 환경에서 개발할 수 있도록 제공하는 툴, 뼈대 라고 생각
		- 소프트웨어 개발의 입장으로써는 공통적으로 사용되는 라이브러리/개발도구/인터페이스 등을 의미
		
		*프레임워크 필요성
		- 규모가 큰 프로젝트 작업 시 많은 개발자들이 필요
			=> 그런 개발자들이 "통일성" 있게 "빠르고" "안정적"으로 개발하기 위해서 프레임워크가 좋은 성과!
			=> 생산성 향성
		
		*프레임워크 특징
		- 개발자들이 따라야하는 가이드 라인 제공
			=> 자유롭게 설계/코딩 x, 가이드라인 대로 설계/코딩 o
		- 개발할 수 있는 범위가 정해져 있음	
		- 개발자들을 위한 다양한 도구들을 지원
		
		*프레임워크 장점
		- 개발시간을 줄일 수 있음
		- 유지보수 용이
		
		*프레임워크 단점
		- 프레임워크에 너무 의존하면 개발자들의 능력이 떨어짐
		- 익숙해지기까지 시간이 걸림	
		
		*프레임워크 종류
		- 영속성 : 데이터 관련한 CRUD 기능들을 보다 편리하게 작업할 수 있도록 제공해주는 프레임워크 ex)Mybatis, Hibernate, JPA,...	
		- 자바 : 웹 애플리케이션에 초점을 맞춰 필요한 요소들을 모듈화해서 제공해주는 프레임 워크 ex)Spring, Struts
		- 화면구현 : Front-End를 보다 쉽게 구현할 수 있도록 제공해주는 프레임워크 ex)Bootstrap,...
		- 기능 및 지원 : 특정 기능이나 업무 수행에 도움을 줄 수 있게 제공하는 프레임워크 ex)Log4j, JUnit, ...
		
	 -->

	여기는 index.jsp
	
	<!-- index.jsp 페이지 로딩되자마자 WEB-INF/views/main.jsp로 곧바로 포워딩 -->
	<jsp:forward page="WEB-INF/views/main.jsp"/>
</body>
</html>