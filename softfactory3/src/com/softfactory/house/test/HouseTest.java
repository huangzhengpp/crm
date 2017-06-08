package com.softfactory.house.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softfactory.core.util.Pager;
import com.softfactory.house.service.HouseService;
import com.softfactory.pojo.House;
import com.softfactory.pojo.User;

public class HouseTest {
	private HouseService service;
	@Before
	public void init(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		service = ctx.getBean("houseService", HouseService.class);
	}
	@Test
	public void test1(){
		
		System.out.println(service.findById(1).getUser().getUsername());
	}
	@Test//findPager
	public void test2(){
		int pageno =0;
		int pagesize =6;
	Pager<House> list = service.findPager(pageno, pagesize, "houseArea", "asc",  null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null, null,null);
	for(House h : list.getRows()){
		System.out.println(h);
	}
	}
	@Test//
	public void test3(){
		List<User> user = service.findUser();
		System.out.println(user.size());
		for(User u:user){
			System.out.println(u.getUsername());
		}
	}
	@Test
	//findById
	public void test4(){
		House house = new House();
		house = service.findById(2);
		System.out.println(house.toString());
	}
	@Test//addHouse
	public void test5(){
		House house = new House();
		User user  = new User();
		user.setId(2);
		house.setHouseAddr("北京天安门");
		house.setUser(user);;
		house.setHouseAge("20");
		house.setHouseArea("200平米");
		house.setHouseDecorate("精装");;
		house.setHouseConfig("带车库");
		house.setHouseDirection("朝南");
		house.setHouseStatus("1");
		house.setHouseType("0");
		house.setHouseLandlord("大卫");
		house.setHouseLandlordSex("男");
		house.setHouseLandlordPhone("123323222");
		service.addHouse(house);
	}
	@Test
	public void test6(){
		service.delete(112);
	}
	@Test//updateStatus
	public void test7(){
		House house = new House();
		house.setHid(113);
		house.setHouseStatus("2");
		service.updateStatus(house);
	}
	@Test//updateType
	public void test8(){
		House house = new House();
		house.setHid(113);
		house.setHouseType("5");
		service.updateType(house);
	}
}
