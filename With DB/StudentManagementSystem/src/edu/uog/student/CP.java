package edu.uog.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
	static Connection con;
	public static Connection creatC() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String user = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/student_manage";
		con = DriverManager.getConnection(url, user, password);
		return con;
	}

}
