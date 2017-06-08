package com.softfactory.pojo;
import com.softfactory.pojo.Customer;
import com.softfactory.pojo.Follow;
import com.softfactory.pojo.Orders;
public class Request implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private Integer rid;
    private Integer requestCid;
    private String reqModel;
    private double reqPprice;
    private String reqType;
    private String reqConfig;
    private String reqAddr;
    private String reqDecorate;
    private String reqAge;
    private String reqArea;
    private double reqTprice;
    private String reqDirection;
    private String reqProfee;
    private String reqMark;
    private String reqStatus;
    private java.sql.Date reqTime;
    private Customer customer;
    private java.util.List<Follow> follow;
    private java.util.List<Orders> orders;
    public Integer getRid() {
        return this.rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getRequestCid() {
        return this.requestCid;
    }

    public void setRequestCid(Integer requestCid) {
        this.requestCid = requestCid;
    }

    public String getReqModel() {
        return this.reqModel;
    }

    public void setReqModel(String reqModel) {
        this.reqModel = reqModel;
    }

    public double getReqPprice() {
        return this.reqPprice;
    }

    public void setReqPprice(double reqPprice) {
        this.reqPprice = reqPprice;
    }

    public String getReqType() {
        return this.reqType;
    }

    public void setReqType(String reqType) {
        this.reqType = reqType;
    }

    public String getReqConfig() {
        return this.reqConfig;
    }

    public void setReqConfig(String reqConfig) {
        this.reqConfig = reqConfig;
    }

    public String getReqAddr() {
        return this.reqAddr;
    }

    public void setReqAddr(String reqAddr) {
        this.reqAddr = reqAddr;
    }

    public String getReqDecorate() {
        return this.reqDecorate;
    }

    public void setReqDecorate(String reqDecorate) {
        this.reqDecorate = reqDecorate;
    }

    public String getReqAge() {
        return this.reqAge;
    }

    public void setReqAge(String reqAge) {
        this.reqAge = reqAge;
    }

    public String getReqArea() {
        return this.reqArea;
    }

    public void setReqArea(String reqArea) {
        this.reqArea = reqArea;
    }

    public double getReqTprice() {
        return this.reqTprice;
    }

    public void setReqTprice(double reqTprice) {
        this.reqTprice = reqTprice;
    }

    public String getReqDirection() {
        return this.reqDirection;
    }

    public void setReqDirection(String reqDirection) {
        this.reqDirection = reqDirection;
    }

    public String getReqProfee() {
        return this.reqProfee;
    }

    public void setReqProfee(String reqProfee) {
        this.reqProfee = reqProfee;
    }

    public String getReqMark() {
        return this.reqMark;
    }

    public void setReqMark(String reqMark) {
        this.reqMark = reqMark;
    }

    public String getReqStatus() {
        return this.reqStatus;
    }

    public void setReqStatus(String reqStatus) {
        this.reqStatus = reqStatus;
    }

   
    public java.sql.Date getReqTime() {
		return reqTime;
	}

	public void setReqTime(java.sql.Date reqTime) {
		this.reqTime = reqTime;
	}

	public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public java.util.List<Follow> getFollow() {
        return this.follow;
    }

    public void setFollow(java.util.List<Follow> follow) {
        this.follow = follow;
    }

    public java.util.List<Orders> getOrders() {
        return this.orders;
    }

    public void setOrders(java.util.List<Orders> orders) {
        this.orders = orders;
    }

}
