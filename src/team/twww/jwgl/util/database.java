package team.twww.jwgl.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class database {
	private static final String url="jdbc:mysql://localhost:3306/manager?serverTimezone=UTC&useSSL=false";
	 private static final String UNAME = "root";
	 private static final String PWD = "1314521..";
	
	public Connection getCon()throws Exception
	 {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(url, UNAME, PWD);
		return conn;
	}
     	 
 }
