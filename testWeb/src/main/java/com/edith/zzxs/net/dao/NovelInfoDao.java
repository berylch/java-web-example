package com.edith.zzxs.net.dao;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edith.zzxs.net.entity.NovelInfo;


@Repository
public class NovelInfoDao {

	@Autowired
	SessionFactory sessionFactory;

	public int getCount() {
		String sql = "select count(1) from test.novel_info";
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(sql);
		Object result = query.uniqueResult();
		return ((BigInteger) result).intValue();
	}
	
	/**
	 * ����С˵�б�
	 * @return
	 */
	public List<NovelInfo> getNovelInfoList() {
		String sql = "select * from test.novel_info";
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(sql).addEntity(NovelInfo.class);
		return (List<NovelInfo>) query.list();
	}
	
	/**
	 * ��ҳ�Ƽ�С˵�б�
	 * @return
	 */
	public List<NovelInfo> getNovelAdList() {
		String sql = "select * from test.novel_info";
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(sql).addEntity(NovelInfo.class);
		return (List<NovelInfo>) query.list();
	}
	
	
}
