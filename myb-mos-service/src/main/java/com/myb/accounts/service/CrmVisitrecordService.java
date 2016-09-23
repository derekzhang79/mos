package com.myb.accounts.service;

import com.myb.entity.pojo.mos.CrmVisitrecord;
import com.myb.framework.data.EntityBase;
import com.myb.framework.data.PagedList;
import com.myb.framework.data.QueryCondition;
import com.myb.framework.data.QueryParameter;

import java.util.List;

public interface CrmVisitrecordService {


    public int insert(CrmVisitrecord crmVisitrecord);

    public int update(CrmVisitrecord crmVisitrecord);

    public int delete(long id);

    public CrmVisitrecord searchById(long id);

    public PagedList<CrmVisitrecord> searchByPage(QueryCondition queryCondition);

    public List<CrmVisitrecord> searchList(QueryParameter queryParameter);
    
    public <T extends EntityBase> List<T> searchListByCondition(QueryParameter queryParameter, String tableName, Class<T> t, int empId);
}

