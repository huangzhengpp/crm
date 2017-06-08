package com.softfactory.pojo;




import java.util.Date;
import java.util.ArrayList;

import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;



/**
 * House entity. @author MyEclipse Persistence Tools
 */

public class House implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer hid;
	private User user;
	private String houseArea;
	private String houseAddr;
	private Double housePprice;
	private String houseHouses;
	private Double houseTprice;
	private String houseModel;
	private String houseDecorate;
	private String houseProfee;
	private String houseAge;
	private String houseSort;
	private String houseType;
	private String houseConfig;
	private String houseFacility;
	private String houseWay;
	private String houseDirection;
	private String houseMark;
	private String houseStatus;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date houseTime;
	private String houseLandlord;
	private String houseLandlordSex;
	private String houseLandlordMark;
	private String houseLandlordPhone;
	private List<Orders> orderses =new ArrayList<Orders>();
	private  List<Images> imageses = new ArrayList<Images>();
	private List<Follow> follows = new ArrayList<Follow>();
	
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getHouseArea() {
		return houseArea;
	}
	public void setHouseArea(String houseArea) {
		this.houseArea = houseArea;
	}
	public String getHouseAddr() {
		return houseAddr;
	}
	public void setHouseAddr(String houseAddr) {
		this.houseAddr = houseAddr;
	}
	public Double getHousePprice() {
		return housePprice;
	}
	public void setHousePprice(Double housePprice) {
		this.housePprice = housePprice;
	}
	public String getHouseHouses() {
		return houseHouses;
	}
	public void setHouseHouses(String houseHouses) {
		this.houseHouses = houseHouses;
	}
	public Double getHouseTprice() {
		return houseTprice;
	}
	public void setHouseTprice(Double houseTprice) {
		this.houseTprice = houseTprice;
	}
	public String getHouseModel() {
		return houseModel;
	}
	public void setHouseModel(String houseModel) {
		this.houseModel = houseModel;
	}
	public String getHouseDecorate() {
		return houseDecorate;
	}
	public void setHouseDecorate(String houseDecorate) {
		this.houseDecorate = houseDecorate;
	}
	public String getHouseProfee() {
		return houseProfee;
	}
	public void setHouseProfee(String houseProfee) {
		this.houseProfee = houseProfee;
	}
	public String getHouseAge() {
		return houseAge;
	}
	public void setHouseAge(String houseAge) {
		this.houseAge = houseAge;
	}
	public String getHouseSort() {
		return houseSort;
	}
	public void setHouseSort(String houseSort) {
		this.houseSort = houseSort;
	}
	public String getHouseType() {
		return houseType;
	}
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	public String getHouseConfig() {
		return houseConfig;
	}
	public void setHouseConfig(String houseConfig) {
		this.houseConfig = houseConfig;
	}
	public String getHouseFacility() {
		return houseFacility;
	}
	public void setHouseFacility(String houseFacility) {
		this.houseFacility = houseFacility;
	}
	public String getHouseWay() {
		return houseWay;
	}
	public void setHouseWay(String houseWay) {
		this.houseWay = houseWay;
	}
	public String getHouseDirection() {
		return houseDirection;
	}
	public void setHouseDirection(String houseDirection) {
		this.houseDirection = houseDirection;
	}
	public String getHouseMark() {
		return houseMark;
	}
	public void setHouseMark(String houseMark) {
		this.houseMark = houseMark;
	}
	public String getHouseStatus() {
		return houseStatus;
	}
	public void setHouseStatus(String houseStatus) {
		this.houseStatus = houseStatus;
	}
	public Date getHouseTime() {
		return houseTime;
	}
	public void setHouseTime(Date houseTime) {
		this.houseTime = houseTime;
	}
	public String getHouseLandlord() {
		return houseLandlord;
	}
	public void setHouseLandlord(String houseLandlord) {
		this.houseLandlord = houseLandlord;
	}
	public String getHouseLandlordSex() {
		return houseLandlordSex;
	}
	public void setHouseLandlordSex(String houseLandlordSex) {
		this.houseLandlordSex = houseLandlordSex;
	}
	public String getHouseLandlordMark() {
		return houseLandlordMark;
	}
	public void setHouseLandlordMark(String houseLandlordMark) {
		this.houseLandlordMark = houseLandlordMark;
	}
	public String getHouseLandlordPhone() {
		return houseLandlordPhone;
	}
	public void setHouseLandlordPhone(String houseLandlordPhone) {
		this.houseLandlordPhone = houseLandlordPhone;
	}
	public List<Orders> getOrderses() {
		return orderses;
	}
	public void setOrderses(List<Orders> orderses) {
		this.orderses = orderses;
	}
	public List<Images> getImageses() {
		return imageses;
	}
	public void setImageses(List<Images> imageses) {
		this.imageses = imageses;
	}
	public List<Follow> getFollows() {
		return follows;
	}
	public void setFollows(List<Follow> follows) {
		this.follows = follows;
	}
	@Override
	public String toString() {
		return "House [hid=" + hid + ", user=" + user + ", houseArea=" + houseArea + ", houseAddr=" + houseAddr
				+ ", housePprice=" + housePprice + ", houseHouses=" + houseHouses + ", houseTprice=" + houseTprice
				+ ", houseModel=" + houseModel + ", houseDecorate=" + houseDecorate + ", houseProfee=" + houseProfee
				+ ", houseAge=" + houseAge + ", houseSort=" + houseSort + ", houseType=" + houseType + ", houseConfig="
				+ houseConfig + ", houseFacility=" + houseFacility + ", houseWay=" + houseWay + ", houseDirection="
				+ houseDirection + ", houseMark=" + houseMark + ", houseStatus=" + houseStatus + ", houseTime="
				+ houseTime + ", houseLandlord=" + houseLandlord + ", houseLandlordSex=" + houseLandlordSex
				+ ", houseLandlordMark=" + houseLandlordMark + ", houseLandlordPhone=" + houseLandlordPhone
				+ ", orderses=" + orderses + ", imageses=" + imageses + ", follows=" + follows + "]";
	}
	
}