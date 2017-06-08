package com.softfactory.pojo;
import com.softfactory.pojo.Request;
public class Follow implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private Integer fid;
    private Integer followId;
    private Integer followRid;
    private Integer followHid;
    private String followTitle;
    private String followDetails;
    private java.sql.Date followTime;
    private Request request;
    public Integer getFid() {
        return this.fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFollowId() {
        return this.followId;
    }

    public void setFollowId(Integer followId) {
        this.followId = followId;
    }

    public Integer getFollowRid() {
        return this.followRid;
    }

    public void setFollowRid(Integer followRid) {
        this.followRid = followRid;
    }

    public Integer getFollowHid() {
        return this.followHid;
    }

    public void setFollowHid(Integer followHid) {
        this.followHid = followHid;
    }

    public String getFollowTitle() {
        return this.followTitle;
    }

    public void setFollowTitle(String followTitle) {
        this.followTitle = followTitle;
    }

    public String getFollowDetails() {
        return this.followDetails;
    }

    public void setFollowDetails(String followDetails) {
        this.followDetails = followDetails;
    }

    public java.sql.Date getFollowTime() {
        return this.followTime;
    }

    public void setFollowTime(java.sql.Date followTime) {
        this.followTime = followTime;
    }

    public Request getRequest() {
        return this.request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

}
