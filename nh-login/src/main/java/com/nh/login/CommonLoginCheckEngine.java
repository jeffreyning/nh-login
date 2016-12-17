package com.nh.login;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author ninghao
 *
 */
public class CommonLoginCheckEngine implements ILoginCheckEngine {

	public LoginBean getBean(String cookieStr) {
		LoginBean loginBean=new LoginBean();
		String[] strArray=cookieStr.split("&");
		if(strArray==null){
			return null;
		}
		for(String str:strArray){
			String[] kvArray=str.split("=");
			String key=kvArray[0];
			String value=kvArray[0];
			if(key.equals("userName")){
				loginBean.setUserName(value);
			}
			if(key.equals("userId")){
				loginBean.setUserId(value);
			}
			if(key.equals("roles")){
				String rolesArray[]=value.split(",");
				loginBean.setRoles(new ArrayList(Arrays.asList(rolesArray)));
			}
		}
		return loginBean;
	}

	public String getString(LoginBean loginBean) {
		String userId="userId="+loginBean.getUserId();
		String userName="userName="+loginBean.getUserName();
		String roles="";
		List<String> rolesList=loginBean.getRoles();
		if(rolesList!=null){
			int size=rolesList.size();
			for(int i=0;i<size;i++){
				String temp=rolesList.get(i);
				roles=roles+temp;
				if(i<size-1){
					roles=roles+",";
				}
			}
		}
		String retStr=userId+"&"+userName;
		if(roles.length()>0){
			retStr=retStr+"&"+"roles="+roles;
		}
		return retStr;
		
	}


}
