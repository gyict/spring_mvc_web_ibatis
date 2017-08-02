package education.cs.scu.mapper;

import education.cs.scu.entity.User;

import java.util.List;

/**
 * Created by gaoy on 2017/7/7.
 */
public interface UserMapper {
    User doUserLogin(User user) throws Exception;
    int doAddUser(User user) throws Exception;
    List<User> doUserShow() throws Exception;
    void doDeleteUser(String userName) throws Exception;
    int doUpdateUser(User user) throws Exception;
}
