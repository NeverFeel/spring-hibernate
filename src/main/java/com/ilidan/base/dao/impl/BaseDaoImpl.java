package com.ilidan.base.dao.impl;

import com.ilidan.base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author ilidan_Y
 * @Package com.ilidan.base.dao.impl
 * @Description:
 * @date 2018/6/24
 * @Modified by:
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

    private HibernateTemplate hibernateTemplate;

    private Class<T> clazz;

    //通过反射机制获取T的类型信息
    public BaseDaoImpl() {
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        clazz = (Class<T>) type.getActualTypeArguments()[0];
    }

    @Override
    public void update(T entity) {
        hibernateTemplate.update(entity);
    }

    @Override
    public void save(T entity) {
        hibernateTemplate.save(entity);
    }

    @Override
    public void deleteById(Serializable id) {
        hibernateTemplate.delete(hibernateTemplate.load(clazz, id));
    }

    @Override
    public T getById(Serializable id) {
        return (T) hibernateTemplate.get(clazz, id);//这个方法有点2
    }

    @Override
    public T loadById(Serializable id) {
        return hibernateTemplate.load(clazz, id);
    }

    @Override
    public List<T> findAll(String sql, Object... args) {
        return (List<T>) hibernateTemplate.find(sql, args);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Autowired
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

}
