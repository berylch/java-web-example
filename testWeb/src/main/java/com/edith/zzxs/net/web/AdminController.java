package com.edith.zzxs.net.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.edith.zzxs.net.bean.ImportBean;
import com.edith.zzxs.net.service.AdminService;
import com.edith.zzxs.net.service.NovelInfoService;

@Controller
public class AdminController {

	@Autowired
	AdminService service;
	
	@RequestMapping(value="/importChapter")
	@ResponseBody
	public Map<String,Object> importChapter(ImportBean bean) {
		Map<String,Object> result = new HashMap<String,Object>();
		service.importChapter();
		result.put("success", true);
		return result;
	}
	
	@RequestMapping(value="/importNovel")
	@ResponseBody
	public Map<String,Object> importNovel(ImportBean bean) {
		Map<String,Object> result = new HashMap<String,Object>();
		
		service.importNovel();
		result.put("success", true);
		return result;
	}
}
