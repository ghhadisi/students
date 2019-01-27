package com.hss.student.entity;

import java.util.ArrayList;
import java.util.List;

public class CityBean {

	private int id;
	private int pid ; 
	private String cname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}




	public static List<CityBean> cityList(){
		List<CityBean> list = new ArrayList<>();
		CityBean item = new CityBean();
		item.setId(1);
		item.setPid(1);
		item.setCname("aaaa");
		list.add(item);


		item = new CityBean();
		item.setId(2);
		item.setPid(2);
		item.setCname("bbbb");
		list.add(item);


		item = new CityBean();
		item.setId(3);
		item.setPid(3);
		item.setCname("cccc");
		list.add(item);
		return list;
	}
	
}
