package com.ly.service;



public class LoginService {
	public boolean login(String custname,String pwd){
		if(custname.equals("ETC")&&pwd.equals("123")){
			return true;
		}else{
			return false;
		}
	}
}
