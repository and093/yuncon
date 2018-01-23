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

	@Autowired
	private NewsService newsService;

	//获取首页最新的信息，默认显示10条
	@RequestMapping(value = "/last", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
	@ResponseBody
	public NewsBean lastNews() {
		NewsBean bean = new NewsBean();
		return bean;
	}

	//显示新闻列表
	@RequestMapping(value = "/page/{pagenum}", method = RequestMethod.GET)
	public ModelAndView getNewsPage(@PathVariable("pagenum") Integer pagenum) {
		ModelAndView mav = new ModelAndView();  
//		mav.addObject("newsPage", bean);  
		mav.setViewName("newsList");  
		return mav;  
	}
	
	//新闻详细内容
	@RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView getNewsInfo(@PathVariable("id") Integer id) {
		ModelAndView mav = new ModelAndView();  
//		mav.addObject("newsPage", bean);  
		mav.setViewName("newsInfo");  
		return mav;
	}
}
