package com.kidsoft.myservice.pojo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kidsoft.myservice.entity.MyBean;
import com.kidsoft.myservice.service.IMyBeanService;

public class SpringHelloService implements ISpringHelloService {
	
	@Autowired
	private IMyBeanService mybeanService;
		
	public IMyBeanService getMybeanService() {
		return mybeanService;
	}

	public void setMybeanService(IMyBeanService mybeanService) {
		this.mybeanService = mybeanService;
	}

	public String add(String first,String second) {
		// TODO Auto-generated method stub
		return first+" "+second;
	}

	public List<MyBean> getList() {
		List<MyBean> list = mybeanService.list();		
		return list;
	}

}
