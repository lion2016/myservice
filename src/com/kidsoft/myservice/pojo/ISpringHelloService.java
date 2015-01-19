package com.kidsoft.myservice.pojo;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;

import com.kidsoft.myservice.entity.MyBean;

public interface ISpringHelloService {
	
	public @WebResult(name="data")String add(@WebParam(name="first")String first,@WebParam(name="second")String second);
	
	public List<MyBean> getList();
}
