package com.softfactory.pojo;


import java.sql.Date;


/**
 * Task entity. @author MyEclipse Persistence Tools
 */

public class Task implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer tid;
	private User user;
	private Integer taskHouse;
	private Double taskSales;
	private Date taskTime;
	private Integer taskCustomer;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getTaskHouse() {
		return taskHouse;
	}
	public void setTaskHouse(Integer taskHouse) {
		this.taskHouse = taskHouse;
	}
	public Double getTaskSales() {
		return taskSales;
	}
	public void setTaskSales(Double taskSales) {
		this.taskSales = taskSales;
	}
	public Date getTaskTime() {
		return taskTime;
	}
	public void setTaskTime(Date taskTime) {
		this.taskTime = taskTime;
	}
	public Integer getTaskCustomer() {
		return taskCustomer;
	}
	public void setTaskCustomer(Integer taskCustomer) {
		this.taskCustomer = taskCustomer;
	}

}