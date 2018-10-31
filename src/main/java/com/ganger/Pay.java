package com.ganger;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Pay {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String user;
	
	private Integer money;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Timestamp post;
	
	private String msg;

	public Pay() {
	}

	public Pay(Integer id, String user, Integer money, Timestamp post, String msg) {
		this.id = id;
		this.user = user;
		this.money = money;
		this.post = post;
		this.msg = msg;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Timestamp getPost() {
		return post;
	}

	public void setPost(Timestamp post) {
		this.post = post;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
