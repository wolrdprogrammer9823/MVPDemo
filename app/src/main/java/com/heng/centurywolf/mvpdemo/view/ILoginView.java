package com.heng.centurywolf.mvpdemo.view;

import com.heng.centurywolf.mvpdemo.bean.UserBean;

/**
 * Created by 18217 on 2016/5/14.
 */
public interface ILoginView{

    String getUserName();
    String getUserPwd();
    void loginSuccessInfo(UserBean userBean);
    void loginFailInfo();
}
