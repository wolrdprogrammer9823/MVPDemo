package com.heng.centurywolf.mvpdemo.presenter;
import com.heng.centurywolf.mvpdemo.bean.UserBean;
import com.heng.centurywolf.mvpdemo.model.LoginRequestCallback;
import com.heng.centurywolf.mvpdemo.model.IPersonBz;
import com.heng.centurywolf.mvpdemo.model.IPersonBzImpl;
import com.heng.centurywolf.mvpdemo.view.ILoginView;

/**
 *   Created by 18217 on 2016/5/14.
 */
public class LoginPresenter{

    public LoginPresenter(ILoginView iLoginView){

        mIPersonBz = new IPersonBzImpl();
        mILoginView = iLoginView;
    }
    public void handleLogin(){
        mIPersonBz.login(mILoginView.getUserName(),
                          mILoginView.getUserPwd(),
                          new LoginRequestCallback(){
                          @Override
                          public void loginSuccess(UserBean userBean){

                              mILoginView.loginSuccessInfo(userBean);
                          }
                          @Override
                          public void loginFail(){

                              mILoginView.loginFailInfo();
                          }
                });
    }
    /**
     *  ILoginView对象
     */
    private ILoginView mILoginView;
    /**
     *  IPersonBz对象
     */
    private IPersonBz mIPersonBz;
}
