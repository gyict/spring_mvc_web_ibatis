package education.cs.scu.service;

import education.cs.scu.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gaoy on 2017/7/7.
 */

@Repository
public interface LoginService {

    public User doUserLogin(User user) throws Exception;
    public int doAddUser(User user) throws Exception;
    public List<User> doUserShow() throws Exception;
    public void doDeleteUser(String userName) throws Exception;
    public int doUpdateUser(User user) throws Exception;
}
