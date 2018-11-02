package com.spring.springBoot.domain;

/**
 * 描述：
 * 创建人：menglingfa
 * 创建时间：2018/11/1
 * 版本：1.0
 */
public class User
{
	private String userName;
	private String passWord;

	public User()
	{
	}

	public User(String userName, String passWord)
	{
		this.userName = userName;
		this.passWord = passWord;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPassWord()
	{
		return passWord;
	}

	public void setPassWord(String passWord)
	{
		this.passWord = passWord;
	}
}
