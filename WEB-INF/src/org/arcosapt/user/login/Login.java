package org.arcosapt.user.login;

import java.sql.SQLException;

import org.arcosapt.common.Constant;
import org.arcosapt.db.DBCommonMethod;

/**
 * This Class is Login Class Which verify User Is Authenticated or not
 * 
 * @author Administrator
 * @date 2013-02-10
 * @version 1.0.0
 */
public class Login {

	//this is getter and setter method for login user
	private String userName;

	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		DBCommonMethod objDbCommonMethod = null;
		try {
			objDbCommonMethod = new DBCommonMethod();
			if(objDbCommonMethod.isAuthenticated(userName, password)){
				return Constant.REDIRECT_SUCCESS;
			} else {
				return Constant.REDIRECT_FAIL;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return Constant.REDIRECT_ERROR;
		} catch (SQLException e) {
			e.printStackTrace();
			return Constant.REDIRECT_ERROR;
		} catch (Exception e) {
			e.printStackTrace();
			return Constant.REDIRECT_ERROR;
		} finally {
			objDbCommonMethod = null;
		}
	}
}
