package com.yuncontech.site.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "yun_news")
public class NewsModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_news")
    private Long id;
	
	@Column(name = "title", length = 100, nullable = false)
	private String title;
	
	@Column(name = "author", length = 50)
	private String author;
	
	@Column(name = "createdate", columnDefinition="char(10)")
	private String createdate;
	
	@Column(name = "srcurl", length = 100)
	private String srcurl;
	
	@Column(name = "vabstract", length = 200)
	private String vabstract;
	
	@Column(name = "newstype")
	private Integer newstype;
	
	@Column(name = "imgurl", length = 200)
	private String imgurl;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="pk_news_content")
	private NewsContentModel vcontent;

	@Temporal(TemporalType.TIMESTAMP) 
	@Column(name = "createtime")
	private Date createtime;
	
	
	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getVabstract() {
		return vabstract;
	}

	public void setVabstract(String vabstract) {
		this.vabstract = vabstract;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Integer getNewstype() {
		return newstype;
	}

	public void setNewstype(Integer newstype) {
		this.newstype = newstype;
	}

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

	public NewsContentModel getVcontent() {
		return vcontent;
	}

	public void setVcontent(NewsContentModel vcontent) {
		this.vcontent = vcontent;
	}

}
