package com.yuncontech.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yuncontech.site.bean.NewsBean;
import com.yuncontech.site.servic.NewsService;

@RestController
@RequestMapping(value = "/news")
public class NewsController {

	public static int PAGE_SIZE = 20;
	
	@Autowired
	private NewsService newsService;

	//获取首页最新的信息，默认显示8条
	@RequestMapping(value = "/last", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
	@ResponseBody
	public NewsBean lastNews() {
		NewsBean bean = new NewsBean();
		bean.setToplist(newsService.lastNews());
		return bean;
	}

	//显示新闻列表
	@RequestMapping(value = "/page/{pagenum}", method = RequestMethod.GET)
	public ModelAndView getNewsPage(@PathVariable("pagenum") Integer pagenum) {
		if(pagenum == null){
			pagenum = 1;
		}
		NewsBean bean = new NewsBean();
		bean.setPage(newsService.findPage(pagenum, PAGE_SIZE));
		ModelAndView mav = new ModelAndView();  
		mav.addObject("newsBean", bean);  
		mav.addObject("pagenum", pagenum);  
		mav.setViewName("newsList");  
		return mav;  
	}
	
	//新闻详细内容
	@RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
	public ModelAndView getNewsInfo(@PathVariable("id") Long id) {
		NewsBean bean = new NewsBean();
		bean.setNews(newsService.findNewsById(id));
		ModelAndView mav = new ModelAndView();  
		mav.addObject("newsBean", bean);  
		mav.setViewName("newsInfo");  
		return mav;
	}
}
