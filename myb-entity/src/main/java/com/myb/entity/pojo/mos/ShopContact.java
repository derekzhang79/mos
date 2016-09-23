package com.myb.entity.pojo.mos;

import com.myb.framework.data.DataMapping;
import com.myb.framework.data.EntityBase;

public class ShopContact extends EntityBase{

    @DataMapping(ShopContactMapping.Id)
    private long id;//
    @DataMapping(ShopContactMapping.ShopId)
    private long shopId;//店id
    @DataMapping(ShopContactMapping.Name)
    private String name;//
    @DataMapping(ShopContactMapping.Telephone)
    private String telephone;//
    @DataMapping(ShopContactMapping.Wechat)
    private String wechat;//微信号
    @DataMapping(ShopContactMapping.Duty)
    private int duty;//职位：老板1，店长2，店员3


    public ShopContact() { }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }
    public long getShopId()
    {
        return shopId;
    }

    public void setShopId(long shopId)
    {
        this.shopId = shopId;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }
    public String getWechat()
    {
        return wechat;
    }

    public void setWechat(String wechat)
    {
        this.wechat = wechat;
    }
    public int getDuty()
    {
        return duty;
    }

    public void setDuty(int duty)
    {
        this.duty = duty;
    }

}
