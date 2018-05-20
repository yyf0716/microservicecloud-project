package com.yyf.springcloud;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private static final long serialVersionUID = 730863452165463427L;

	private int id;
	private String account;
	private String password;
	private String name;
	private Date createTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName() + "-" + this.getAccount();
	}

}