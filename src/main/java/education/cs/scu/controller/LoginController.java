package education.cs.scu.controller;

import education.cs.scu.entity.User;
import education.cs.scu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by gaoy on 2017/7/7.
 */


@Controller

//@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("/userLogin")
   // @RequestMapping(value="/userLogin", method= RequestMethod.POST)
    public String userLogin(HttpServletRequest request,
                             @RequestParam(value="username") String userName,
                             @RequestParam(value="password") String password) throws Exception{
        User user = new User(userName, password);
        //System.out.println(userName);
        User loginUser = loginService.doUserLogin(user);
        //System.out.println(loginUser.getUserName());
        HttpSession session = request.getSession();
        if(loginUser != null) {
            session.setAttribute("user", loginUser);
            System.out.println("finish:" + loginUser.getNickName());
            //return loginUser;
            //return "/userLogin";
        }else{
            User wrongUser = new User();
            wrongUser.setNickName("该用户不存在");
            session.setAttribute("user", wrongUser);
            //System.out.println("wrong:" + loginUser.getNickName());
            //return null;
        }
        return "userLogin";
    }

    @RequestMapping("/userAdd")
//    @ResponseBody
//    @RequestMapping(value="/userAdd", method= RequestMethod.POST)
    public String doAddUser(HttpServletRequest request,
                          @RequestParam(value="username") String userName,
                          @RequestParam(value="password") String password,
                          @RequestParam(value="nickname") String nickname) throws Exception{
        User user = new User(userName, password,nickname);
        System.out.println("add:"+userName);
        int addUser = loginService.doAddUser(user);
        HttpSession session = request.getSession();
        if(addUser == 1) {
            session.setAttribute("user", userName);
            System.out.println("finish:" + userName);
            //return addUser;
        }else{
            User wrongUser = new User();
            wrongUser.setNickName("该用户不存在");
            session.setAttribute("user", wrongUser);
            System.out.println("wrong:" + userName);
            //return addUser;
        }
        return "userAdd";
    }


    @RequestMapping(value="/userShow", method= {RequestMethod.POST,RequestMethod.GET})
    public String doAddUser(HttpServletRequest request
                          ) throws Exception{

        List<User> users = loginService.doUserShow();
        HttpSession session = request.getSession();
        if(users.size() != 0) {
            String ret = "";
            for(User u:users){
                ret+=u.getUserName()+"\t"+u.getNickName()+"\n";
            }
            session.setAttribute("userinfo", ret);
            System.out.println("finish:" + ret);
            //return ret;
            return "userShow";
        }else{
            User wrongUser = new User();
            wrongUser.setNickName("nobody");
            session.setAttribute("user", wrongUser);
            return "userShow";
        }
    }

    @RequestMapping(value="/userDelete", method= {RequestMethod.POST,RequestMethod.GET})
    public String doDeleteUser(HttpServletRequest request,
                             @RequestParam(value="username") String userName
    ) throws Exception{
        loginService.doDeleteUser(userName);
        HttpSession session = request.getSession();
        session.setAttribute("deleteres", "SUCCESS");
        return "userDelete";
    }

    @RequestMapping(value="/userUpdate", method= {RequestMethod.POST,RequestMethod.GET})
    public String doUpdateUser(HttpServletRequest request,
                             @RequestParam(value="username") String userName,
                             @RequestParam(value="password") String password,
                             @RequestParam(value="nickname") String nickname
    ) throws Exception{
        int t = loginService.doUpdateUser(new User(userName,password,nickname));
        if(t==0){
            HttpSession session = request.getSession();
            session.setAttribute("updateres", "FAILURE");
        }else{
            HttpSession session = request.getSession();
            session.setAttribute("updateres", "SUCCESS");
        }
        //return t;
        return "userUpdate";
    }

}
