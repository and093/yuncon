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
@Table(name = "yun_news")
public class NewsModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_news")
    private Long id;
	
	@Column(name = "title", length = 200, nullable = false)
	private String title;
	
	@Column(name = "author", length = 100)
	private String author;
	
	@Column(name = "createdate", columnDefinition="char(10)")
	private String createdate;
	
	@Column(name = "srcurl", length = 200)
	private String srcurl;
	
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public String getSrcurl() {
		return srcurl;
	}

	public void setSrcurl(String srcurl) {
		this.srcurl = srcurl;
	}

	public String getVcontent() {
		return vcontent;
	}

	public void setVcontent(String vcontent) {
		this.vcontent = vcontent;
	}
	
}
