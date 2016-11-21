package ims.dao;

import ims.PO.User;
import ims.common.dao.BaseDao;
import ims.common.dao.impl.BaseDaoImpl;
import org.springframework.stereotype.Repository;

/**
 * Created by xiangang on 16/11/17.
 */
@Repository
public class UserDao extends BaseDaoImpl<User> implements BaseDao<User>{
    @Override
    protected Class<?> getEntityClass() {
        return User.class;
    }
}
