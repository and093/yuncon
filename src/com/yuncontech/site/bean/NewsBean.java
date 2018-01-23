package com.yuncontech.site.bean;

import org.springframework.data.domain.Page;

import com.yuncontech.site.model.NewsModel;

public class NewsBean {

	private NewsModel news;
	
	private Page<NewsModel> page;

	public NewsModel getNews() {
		return news;
	}

	public void setNews(NewsModel news) {
		this.news = news;
	}

	public Page<NewsModel> getPage() {
		return page;
	}

	public void setPage(Page<NewsModel> page) {
		this.page = page;
	}
	
	
}
