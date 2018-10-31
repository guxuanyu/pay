package com.ganger;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class PayForm {

	
	@NotEmpty(message="没填全")
	private String user;
	
	@NotNull(message="没填全")
	private Integer money;
	
	
	private String msg;

	public PayForm() {
	}

	public PayForm(String user, Integer money, String msg) {
		this.user = user;
		this.money = money;
		this.msg = msg;
	}


	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
