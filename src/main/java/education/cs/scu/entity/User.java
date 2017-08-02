package education.cs.scu.entity;

/**
 * Created by gaoy on 2017/7/7.
 */
public class User {
    private String userName;
    private String password;
    private String nickName;
    public User(){}

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public User(String userName, String password,String nickName){
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Name:"+userName+"\n"+"Nickname"+nickName+"\n";
    }
}
