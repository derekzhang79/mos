package com.myb.accounts.service;

import com.myb.entity.pojo.mos.FreshShop;
import com.myb.framework.data.PagedList;
import com.myb.framework.data.QueryCondition;
import com.myb.framework.data.QueryParameter;

import java.util.List;


public interface FreshShopService {


    public int insert(FreshShop freshShop);

    public int update(FreshShop freshShop);

    public int delete(long id);

    public FreshShop searchById(long id);

    public PagedList<FreshShop> searchByPage(QueryCondition queryCondition);

    public List<FreshShop> searchList(QueryParameter queryParameter);
}

