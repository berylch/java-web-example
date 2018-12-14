package com.edith.zzxs.net.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="novel_info")
public class NovelInfo {

	@Id
	private Long id;
	private String name;
	private String author;
	private Long words;
//	private String type;
//	private String state;
//	private Timestamp last_update;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getWords() {
		return words;
	}

	public void setWords(Long words) {
		this.words = words;
	}
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public Timestamp getLast_update() {
//		return last_update;
//	}
//
//	public void setLast_update(Timestamp last_update) {
//		this.last_update = last_update;
//	}

	
	
	
	
	
	
	
}
