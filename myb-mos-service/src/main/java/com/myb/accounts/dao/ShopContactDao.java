package com.myb.accounts.dao;

import com.myb.entity.pojo.mos.ShopContact;
import com.myb.entity.pojo.mos.ShopContactMapping;
import com.myb.framework.data.*;
import com.myb.framework.data.suport.MySqlCommandBase;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;


@Repository("shopContactDao")
public class ShopContactDao extends MySqlCommandBase
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
        return "shop_contact";
    }


    public int insert(ShopContact shopContact)
    {
        String sql="INSERT INTO "+getTableName()+" (id,shopId,name,telephone,wechat,duty)VALUES(@{id},@{shopId},@{name},@{telephone},@{wechat},@{duty})";
        SqlParameter sqlParameter=new SqlParameter();
        sqlParameter.add(ShopContactMapping.Id, shopContact.getId());
        sqlParameter.add(ShopContactMapping.ShopId, shopContact.getShopId());
        sqlParameter.add(ShopContactMapping.Name, shopContact.getName());
        sqlParameter.add(ShopContactMapping.Telephone, shopContact.getTelephone());
        sqlParameter.add(ShopContactMapping.Wechat, shopContact.getWechat());
        sqlParameter.add(ShopContactMapping.Duty, shopContact.getDuty());
        return this.getDataCommand().executeNonQuery(sql, sqlParameter);
    }

    public int update(ShopContact shopContact)
    {
        String sql="UPDATE "+getTableName()+" set shopId=@{shopId},name=@{name},telephone=@{telephone},wechat=@{wechat},duty=@{duty} WHERE id=@{id}";
        SqlParameter sqlParameter=new SqlParameter();
        sqlParameter.add(ShopContactMapping.Id, shopContact.getId());
        sqlParameter.add(ShopContactMapping.ShopId, shopContact.getShopId());
        sqlParameter.add(ShopContactMapping.Name, shopContact.getName());
        sqlParameter.add(ShopContactMapping.Telephone, shopContact.getTelephone());
        sqlParameter.add(ShopContactMapping.Wechat, shopContact.getWechat());
        sqlParameter.add(ShopContactMapping.Duty, shopContact.getDuty());
        return this.getDataCommand().executeNonQuery(sql, sqlParameter);
    }

    public int delete(long id)
    {
        String sql="DELETE FROM "+getTableName()+" WHERE id=@{id}";
        SqlParameter sqlParameter=new SqlParameter();
        sqlParameter.add(ShopContactMapping.Id,id);
        return this.getDataCommand().executeNonQuery(sql, sqlParameter);
    }

    public ShopContact searchById(long id)
    {
        String sql="SELECT * FROM "+getTableName()+" WHERE id=@{id}";
        SqlParameter sqlParameter=new SqlParameter();
        sqlParameter.add(ShopContactMapping.Id,id);
        return this.datacommand_read.executeEntity(sql, sqlParameter, ShopContact.class);
    }
    public PagedList<ShopContact> searchByPage(QueryCondition queryCondition) {
        PagedList<ShopContact> pagedList=this.searchByPage(queryCondition, ShopContact.class);
        return pagedList;
    }
    public List<ShopContact> searchList(QueryParameter queryParameter) {
                List<ShopContact> list=this.searchList(queryParameter, ShopContact.class);
                    return list;
    }
}
