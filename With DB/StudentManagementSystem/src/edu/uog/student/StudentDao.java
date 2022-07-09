package edu.uog.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {
	public static boolean insertStudentToDB(Student st) throws ClassNotFoundException, SQLException {
		boolean f = false;
		Connection con = CP.creatC();
		
		String q = "insert into students(sname, sphone, scity) values(?, ?, ?)";
		
		PreparedStatement pstmt = con.prepareStatement(q);
		
		pstmt.setString(1, st.getStudentName());
		pstmt.setString(2, st.getStudentPhone());
		pstmt.setString(3, st.getStudentCity());
		
		pstmt.executeUpdate();
		f = true; 
		return f;
		
	}
}
