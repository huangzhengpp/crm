package com.softfactory.house.service;


import org.apache.ibatis.annotations.Param;

import com.softfactory.core.util.Pager;
import com.softfactory.pojo.House;

public interface HouseService {
	int delete( Integer hid);
	int updateStatus(House house);
	int updateType(House house);
	int addHouse(House house);
	House findById(Integer hid);
	Pager<House> findPager(@Param("pageno") Integer pageno, 
		      @Param("pagesize") Integer pagesize, 
		      @Param("sort") String sort,
		      @Param("order") String order, 
		      @Param("houseArea") String houseArea, 
		      @Param("houseAddr") String houseAddr, 
		      @Param("housePprice") Double housePprice, 
		      @Param("houseHouses") String houseHouses,
		      @Param("houseTprice") Double houseTprice,
		      @Param("houseModel") String houseModel,
		      @Param("houseDecorate") String houseDecorate,
		      @Param("houseProfee") String houseProfee,
		      @Param("houseAge") String houseAge,
		      @Param("houseSort") String houseSort,
		      @Param("houseConfig") String houseConfig,
		      @Param("houseFacility") String houseFacility,
		      @Param("houseWay") String houseWay,
		      @Param("houseDirection") String houseDirection,
		      @Param("houseMark") String houseMark,
		      @Param("id") Integer id);
	
	 
}
