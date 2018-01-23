package com.yuncontech.site.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.yuncontech.site.model.NewsModel;

@Repository
public interface NewsDao extends JpaRepository<NewsModel, Long>, JpaSpecificationExecutor<NewsModel> {
}