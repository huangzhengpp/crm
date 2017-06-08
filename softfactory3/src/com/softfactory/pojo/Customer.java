package com.softfactory.pojo;
import com.softfactory.pojo.Request;
public class Customer implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private Integer cid;
    private String custName;
    private Integer custId;
    private String custPhone;
    private String custSex;
    private String custStatus;
    private String custMark;
    private java.sql.Date custTime;
    private java.util.List<Request> request;
    public Integer getCid() {
        return this.cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCustName() {
        return this.custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Integer getCustId() {
        return this.custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustPhone() {
        return this.custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustSex() {
        return this.custSex;
    }

    public void setCustSex(String custSex) {
        this.custSex = custSex;
    }

    public String getCustStatus() {
        return this.custStatus;
    }

    public void setCustStatus(String custStatus) {
        this.custStatus = custStatus;
    }

    public String getCustMark() {
        return this.custMark;
    }

    public void setCustMark(String custMark) {
        this.custMark = custMark;
    }

    public java.sql.Date getCustTime() {
        return this.custTime;
    }

    public void setCustTime(java.sql.Date custTime) {
        this.custTime = custTime;
    }

    public java.util.List<Request> getRequest() {
        return this.request;
    }

    public void setRequest(java.util.List<Request> request) {
        this.request = request;
    }

}
