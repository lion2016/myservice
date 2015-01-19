package com.kidsoft.myweb.pojo;

import javax.jws.WebResult;

public class HelloService implements IHelloService{
	@WebResult(name="data")
	public String sayHello(String yourName) {
		// TODO Auto-generated method stub
		return "你好,"+yourName;
	}
}
