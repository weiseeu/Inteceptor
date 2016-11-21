package ims.common.dao;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by xiangang on 16/11/17.
 */
public interface BaseDao<T> {

    //使用名字来查询
    public List<T> selectByNameAndPassword(String userName,String password);

    //使用ID来查询
    public List<T> selectById(int id);

    //保存对象
    public Integer save(T t);


}
