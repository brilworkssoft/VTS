package org.arcosapt.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.arcosapt.common.Constant;
import org.arcosapt.util.DBConnect;

/**
 * This Class is common for all dataBase Transaction
 * 
 * 
 * @author Hitesh R. Umaletiya
 * @version 1.0.0
 * @date 2013-02-11
 *
 */
public class DBCommonMethod {

	/**
	 * This method make connection with database and check that given user is
	 * valid user or not.
	 * 
	 * @param userName
	 *            userName to check with database
	 * @param password
	 *            password is compared with database stored password
	 * @return true if user is valid else return false;
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws Exception
	 */
	public boolean isAuthenticated(String userName, String password)
			throws ClassNotFoundException, SQLException, Exception {
		// object of connection, PreparedStatement and ResultSet class are
		// created
		Connection objConnection = null;
		PreparedStatement objStatement = null;
		ResultSet objResultSet = null;

		//create object of DBConnect
		DBConnect objDbConnect = null;
		try {
			objDbConnect = new DBConnect();
			objConnection = objDbConnect.getConnection();
			//check that connection must not be close or null
			if (objConnection != null && !objConnection.isClosed()) {
				//pass query to prepared statement
				objStatement = objConnection
						.prepareStatement(Constant.QRY_SELECT_LOGIN_USER);
				//pass parameters to prepared statements
				objStatement.setString(1, userName);
				objStatement.setString(2, password);
				//execute query
				objResultSet = objStatement.executeQuery();
				//if result set contain element than return true
				if (objResultSet.next()) {
					return true;
				}
			}
		//release all system resources
		} finally {
			if (objResultSet != null) {
				objResultSet.close();
				objResultSet = null;
			}
			if (objStatement != null) {
				objStatement.close();
				objStatement = null;
			}
			if (objConnection != null) {
				objConnection.close();
				objConnection = null;
			}
			objDbConnect = null;
		}
		return false;
	}
}
