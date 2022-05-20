package org.arcosapt.common;

public class Constant {

	// All Local Files
	public static final String PROP_DB_CONFIG = "dbconfig.properties";

	// Property File Keys
	public static final String PROP_DB_CLASS = "class";
	public static final String PROP_DB_CON_STRING = "connstring";
	public static final String PROP_DB_USER = "user";
	public static final String PROP_DB_PASSWORD = "password";

	// Database Querires
	public static final String QRY_SELECT_LOGIN_USER = "SELECT userName FROM vts_user WHERE userName=? AND user_pass=?";

	// redirection links
	public static final String REDIRECT_SUCCESS = "success";
	public static final String REDIRECT_FAIL = "fail";
	public static final String REDIRECT_ERROR = "error";

}
