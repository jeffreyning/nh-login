package com.nh.login;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author ninghao
 *
 */
public class LoginBean {
public String cookieId;
public String userId;
public String userName;
public String getCookieId() {
	return cookieId;
}
public void setCookieId(String cookieId) {
	this.cookieId = cookieId;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public List<String> getRoles() {
	return roles;
}
public void setRoles(List<String> roles) {
	this.roles = roles;
}
public List<String> getAuthors() {
	return authors;
}
public void setAuthors(List<String> authors) {
	this.authors = authors;
}
public List<String> getMenus() {
	return menus;
}
public void setMenus(List<String> menus) {
	this.menus = menus;
}
public Map<String, String> getPropMap() {
	return propMap;
}
public void setPropMap(Map<String, String> propMap) {
	this.propMap = propMap;
}
public List<String> roles;
public List<String> authors;
public List<String> menus;
public Map<String,String> propMap;
}
