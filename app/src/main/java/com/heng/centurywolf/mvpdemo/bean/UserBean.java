package com.heng.centurywolf.mvpdemo.bean;

/**
 * Created by 18217 on 2016/5/14.
 */
public class UserBean{

    public UserBean() {}

    public UserBean(String userName, String userPwd){

        this.userName = userName;
        this.userPwd = userPwd;
    }

    public String getUserName(){

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     *  用户名
     */
    private String userName;
    /**
     *  密码
     */
    private String userPwd;
}
