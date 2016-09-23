package com.myb.accounts.service;

import com.myb.entity.pojo.mos.ShopProcess;
import com.myb.framework.data.PagedList;
import com.myb.framework.data.QueryCondition;
import com.myb.framework.data.QueryParameter;

import java.util.List;


public interface ShopProcessService {


    public int insert(ShopProcess shopProcess);

    public int update(ShopProcess shopProcess);

    public int delete(long id);

    public ShopProcess searchById(long id);

    public PagedList<ShopProcess> searchByPage(QueryCondition queryCondition);

    public List<ShopProcess> searchList(QueryParameter queryParameter);
}

