package com.myb.entity.pojo.mos;

import com.myb.framework.data.DataMapping;
import com.myb.framework.data.EntityBase;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.myb.framework.serialization.JsonLongDateFormatSerializer;

public class FreshShop extends EntityBase{

    @DataMapping(FreshShopMapping.Id)
    private long id;//
    @DataMapping(FreshShopMapping.Name)
    private String name;//
    @DataMapping(FreshShopMapping.CityId)
    private long cityId;//
    @DataMapping(FreshShopMapping.BusinessArea)
    private String businessArea;//商圈
    @DataMapping(FreshShopMapping.IsLink)
    private int isLink;//是否连锁：0非连锁；1连锁
    @DataMapping(FreshShopMapping.IsArea)
    private int isArea;//是否区域内：0在区域内，1非区域
    @DataMapping(FreshShopMapping.Address)
    private String address;//
    @DataMapping(FreshShopMapping.LinkNum)
    private int linkNum;//连锁数量
    @DataMapping(FreshShopMapping.Telephone)
    private String telephone;//座机电话
    @DataMapping(FreshShopMapping.Source)
    private String source;//来源：自己/介绍
    @DataMapping(FreshShopMapping.IsPublic)
    private int isPublic;//是否公海1/私海0
    @DataMapping(FreshShopMapping.EmployeeId)
    private long employeeId;//业务员id
    @DataMapping(FreshShopMapping.VisitTimes)
    private int visitTimes;//拜访次数
    @DataMapping(FreshShopMapping.IsFinish)
    private int isFinish;//0未签单，1签单
    @DataMapping(FreshShopMapping.Process)
    private String process;//当前进度（播种；收割，肥田）
    @DataMapping(FreshShopMapping.CreateTime)
    private java.sql.Timestamp createTime;//
    @DataMapping(FreshShopMapping.Latitude)
    private String latitude;//纬度
    @DataMapping(FreshShopMapping.Longitude)
    private String longitude;//
    @DataMapping(FreshShopMapping.EmployeeName)
    private String employeeName;//
    @DataMapping(FreshShopMapping.CName)
    private String cName;//
    @DataMapping(FreshShopMapping.PName)
    private String pName;//
    @DataMapping(FreshShopMapping.IsOtherApp)
    private int isOtherApp;//是否有其他app，0无，1有
    @DataMapping(FreshShopMapping.OtherAppName)
    private String otherAppName;//
    @DataMapping(FreshShopMapping.IsFreeVersion)
    private int isFreeVersion;//0:免费版
    @DataMapping(FreshShopMapping.OpenAccount)
    private String openAccount;//账号
    @DataMapping(FreshShopMapping.BossName)
    private String bossName;//
    @DataMapping(FreshShopMapping.Scale)
    private String scale;//
    @DataMapping(FreshShopMapping.ClientLevel)
    private String clientLevel;//
    @DataMapping(FreshShopMapping.Duty)
    private int duty;//
    @DataMapping(FreshShopMapping.DutyName)
    private String dutyName;//
    @DataMapping(FreshShopMapping.Mobile)
    private String mobile;//
    @DataMapping(FreshShopMapping.Wechat)
    private String wechat;//
    @DataMapping(FreshShopMapping.Remark)
    private String remark;//
    @DataMapping(FreshShopMapping.Reason)
    private String reason;//


    public FreshShop() { }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public long getCityId()
    {
        return cityId;
    }

    public void setCityId(long cityId)
    {
        this.cityId = cityId;
    }
    public String getBusinessArea()
    {
        return businessArea;
    }

    public void setBusinessArea(String businessArea)
    {
        this.businessArea = businessArea;
    }
    public int getIsLink()
    {
        return isLink;
    }

    public void setIsLink(int isLink)
    {
        this.isLink = isLink;
    }
    public int getIsArea()
    {
        return isArea;
    }

    public void setIsArea(int isArea)
    {
        this.isArea = isArea;
    }
    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
    public int getLinkNum()
    {
        return linkNum;
    }

    public void setLinkNum(int linkNum)
    {
        this.linkNum = linkNum;
    }
    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }
    public String getSource()
    {
        return source;
    }

    public void setSource(String source)
    {
        this.source = source;
    }
    public int getIsPublic()
    {
        return isPublic;
    }

    public void setIsPublic(int isPublic)
    {
        this.isPublic = isPublic;
    }
    public long getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(long employeeId)
    {
        this.employeeId = employeeId;
    }
    public int getVisitTimes()
    {
        return visitTimes;
    }

    public void setVisitTimes(int visitTimes)
    {
        this.visitTimes = visitTimes;
    }
    public int getIsFinish()
    {
        return isFinish;
    }

    public void setIsFinish(int isFinish)
    {
        this.isFinish = isFinish;
    }
    public String getProcess()
    {
        return process;
    }

    public void setProcess(String process)
    {
        this.process = process;
    }
    @JsonSerialize(using = JsonLongDateFormatSerializer.class)
    public java.sql.Timestamp getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(java.sql.Timestamp createTime)
    {
        this.createTime = createTime;
    }
    public String getLatitude()
    {
        return latitude;
    }

    public void setLatitude(String latitude)
    {
        this.latitude = latitude;
    }
    public String getLongitude()
    {
        return longitude;
    }

    public void setLongitude(String longitude)
    {
        this.longitude = longitude;
    }
    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }
    public String getCName()
    {
        return cName;
    }

    public void setCName(String cName)
    {
        this.cName = cName;
    }
    public String getPName()
    {
        return pName;
    }

    public void setPName(String pName)
    {
        this.pName = pName;
    }
    public int getIsOtherApp()
    {
        return isOtherApp;
    }

    public void setIsOtherApp(int isOtherApp)
    {
        this.isOtherApp = isOtherApp;
    }
    public String getOtherAppName()
    {
        return otherAppName;
    }

    public void setOtherAppName(String otherAppName)
    {
        this.otherAppName = otherAppName;
    }
    public int getIsFreeVersion()
    {
        return isFreeVersion;
    }

    public void setIsFreeVersion(int isFreeVersion)
    {
        this.isFreeVersion = isFreeVersion;
    }
    public String getOpenAccount()
    {
        return openAccount;
    }

    public void setOpenAccount(String openAccount)
    {
        this.openAccount = openAccount;
    }
    public String getBossName()
    {
        return bossName;
    }

    public void setBossName(String bossName)
    {
        this.bossName = bossName;
    }
    public String getScale()
    {
        return scale;
    }

    public void setScale(String scale)
    {
        this.scale = scale;
    }
    public String getClientLevel()
    {
        return clientLevel;
    }

    public void setClientLevel(String clientLevel)
    {
        this.clientLevel = clientLevel;
    }
    public int getDuty()
    {
        return duty;
    }

    public void setDuty(int duty)
    {
        this.duty = duty;
    }
    public String getDutyName()
    {
        return dutyName;
    }

    public void setDutyName(String dutyName)
    {
        this.dutyName = dutyName;
    }
    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }
    public String getWechat()
    {
        return wechat;
    }

    public void setWechat(String wechat)
    {
        this.wechat = wechat;
    }
    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }
    public String getReason()
    {
        return reason;
    }

    public void setReason(String reason)
    {
        this.reason = reason;
    }

}
