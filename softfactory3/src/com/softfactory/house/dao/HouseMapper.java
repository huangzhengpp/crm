package com.softfactory.house.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.softfactory.pojo.House;
import com.softfactory.pojo.User;

@Repository("houseMapper")
public interface HouseMapper {
	/**
	 * 删除房源
	 * @param hid
	 * @return
	 */
	@Delete("DELETE from house where HID =#{hid}")
	int delete( Integer hid);
	
	/**
	 *更改房源状态（审核HOUSE_STATUS，租或售的状态，0待审1通过2不通过3已完结）
	 */
	@Update("UPDATE house SET HOUSE_STATUS = #{houseStatus} where HID = #{hid}")
	int updateStatus(House house);
	
	/**
	 * 更改房源使用状态（HOUSE_TYPE，租（0）或卖（1））
	 */
	@Update("UPDATE house SET HOUSE_TYPE = #{houseType} where HID = #{hid}")
	int updateType(House house);
	
	
	/**
	 * 增加房源
	 */
	int addHouse(House house);
	
	
	/**
	 * 查找出所有用户
	 * @return
	 */
	//@Select("select USER_NAME,USER_SEX from USERS")
	List<User> findUser();
	
	
	/**
	 * 通过id查找house
	 * @param hid
	 * @return
	 */
	//@Select("select h.*,u.USER_NAME from house h users u  where h.HOUSE_ID = u.id and  hid = #{hid}")
	House findById(Integer hid);
	
	/**
	 * 分页查询 + 条件查询
	 * @param pageno
	 * @param pagesize
	 * @param sort
	 * @param order
	 * @param houseArea
	 * @param houseAddr
	 * @param housePprice
	 * @param houseHouses
	 * @param houseTprice
	 * @param houseModel
	 * @param houseDecorate
	 * @param houseProfee
	 * @param houseAge
	 * @param houseSort
	 * @Param("houseType") String houseType,
	 * @param houseConfig
	 * @param houseFacility
	 * @param houseWay
	 * @param houseDirection
	 * @param houseMark
	 * @param id
	 * @return
	 */
	 
	  List<House> findPager(
	      @Param("pageno") Integer pageno, 
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
	      @Param("houseType") String houseType,
	      @Param("houseConfig") String houseConfig,
	      @Param("houseFacility") String houseFacility,
	      @Param("houseWay") String houseWay,
	      @Param("houseDirection") String houseDirection,
	      @Param("houseMark") String houseMark,
	      @Param("id") Integer id
	      );
	  
	  /**
	   * 查询分页记录总数 + 条件查询
	   * @param pageno
	   * @param pagesize
	   * @param sort
	   * @param order
	   * @param houseArea
	   * @param houseAddr
	   * @param housePprice
	   * @param houseHouses
	   * @param houseTprice
	   * @param houseModel
	   * @param houseDecorate
	   * @param houseProfee
	   * @param houseAge
	   * @param houseSort
	   * @Param("houseType") String houseType,
	   * @param houseConfig
	   * @param houseFacility
	   * @param houseWay
	   * @param houseDirection
	   * @param houseMark
	   * @param id
	   * @return
	   */   
	  int findPagerTotal(
			  @Param("pageno") Integer pageno, 
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
		      @Param("houseType") String houseType,
		      @Param("houseConfig") String houseConfig,
		      @Param("houseFacility") String houseFacility,
		      @Param("houseWay") String houseWay,
		      @Param("houseDirection") String houseDirection,
		      @Param("houseMark") String houseMark,
		      @Param("id") Integer id);
}
