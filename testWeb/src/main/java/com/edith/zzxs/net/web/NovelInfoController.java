package com.edith.zzxs.net.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.edith.zzxs.net.service.NovelInfoService;

@Controller
public class NovelInfoController {

	@Autowired
	NovelInfoService service;

	@RequestMapping(value="/test")
	public ModelAndView test() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("count", service.getCount());
		mv.addObject("list", service.getNovelInfoList());
		mv.setViewName("test001");
		return mv;
	}
	
	@RequestMapping(value="/test/json")
	@ResponseBody
	public Map<String,Object> jsontest() {
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("success", true);
		result.put("root", service.getNovelInfoList());
		return result;
	}
	
	/**
	 * 首页推荐小说列表
	 * @return
	 */
	@RequestMapping(value="/index.htm")
	@ResponseBody
	public Map<String,Object> index() {
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("success", true);
		result.put("root", service.getNovelAdList());
		return result;
	}
	
	/**
	 * 搜索小说列表
	 * @return
	 */
	@RequestMapping(value="/books.htm")
	@ResponseBody
	public Map<String,Object> books() {
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("success", true);
		result.put("root", service.getNovelInfoList());
		return result;
	}
}
