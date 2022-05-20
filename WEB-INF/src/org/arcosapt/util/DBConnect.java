package org.arcosapt.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.arcosapt.common.Constant;

public class DBConnect {

	/**
	 * 
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws Exception
	 */
	public Connection getConnection() throws ClassNotFoundException,
			SQLException, Exception {
		//Properties objProp = null;

		//FileInputStream objFIS = null;

		Connection conn = null;

		try {
		//	objFIS = new FileInputStream("dbconfig.properties");
		//	objProp = new Properties();
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vts_demo", "vts","vts");
		} finally {
		//	if (objFIS != null) {
		//		objFIS.close();
		//		objFIS = null;
		//	}
		//	objProp = null;
		}

		return conn;
	}

}
