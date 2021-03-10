package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "member")
public class Member {
	@Id
	@GeneratedValue
	private long seq;

	@Column
	private String id;
	@Column
	private String password;
	@Column
	private String name;
	public Member(){
		super();
	}
	public Member( String id, String password, String name) {
		
		
		this.id = id;
		this.password = password;
		this.name = name;
	}
	public long getSeq() {
		return seq;
	}
	public void setSeq(long seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	

	

}
