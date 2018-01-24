package com.yuncontech.site.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yuncontech.site.model.NewsModel;

@Repository
public interface NewsDao extends JpaRepository<NewsModel, Long>, JpaSpecificationExecutor<NewsModel> {
	
	@Query(value = "SELECT * FROM yun_news  "
			+ " ORDER BY createtime DESC limit 8", nativeQuery = true)
	public List<NewsModel> queryTopNews();	
	
	
}