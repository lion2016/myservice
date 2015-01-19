package com.kidsoft.myservice.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kidsoft.myservice.common.BaseDao;
import com.kidsoft.myservice.entity.MyBean;

@Repository
public class MyBeanDao extends BaseDao implements IMyBeanDao{

	@SuppressWarnings("unchecked")
	public List<MyBean> list() {
		List<MyBean> list = getHibernateTemplate().find("from MyBean");
		return list;
	}

}
