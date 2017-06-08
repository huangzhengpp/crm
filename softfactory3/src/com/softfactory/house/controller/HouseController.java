package com.softfactory.house.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.softfactory.core.util.JsonDateValueProcessor;
import com.softfactory.core.util.Pager;
import com.softfactory.core.util.UserValueProcessor;
import com.softfactory.house.service.HouseService;
import com.softfactory.pojo.House;
import com.softfactory.pojo.User;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;

@Controller
public class HouseController {
	@Resource(name="houseService")
	private HouseService houseService;
	
	@RequestMapping("/houseController_list")
	public void list(
			@RequestParam(required=true,value="page") Integer page,
			@RequestParam(required=true,value="rows") Integer row,
			@RequestParam(required=true,value="sort") String sort,
			@RequestParam(required=true,value="order") String order,
			@RequestParam(required=false,value="houseArea") String houseArea,
			@RequestParam(required=false,value="houseAddr") String houseAddr,
			@RequestParam(required=false,value="housePprice") Double housePprice,
			@RequestParam(required=false,value="houseHouses") String houseHouses,
			@RequestParam(required=false,value="houseTprice") Double houseTprice,
			@RequestParam(required=false,value="houseModel") String houseModel,
			@RequestParam(required=false,value="houseDecorate") String houseDecorate,
			@RequestParam(required=false,value="houseProfee") String houseProfee,
			@RequestParam(required=false,value="houseAge") String houseAge,
			@RequestParam(required=false,value="houseSort") String houseSort,
			@RequestParam(required=false,value="houseConfig") String houseConfig,
			@RequestParam(required=false,value="houseFacility") String houseFacility,
			@RequestParam(required=false,value="houseWay") String houseWay,
			@RequestParam(required=false,value="houseDirection") String houseDirection,
			@RequestParam(required=false,value="houseTime") String houseTime,
			@RequestParam(required=false,value="id",defaultValue="0") Integer id,
			HttpServletResponse response){
			Integer pageno = (page-1)*row;
			Integer pagesize = page*row;
			Pager<House> pager = 
			houseService.findPager(pageno, pagesize, sort, order, houseArea, houseAddr, housePprice, houseHouses, houseTprice, houseModel, houseDecorate, houseProfee, houseAge, houseSort, houseConfig, houseFacility, houseWay, houseDirection, null, id);
			JsonConfig jsonConfig = new JsonConfig();
			jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
			jsonConfig.registerJsonValueProcessor(User.class, new UserValueProcessor());
			
			JSONObject json = (JSONObject) JSONSerializer.toJSON(pager, jsonConfig);
			try {
				PrintWriter out = response.getWriter();
				out.println(json.toString());
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	@RequestMapping("/houseController_rent_list")
	public void list2(
			@RequestParam(required=true,value="page") Integer page,
			@RequestParam(required=true,value="rows") Integer row,
			@RequestParam(required=true,value="sort") String sort,
			@RequestParam(required=true,value="order") String order,
			@RequestParam(required=false,value="houseArea") String houseArea,
			@RequestParam(required=false,value="houseAddr") String houseAddr,
			@RequestParam(required=false,value="housePprice") Double housePprice,
			@RequestParam(required=false,value="houseHouses") String houseHouses,
			@RequestParam(required=false,value="houseTprice") Double houseTprice,
			@RequestParam(required=false,value="houseModel") String houseModel,
			@RequestParam(required=false,value="houseDecorate") String houseDecorate,
			@RequestParam(required=false,value="houseProfee") String houseProfee,
			@RequestParam(required=false,value="houseAge") String houseAge,
			@RequestParam(required=false,value="houseSort") String houseSort,
			@RequestParam(required=false,value="houseConfig") String houseConfig,
			@RequestParam(required=false,value="houseFacility") String houseFacility,
			@RequestParam(required=false,value="houseWay") String houseWay,
			@RequestParam(required=false,value="houseDirection") String houseDirection,
			@RequestParam(required=false,value="houseTime") String houseTime,
			@RequestParam(required=false,value="id",defaultValue="0") Integer id,
			HttpServletResponse response){
			Integer pageno = (page-1)*row;
			Integer pagesize = page*row;
			Pager<House> pager = 
			houseService.findPager(pageno, pagesize, sort, order, houseArea, houseAddr, housePprice, houseHouses, houseTprice, houseModel, houseDecorate, houseProfee, houseAge, houseSort, houseConfig, houseFacility, houseWay, houseDirection, null, id);
			JsonConfig jsonConfig = new JsonConfig();
			jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
			jsonConfig.registerJsonValueProcessor(User.class, new UserValueProcessor());
			
			JSONObject json = (JSONObject) JSONSerializer.toJSON(pager, jsonConfig);
			try {
				PrintWriter out = response.getWriter();
				out.println(json.toString());
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
