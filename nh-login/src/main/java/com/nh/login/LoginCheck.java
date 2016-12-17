package com.nh.login;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author ninghao
 *
 */
public class LoginCheck {
	public static ILoginCheckEngine checkEngine = new CommonLoginCheckEngine();

	public static void setLogin(HttpServletResponse response,LoginBean loginBean) throws Exception {
		String cookieStr=checkEngine.getString(loginBean);
		Cookie cookie=new Cookie("nhlogin",cookieStr);
		cookie.setMaxAge(0);
		response.addCookie(cookie);
	}

	public static LoginBean getLogin(HttpServletRequest request) throws Exception {
		Cookie[] cookies= request.getCookies();
		String cookieStr=null;
		for(Cookie cookie:cookies){
			if("nhlogin".equals(cookie.getName())){
				cookieStr=cookie.getValue();
				break;
			}
		}
		if(cookieStr==null){
			return null;
		}
		LoginBean loginBean=checkEngine.getBean(cookieStr);
		return loginBean;
	}

	public static boolean checkLogin(HttpServletRequest request) {
		Cookie[] cookies= request.getCookies();
		for(Cookie cookie:cookies){
			if("nhlogin".equals(cookie.getName())){
				
				return true;
			}
		}
		return false;
	}
	
}
