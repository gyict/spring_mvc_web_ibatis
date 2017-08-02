package education.cs.scu.service.impl;

import education.cs.scu.entity.User;
import education.cs.scu.mapper.UserMapper;
import education.cs.scu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * Created by gaoy on 2017/7/7.
 */
public class LoginServiceImpl implements LoginService{

    @Autowired

    private UserMapper userMapper;

    public User doUserLogin(User user) throws Exception{
        return userMapper.doUserLogin(user);
    }

    public int doAddUser(User user) throws Exception {
        return userMapper.doAddUser(user);
    }

    public List<User> doUserShow() throws Exception {
        return userMapper.doUserShow();
    }

    public void doDeleteUser(String userName) throws Exception {
        userMapper.doDeleteUser(userName);
        return;
    }

    public int doUpdateUser(User user) throws Exception {
        return userMapper.doUpdateUser(user);
    }
}
