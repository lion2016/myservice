package com.kidsoft.myservice.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kidsoft.myservice.dao.IMyBeanDao;
import com.kidsoft.myservice.entity.MyBean;

@Service
@Transactional
public class MyBeanService implements IMyBeanService {
	
	private IMyBeanDao mybeanDao;	

	public IMyBeanDao getMybeanDao() {
		return mybeanDao;
	}

	public void setMybeanDao(IMyBeanDao mybeanDao) {
		this.mybeanDao = mybeanDao;
	}

	@Transactional(readOnly = true)
	public List<MyBean> list() {
		return mybeanDao.list();
	}

}
