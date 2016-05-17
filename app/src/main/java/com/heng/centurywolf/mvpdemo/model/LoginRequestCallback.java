package com.heng.centurywolf.mvpdemo.model;
import com.heng.centurywolf.mvpdemo.bean.UserBean;

/**
 * Created by 18217 on 2016/5/14.
 */
public interface LoginRequestCallback{

    void loginSuccess(UserBean userBean);
    void loginFail();
}
