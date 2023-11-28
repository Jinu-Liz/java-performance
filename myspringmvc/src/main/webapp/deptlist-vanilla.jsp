<%@page import="hd.edu.myspring.DeptVO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>

<%!
	static String sql = "select * from employees where DEPARTMENT_ID = ";
	static String driverClassName = "com.mysql.cj.jdbc.Driver";
	static String connectionUrl = "jdbc:mysql://localhost:3306/hr";
	static String userName = "root";
	static String password = "rootroot";
	static String sqlSelectEmpListByTitle = "select * from employees where job_id = ?";
	static String sqlSelectDeptList = "select department_id from departments";
	static String sqlSelectEmpInfo = "select * from employees where EMPLOYEE_ID = ";
	static {
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}
	private static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(connectionUrl, userName, password);
	}
%>
<%
	//여기는 자바문법영역이다.
	//EmpDAO dao= new EmpDAO();
	//List<DeptVO> deptList= EmpDAO.getDeptList();
	List<DeptVO> deptList = new ArrayList<DeptVO>();
		Connection connection = null;
		try{
			connection = getConnection();
			PreparedStatement pstmt = connection.prepareStatement(sqlSelectDeptList);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				DeptVO dept = new DeptVO();
				int deptId = rs.getInt("DEPARTMENT_ID");
				dept.setDeptId(deptId);
				deptList.add(dept);
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		} finally {
			connection.close();
		}
%>
<body>
	deptlist <br>
	<table>
		<tr><td>부서리스트</td><td>
			<select id="deptlist">
					    <% for(int i=0;i<deptList.size();i++) { %>
						<option value="<%= deptList.get(i).getDeptId()%>">
							<%= deptList.get(i).getDeptId()%></option>
						<% } %>
			</select></td></tr>
		<tr><td>부서원리스트</td><td>부서원들</td></tr>
		
	</table>
</body>
</html>