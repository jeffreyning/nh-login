package com.nh.login;

/**
 * 
 * @author ninghao
 *
 */
public interface ILoginCheckEngine {
public String getString(LoginBean loginBean);
public LoginBean getBean(String cookieStr);

}
