package com.ilidan.base.service.impl;

import com.ilidan.base.dao.BaseDao;
import com.ilidan.base.service.BaseService;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.io.Serializable;
import java.util.List;

/**
 * @author ilidan_Y
 * @Package com.ilidan.base.service.impl
 * @Description:
 * @date 2018/6/25
 * @Modified by:
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    private BaseDao<T> baseDao;

    public void setBaseDao(BaseDao<T> baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public void update(T entity) {
        baseDao.update(entity);
    }

    @Override
    public void save(T entity) {
        baseDao.save(entity);
    }

    @Override
    public void deleteById(Serializable id) {
        baseDao.deleteById(id);
    }

    @Override
    public T getById(Serializable id) {
        return baseDao.getById(id);
    }

    @Override
    public T loadById(Serializable id) {
        return baseDao.loadById(id);
    }

    @Override
    public List<T> findAll(String sql, Object... args) {
        return baseDao.findAll(sql, args);
    }

    @Override
    public HibernateTemplate getHibernateTemplate() {
        return baseDao.getHibernateTemplate();
    }


}
