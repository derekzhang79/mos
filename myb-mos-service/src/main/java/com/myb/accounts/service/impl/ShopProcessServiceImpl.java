package com.myb.accounts.service.impl;

import com.myb.accounts.dao.ShopProcessDao;
import com.myb.accounts.service.ShopProcessService;
import com.myb.entity.pojo.mos.ShopProcess;
import com.myb.framework.data.PagedList;
import com.myb.framework.data.QueryCondition;
import com.myb.framework.data.QueryParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("shopProcessService")
public class ShopProcessServiceImpl implements ShopProcessService {

    @Autowired
    private ShopProcessDao shopProcessDao;

    public int insert(ShopProcess shopProcess)
    {
        return shopProcessDao.insert(shopProcess);
    }
    public int update(ShopProcess shopProcess)
    {
        return shopProcessDao.update(shopProcess);
    }

    public int delete(long id)
    {
        return shopProcessDao.delete(id);
    }

    public ShopProcess searchById(long id) {
        return shopProcessDao.searchById(id);
    }
    public PagedList<ShopProcess> searchByPage(QueryCondition queryCondition)
    {
        return shopProcessDao.searchByPage(queryCondition);
    }
    public List<ShopProcess> searchList(QueryParameter queryParameter)
    {
        return shopProcessDao.searchList(queryParameter);
    }
}

