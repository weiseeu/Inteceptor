package ims.common.dao.impl;

import ims.common.dao.BaseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ims.PO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by xiangang on 16/11/17.
 */
public abstract class BaseDaoImpl<T> implements BaseDao<T> {

    protected abstract Class<?> getEntityClass();

    @Autowired
    protected SessionFactory sessionFactory;


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public Session openNewSession() {
        return sessionFactory.openSession();
    }


    //以下为对BaseDao接口中方法的实现

    @Override
    @SuppressWarnings("unchecked")
    public List<T> selectByNameAndPassword(String userName,String password) {
        List<T> list = null;
        String sql = "select * from user where userName = '"+userName+"'and password = '"+password+"'";
        Query query = this.getSession().createSQLQuery(sql);
        list = (List<T>)query.list();
        return list;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<T> selectById(int id) {
        List<T> list = null;
        String sql = "select * from user where id="+id;
        Query query = this.getSession().createSQLQuery(sql);
        list = (List<T>)query.list();
        return list;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Integer save(T t) {

        return (Integer) this.getSession().save(t);
    }
}
