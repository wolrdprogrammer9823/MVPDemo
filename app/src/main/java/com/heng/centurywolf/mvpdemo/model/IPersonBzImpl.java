package com.heng.centurywolf.mvpdemo.model;
import android.os.Handler;
import com.heng.centurywolf.mvpdemo.bean.UserBean;

/**
 * Created by 18217 on 2016/5/14.
 */
public class IPersonBzImpl implements IPersonBz{

    @Override
    public void login(final String userName, final String userPwd,
                       final LoginRequestCallback callback){

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                if(userName.equals("abc1234") && userPwd.equals("123456")){

                    callback.loginSuccess(new UserBean(userName,userPwd));
                }else{

                    callback.loginFail();
                }
            }
        },3000);
    }
}
