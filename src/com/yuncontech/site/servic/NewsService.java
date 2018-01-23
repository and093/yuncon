package com.yuncontech.site.servic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuncontech.site.dao.NewsDao;

@Service
public class NewsService {

	@Autowired
	private NewsDao dao;
	
}
