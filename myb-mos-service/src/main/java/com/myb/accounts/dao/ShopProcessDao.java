package com.myb.accounts.dao;

import com.myb.entity.pojo.mos.ShopProcess;
import com.myb.entity.pojo.mos.ShopProcessMapping;
import com.myb.framework.data.*;
import com.myb.framework.data.suport.MySqlCommandBase;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;


@Repository("shopProcessDao")
public class ShopProcessDao extends MySqlCommandBase
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
        return "shop_process";
    }


    public int insert(ShopProcess shopProcess)
    {
        String sql="INSERT INTO "+getTableName()+" (id,shopId,isEscort,clientLevel,isValide,process,reason,createTime,amount,finishTime,employeeId,note)VALUES(@{id},@{shopId},@{isEscort},@{clientLevel},@{isValide},@{process},@{reason},@{createTime},@{amount},@{finishTime},@{employeeId},@{note})";
        SqlParameter sqlParameter=new SqlParameter();
        sqlParameter.add(ShopProcessMapping.Id, shopProcess.getId());
        sqlParameter.add(ShopProcessMapping.ShopId, shopProcess.getShopId());
        sqlParameter.add(ShopProcessMapping.IsEscort, shopProcess.getIsEscort());
        sqlParameter.add(ShopProcessMapping.ClientLevel, shopProcess.getClientLevel());
        sqlParameter.add(ShopProcessMapping.IsValide, shopProcess.getIsValide());
        sqlParameter.add(ShopProcessMapping.Process, shopProcess.getProcess());
        sqlParameter.add(ShopProcessMapping.Reason, shopProcess.getReason());
        sqlParameter.add(ShopProcessMapping.CreateTime, shopProcess.getCreateTime());
        sqlParameter.add(ShopProcessMapping.Amount, shopProcess.getAmount());
        sqlParameter.add(ShopProcessMapping.FinishTime, shopProcess.getFinishTime());
        sqlParameter.add(ShopProcessMapping.EmployeeId, shopProcess.getEmployeeId());
        sqlParameter.add(ShopProcessMapping.Note, shopProcess.getNote());
        return this.getDataCommand().executeNonQuery(sql, sqlParameter);
    }

    public int update(ShopProcess shopProcess)
    {
        String sql="UPDATE "+getTableName()+" set shopId=@{shopId},isEscort=@{isEscort},clientLevel=@{clientLevel},isValide=@{isValide},process=@{process},reason=@{reason},createTime=@{createTime},amount=@{amount},finishTime=@{finishTime},employeeId=@{employeeId},note=@{note} WHERE id=@{id}";
        SqlParameter sqlParameter=new SqlParameter();
        sqlParameter.add(ShopProcessMapping.Id, shopProcess.getId());
        sqlParameter.add(ShopProcessMapping.ShopId, shopProcess.getShopId());
        sqlParameter.add(ShopProcessMapping.IsEscort, shopProcess.getIsEscort());
        sqlParameter.add(ShopProcessMapping.ClientLevel, shopProcess.getClientLevel());
        sqlParameter.add(ShopProcessMapping.IsValide, shopProcess.getIsValide());
        sqlParameter.add(ShopProcessMapping.Process, shopProcess.getProcess());
        sqlParameter.add(ShopProcessMapping.Reason, shopProcess.getReason());
        sqlParameter.add(ShopProcessMapping.CreateTime, shopProcess.getCreateTime());
        sqlParameter.add(ShopProcessMapping.Amount, shopProcess.getAmount());
        sqlParameter.add(ShopProcessMapping.FinishTime, shopProcess.getFinishTime());
        sqlParameter.add(ShopProcessMapping.EmployeeId, shopProcess.getEmployeeId());
        sqlParameter.add(ShopProcessMapping.Note, shopProcess.getNote());
        return this.getDataCommand().executeNonQuery(sql, sqlParameter);
    }

    public int delete(long id)
    {
        String sql="DELETE FROM "+getTableName()+" WHERE id=@{id}";
        SqlParameter sqlParameter=new SqlParameter();
        sqlParameter.add(ShopProcessMapping.Id,id);
        return this.getDataCommand().executeNonQuery(sql, sqlParameter);
    }

    public ShopProcess searchById(long id)
    {
        String sql="SELECT * FROM "+getTableName()+" WHERE id=@{id}";
        SqlParameter sqlParameter=new SqlParameter();
        sqlParameter.add(ShopProcessMapping.Id,id);
        return this.datacommand_read.executeEntity(sql, sqlParameter, ShopProcess.class);
    }
    public PagedList<ShopProcess> searchByPage(QueryCondition queryCondition) {
        PagedList<ShopProcess> pagedList=this.searchByPage(queryCondition, ShopProcess.class);
        return pagedList;
    }
    public List<ShopProcess> searchList(QueryParameter queryParameter) {
                List<ShopProcess> list=this.searchList(queryParameter, ShopProcess.class);
                    return list;
    }
}
