package com.myb.accounts.dao;

import com.myb.entity.pojo.mos.FreshShop;
import com.myb.entity.pojo.mos.FreshShopMapping;
import com.myb.framework.data.*;
import com.myb.framework.data.suport.MySqlCommandBase;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;


@Repository("freshShopDao")
public class FreshShopDao extends MySqlCommandBase
{

    @Resource(name = "datacommand_write")
    private DataCommand datacommand_write;
    @Resource(name = "datacommand_read")
    private DataCommand datacommand_read;
    @PostConstruct
    public void initDataCommand()
    {
        super.setDataCommand(datacommand_write);
    }
    @Override
    public String getTableName()
    {
        return "fresh_shop";
    }


    public int insert(FreshShop freshShop)
    {
        String sql="INSERT INTO "+getTableName()+" (id,name,cityId,businessArea,isLink,isArea,address,linkNum,telephone,source,isPublic,employeeId,visitTimes,isFinish,process,createTime,latitude,longitude,employeeName,cName,pName,isOtherApp,otherAppName,isFreeVersion,openAccount,bossName,scale,clientLevel,duty,dutyName,mobile,wechat,remark,reason)VALUES(@{id},@{name},@{cityId},@{businessArea},@{isLink},@{isArea},@{address},@{linkNum},@{telephone},@{source},@{isPublic},@{employeeId},@{visitTimes},@{isFinish},@{process},@{createTime},@{latitude},@{longitude},@{employeeName},@{cName},@{pName},@{isOtherApp},@{otherAppName},@{isFreeVersion},@{openAccount},@{bossName},@{scale},@{clientLevel},@{duty},@{dutyName},@{mobile},@{wechat},@{remark},@{reason})";
        SqlParameter sqlParameter=new SqlParameter();
        sqlParameter.add(FreshShopMapping.Id, freshShop.getId());
        sqlParameter.add(FreshShopMapping.Name, freshShop.getName());
        sqlParameter.add(FreshShopMapping.CityId, freshShop.getCityId());
        sqlParameter.add(FreshShopMapping.BusinessArea, freshShop.getBusinessArea());
        sqlParameter.add(FreshShopMapping.IsLink, freshShop.getIsLink());
        sqlParameter.add(FreshShopMapping.IsArea, freshShop.getIsArea());
        sqlParameter.add(FreshShopMapping.Address, freshShop.getAddress());
        sqlParameter.add(FreshShopMapping.LinkNum, freshShop.getLinkNum());
        sqlParameter.add(FreshShopMapping.Telephone, freshShop.getTelephone());
        sqlParameter.add(FreshShopMapping.Source, freshShop.getSource());
        sqlParameter.add(FreshShopMapping.IsPublic, freshShop.getIsPublic());
        sqlParameter.add(FreshShopMapping.EmployeeId, freshShop.getEmployeeId());
        sqlParameter.add(FreshShopMapping.VisitTimes, freshShop.getVisitTimes());
        sqlParameter.add(FreshShopMapping.IsFinish, freshShop.getIsFinish());
        sqlParameter.add(FreshShopMapping.Process, freshShop.getProcess());
        sqlParameter.add(FreshShopMapping.CreateTime, freshShop.getCreateTime());
        sqlParameter.add(FreshShopMapping.Latitude, freshShop.getLatitude());
        sqlParameter.add(FreshShopMapping.Longitude, freshShop.getLongitude());
        sqlParameter.add(FreshShopMapping.EmployeeName, freshShop.getEmployeeName());
        sqlParameter.add(FreshShopMapping.CName, freshShop.getCName());
        sqlParameter.add(FreshShopMapping.PName, freshShop.getPName());
        sqlParameter.add(FreshShopMapping.IsOtherApp, freshShop.getIsOtherApp());
        sqlParameter.add(FreshShopMapping.OtherAppName, freshShop.getOtherAppName());
        sqlParameter.add(FreshShopMapping.IsFreeVersion, freshShop.getIsFreeVersion());
        sqlParameter.add(FreshShopMapping.OpenAccount, freshShop.getOpenAccount());
        sqlParameter.add(FreshShopMapping.BossName, freshShop.getBossName());
        sqlParameter.add(FreshShopMapping.Scale, freshShop.getScale());
        sqlParameter.add(FreshShopMapping.ClientLevel, freshShop.getClientLevel());
        sqlParameter.add(FreshShopMapping.Duty, freshShop.getDuty());
        sqlParameter.add(FreshShopMapping.DutyName, freshShop.getDutyName());
        sqlParameter.add(FreshShopMapping.Mobile, freshShop.getMobile());
        sqlParameter.add(FreshShopMapping.Wechat, freshShop.getWechat());
        sqlParameter.add(FreshShopMapping.Remark, freshShop.getRemark());
        sqlParameter.add(FreshShopMapping.Reason, freshShop.getReason());
        return this.getDataCommand().executeNonQuery(sql, sqlParameter);
    }

    public int update(FreshShop freshShop)
    {
        String sql="UPDATE "+getTableName()+" set name=@{name},cityId=@{cityId},businessArea=@{businessArea},isLink=@{isLink},isArea=@{isArea},address=@{address},linkNum=@{linkNum},telephone=@{telephone},source=@{source},isPublic=@{isPublic},employeeId=@{employeeId},visitTimes=@{visitTimes},isFinish=@{isFinish},process=@{process},createTime=@{createTime},latitude=@{latitude},longitude=@{longitude},employeeName=@{employeeName},cName=@{cName},pName=@{pName},isOtherApp=@{isOtherApp},otherAppName=@{otherAppName},isFreeVersion=@{isFreeVersion},openAccount=@{openAccount},bossName=@{bossName},scale=@{scale},clientLevel=@{clientLevel},duty=@{duty},dutyName=@{dutyName},mobile=@{mobile},wechat=@{wechat},remark=@{remark},reason=@{reason} WHERE id=@{id}";
        SqlParameter sqlParameter=new SqlParameter();
        sqlParameter.add(FreshShopMapping.Id, freshShop.getId());
        sqlParameter.add(FreshShopMapping.Name, freshShop.getName());
        sqlParameter.add(FreshShopMapping.CityId, freshShop.getCityId());
        sqlParameter.add(FreshShopMapping.BusinessArea, freshShop.getBusinessArea());
        sqlParameter.add(FreshShopMapping.IsLink, freshShop.getIsLink());
        sqlParameter.add(FreshShopMapping.IsArea, freshShop.getIsArea());
        sqlParameter.add(FreshShopMapping.Address, freshShop.getAddress());
        sqlParameter.add(FreshShopMapping.LinkNum, freshShop.getLinkNum());
        sqlParameter.add(FreshShopMapping.Telephone, freshShop.getTelephone());
        sqlParameter.add(FreshShopMapping.Source, freshShop.getSource());
        sqlParameter.add(FreshShopMapping.IsPublic, freshShop.getIsPublic());
        sqlParameter.add(FreshShopMapping.EmployeeId, freshShop.getEmployeeId());
        sqlParameter.add(FreshShopMapping.VisitTimes, freshShop.getVisitTimes());
        sqlParameter.add(FreshShopMapping.IsFinish, freshShop.getIsFinish());
        sqlParameter.add(FreshShopMapping.Process, freshShop.getProcess());
        sqlParameter.add(FreshShopMapping.CreateTime, freshShop.getCreateTime());
        sqlParameter.add(FreshShopMapping.Latitude, freshShop.getLatitude());
        sqlParameter.add(FreshShopMapping.Longitude, freshShop.getLongitude());
        sqlParameter.add(FreshShopMapping.EmployeeName, freshShop.getEmployeeName());
        sqlParameter.add(FreshShopMapping.CName, freshShop.getCName());
        sqlParameter.add(FreshShopMapping.PName, freshShop.getPName());
        sqlParameter.add(FreshShopMapping.IsOtherApp, freshShop.getIsOtherApp());
        sqlParameter.add(FreshShopMapping.OtherAppName, freshShop.getOtherAppName());
        sqlParameter.add(FreshShopMapping.IsFreeVersion, freshShop.getIsFreeVersion());
        sqlParameter.add(FreshShopMapping.OpenAccount, freshShop.getOpenAccount());
        sqlParameter.add(FreshShopMapping.BossName, freshShop.getBossName());
        sqlParameter.add(FreshShopMapping.Scale, freshShop.getScale());
        sqlParameter.add(FreshShopMapping.ClientLevel, freshShop.getClientLevel());
        sqlParameter.add(FreshShopMapping.Duty, freshShop.getDuty());
        sqlParameter.add(FreshShopMapping.DutyName, freshShop.getDutyName());
        sqlParameter.add(FreshShopMapping.Mobile, freshShop.getMobile());
        sqlParameter.add(FreshShopMapping.Wechat, freshShop.getWechat());
        sqlParameter.add(FreshShopMapping.Remark, freshShop.getRemark());
        sqlParameter.add(FreshShopMapping.Reason, freshShop.getReason());
        return this.getDataCommand().executeNonQuery(sql, sqlParameter);
    }

    public int delete(long id)
    {
        String sql="DELETE FROM "+getTableName()+" WHERE id=@{id}";
        SqlParameter sqlParameter=new SqlParameter();
        sqlParameter.add(FreshShopMapping.Id,id);
        return this.getDataCommand().executeNonQuery(sql, sqlParameter);
    }

    public FreshShop searchById(long id)
    {
        String sql="SELECT * FROM "+getTableName()+" WHERE id=@{id}";
        SqlParameter sqlParameter=new SqlParameter();
        sqlParameter.add(FreshShopMapping.Id,id);
        return this.datacommand_read.executeEntity(sql, sqlParameter, FreshShop.class);
    }
    public PagedList<FreshShop> searchByPage(QueryCondition queryCondition) {
        PagedList<FreshShop> pagedList=this.searchByPage(queryCondition, FreshShop.class);
        return pagedList;
    }
    public List<FreshShop> searchList(QueryParameter queryParameter) {
                List<FreshShop> list=this.searchList(queryParameter, FreshShop.class);
                    return list;
    }
}
