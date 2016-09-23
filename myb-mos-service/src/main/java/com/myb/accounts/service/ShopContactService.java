package com.myb.accounts.service;

import com.myb.entity.pojo.mos.ShopContact;
import com.myb.framework.data.PagedList;
import com.myb.framework.data.QueryCondition;
import com.myb.framework.data.QueryParameter;

import java.util.List;


public interface ShopContactService {


    public int insert(ShopContact shopContact);

    public int update(ShopContact shopContact);

    public int delete(long id);

    public ShopContact searchById(long id);

    public PagedList<ShopContact> searchByPage(QueryCondition queryCondition);

    public List<ShopContact> searchList(QueryParameter queryParameter);
}

