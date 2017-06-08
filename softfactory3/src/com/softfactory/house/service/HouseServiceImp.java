package com.softfactory.house.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.softfactory.core.util.Pager;
import com.softfactory.house.dao.HouseMapper;
import com.softfactory.pojo.House;
import com.softfactory.pojo.User;
@Service("houseService")
@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
public class HouseServiceImp implements HouseService {
	@Resource(name="houseMapper")
	private HouseMapper houseMapper;
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	@Override
	public int delete(Integer hid) {
		// TODO Auto-generated method stub
		return houseMapper.delete(hid);
	}
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	@Override
	public int updateStatus(House house) {
		// TODO Auto-generated method stub
		return houseMapper.updateStatus(house);
	}
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	@Override
	public int updateType(House house) {
		// TODO Auto-generated method stub
		return houseMapper.updateType(house);
	}
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	@Override
	public int addHouse(House house) {
		// TODO Auto-generated method stub
		return houseMapper.addHouse(house);
	}

	@Override
	public House findById(Integer hid) {
		// TODO Auto-generated method stub
		return houseMapper.findById(hid);
	}
	@Override
	public Pager<House> findPager(Integer pageno, Integer pagesize, String sort, String order, String houseArea,
			String houseAddr, Double housePprice, String houseHouses, Double houseTprice, String houseModel,
			String houseDecorate, String houseProfee, String houseAge, String houseSort,String houseType, String houseConfig,
			String houseFacility, String houseWay, String houseDirection, String houseMark, Integer id) {

		Pager<House> pager = new Pager<House>();
		//设置分页数据
		pager.setRows(houseMapper.findPager(pageno, pagesize, sort, order, houseArea, houseAddr, housePprice, houseHouses, houseTprice, houseModel, houseDecorate, houseProfee, houseAge, houseSort, houseType, houseConfig, houseFacility, houseWay, houseDirection, houseMark, id));

		//设置数据总数
		pager.setTotal(houseMapper.findPagerTotal(pageno, pagesize, sort, order, houseArea, houseAddr, housePprice, houseHouses, houseTprice, houseModel, houseDecorate, houseProfee, houseAge, houseSort, houseType, houseConfig, houseFacility, houseWay, houseDirection, houseMark, id));
		return pager;
	}
	@Override
	public List<User> findUser() {
		// TODO Auto-generated method stub
		return houseMapper.findUser();
	}

	
	

	

}
