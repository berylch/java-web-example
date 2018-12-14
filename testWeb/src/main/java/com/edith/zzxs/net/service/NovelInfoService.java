package com.edith.zzxs.net.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edith.zzxs.net.dao.NovelInfoDao;
import com.edith.zzxs.net.entity.NovelInfo;

@Service
public class NovelInfoService {

	@Autowired
	NovelInfoDao dao;
	
	public int getCount() {
		return dao.getCount();
	}
	
	public List<NovelInfo> getNovelInfoList() {
		return dao.getNovelInfoList();
	}
	
	public List<NovelInfo> getNovelAdList() {
		return dao.getNovelAdList();
	}
}
