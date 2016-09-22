package com.ly.action;

import com.ly.service.LoginService;

public class LoginAction {
	private String custname;
	private String pwd;
	public String getCustname()
	{
		return custname;
	}
	public void setCustname(String custname){
		this.custname=custname;
	}
	public String getPwd(){
		return pwd;
	}
	public void setpwd(String pwd){
		this.pwd=pwd;
	}
	public String execute(){
		
		LoginService ls=new LoginService();
		boolean flag=ls.login(custname,pwd);
		if(flag){
			return "success";
		}else{
			return "fail";
		}
	}
}
