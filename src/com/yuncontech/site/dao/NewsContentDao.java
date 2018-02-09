package com.yuncontech.site.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.yuncontech.site.model.NewsContentModel;

@Repository
public interface NewsContentDao extends JpaRepository<NewsContentModel, Long>, JpaSpecificationExecutor<NewsContentModel> {
	
	
}