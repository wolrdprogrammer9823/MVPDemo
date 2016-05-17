package com.heng.centurywolf.mvpdemo.model;

/**
 * Created by 18217 on 2016/5/14.
 */
public interface IPersonBz{

    void login(String userName, String userPwd, LoginRequestCallback callback);
}
