package control.exceptionafter;

import java.sql.*;

public class ExceptionPerformanceTest1 {
	public static void main(String[] args) {
		String sql = "select * from employees";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "rootroot");
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery()) {
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
