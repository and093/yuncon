package com.yuncontech.site.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table(name = "yun_news_content")
public class NewsContentModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_news_content")
    private Long id;
	
	
	@Lob 
	@Basic(fetch = FetchType.LAZY) 
	@Column(name=" vcontent", nullable=true) 
	private String vcontent;

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVcontent() {
		return vcontent;
	}

	public void setVcontent(String vcontent) {
		this.vcontent = vcontent;
	}
	
}
