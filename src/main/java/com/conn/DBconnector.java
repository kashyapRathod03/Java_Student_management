package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnector {

	private static Connection conn = null;

	public static Connection getCon() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root", "MySQL03@");
//			Statement s = conn.createStatement();
//			ResultSet rs = s.executeQuery("select * from members where member_id=");
		} catch (Exception e) {
			System.out.println(e);
		}

		return conn;
	}

}
