package com.ilidan.base.service;

import org.springframework.orm.hibernate5.HibernateTemplate;

import java.io.Serializable;
import java.util.List;

/**
 * @author ilidan_Y
 * @Package com.ilidan.base.service
 * @Description:
 * @date 2018/6/25
 * @Modified by:
 */
public interface BaseService<T> {

    /**
     * 更新
     *
     * @param entity
     */
    void update(T entity);

    /**
     * 保存
     *
     * @param entity
     */
    void save(T entity);

    /**
     * 删除
     *
     * @param id
     */
    void deleteById(Serializable id);

    /**
     * 通过id获取一个对象实例
     *
     * @param id
     * @return
     */
    T getById(Serializable id);

    /**
     * 通过id获取一个对象实例
     *
     * @param id
     * @return
     */
    T loadById(Serializable id);

    /**
     * 获取一个列表数据
     *
     * @return
     */
    List<T> findAll(String sql, Object... args);

    /**
     * 获取模板类
     *
     * @return
     */
    HibernateTemplate getHibernateTemplate();

}
