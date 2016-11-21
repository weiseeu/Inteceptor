package ims.service;

import ims.PO.User;
import ims.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xiangang on 16/11/17.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public boolean selectByUserName(String userName,String password){
        boolean flag = true;
        if (userDao.selectByNameAndPassword(userName,password).isEmpty() || userDao.selectByNameAndPassword(userName,password) == null){
            flag = false;
        }
        return flag;
    }

    @Transactional
    public boolean saveUser(User user){
        boolean flag = true;
        if (userDao.save(user) == null){
            flag = false;
        }

        return flag;
    }


}
