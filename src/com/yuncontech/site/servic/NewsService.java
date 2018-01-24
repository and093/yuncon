package com.yuncontech.site.servic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.yuncontech.site.dao.NewsDao;
import com.yuncontech.site.model.NewsModel;

@Service
public class NewsService {

	@Autowired
	private NewsDao dao;
	
	public List<NewsModel> lastNews() {
		return dao.queryTopNews();	
	}

	public Page<NewsModel> findPage(int pageNum, int pageSize) {
		Order order = new Order(Sort.Direction.DESC, "createtime");
		Sort sort = new Sort(order);
		return dao.findAll(new PageRequest(pageNum - 1, pageSize, sort));
	}
	
	public NewsModel findNewsById(Long id) {
		return dao.findOne(id);
	}
}
