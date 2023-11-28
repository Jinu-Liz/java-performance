<%@page import="hd.edu.myspring.vo.AddrBookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="addrbook_error.jsp" import="java.util.*"%>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/addrbook.css" type="text/css" media="screen" />

<script type="text/javascript">
	function check(abId) {
		pwd = prompt('수정/삭제 하려면 비밀번호를 넣으세요');
		document.location.href="editForm.do?abId="+abId+"&upasswd="+pwd;
	}
</script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주소록:목록화면</title>

</head>
<%
	List<AddrBookVO> list = (List<AddrBookVO>)request.getAttribute("list");
%>
<body>
<div align="center"> 
<H2>주소록:목록화면</H2>
<HR>
<form>
<a href="registerForm.do">주소록 등록</a><P>
		<table border="1">
			<tr><th>번호</th><th>이 름</th><th>전화번호</th><th>생 일</th><th>회 사</th><th>메 모</th></tr>
			<%
			if(list != null) {
			for(AddrBookVO  ab : list) {
			%>
			  <tr>
			   <td><a href="javascript:check(<%=ab.getAbId()%>)"><%=ab.getAbId() %></a></td>
				<td><%=ab.getAbName() %></td>
				<td><%=ab.getAbTel() %></td>
				<td><%=ab.getAbBirth() %></td>
				<td><%=ab.getAbComdept() %></td>
				<td><%=ab.getAbMemo() %></td>
			  </tr>
			 <%
				}
			}
			 %>
		</table>
</form>
</div>
</body>
</html>