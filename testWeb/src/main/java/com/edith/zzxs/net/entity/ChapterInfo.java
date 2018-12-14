package com.edith.zzxs.net.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chapter_info")
public class ChapterInfo {

	@Id
	private Long id;
	private String name;
	private Long novel_id;
	private Long words;
	private Timestamp ts;
	private Long dr;
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
	public Long getNovel_id() {
		return novel_id;
	}
	public void setNovel_id(Long novel_id) {
		this.novel_id = novel_id;
	}
	public Long getWords() {
		return words;
	}
	public void setWords(Long words) {
		this.words = words;
	}
	public Timestamp getTs() {
		return ts;
	}
	public void setTs(Timestamp ts) {
		this.ts = ts;
	}
	public Long getDr() {
		return dr;
	}
	public void setDr(Long dr) {
		this.dr = dr;
	}
	
	
}
