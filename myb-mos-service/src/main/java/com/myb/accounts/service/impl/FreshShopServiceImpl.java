package com.myb.accounts.service.impl;

import com.myb.accounts.dao.FreshShopDao;
import com.myb.accounts.service.FreshShopService;
import com.myb.entity.pojo.mos.FreshShop;
import com.myb.framework.data.PagedList;
import com.myb.framework.data.QueryCondition;
import com.myb.framework.data.QueryParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("freshShopService")
public class FreshShopServiceImpl implements FreshShopService {

    @Autowired
    private FreshShopDao freshShopDao;

    public int insert(FreshShop freshShop)
    {
        return freshShopDao.insert(freshShop);
    }
    public int update(FreshShop freshShop)
    {
        return freshShopDao.update(freshShop);
    }

    public int delete(long id)
    {
        return freshShopDao.delete(id);
    }

    public FreshShop searchById(long id) {
        return freshShopDao.searchById(id);
    }
    public PagedList<FreshShop> searchByPage(QueryCondition queryCondition)
    {
        return freshShopDao.searchByPage(queryCondition);
    }
    public List<FreshShop> searchList(QueryParameter queryParameter)
    {
        return freshShopDao.searchList(queryParameter);
    }
}

