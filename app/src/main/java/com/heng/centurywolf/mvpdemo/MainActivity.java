package com.heng.centurywolf.mvpdemo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.heng.centurywolf.mvpdemo.bean.UserBean;
import com.heng.centurywolf.mvpdemo.presenter.LoginPresenter;
import com.heng.centurywolf.mvpdemo.view.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView{

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         *  调用初始化对象方法
         */
        assignViews();
        mLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                  mLoginPresenter.handleLogin();
               }
            }
        );
    }
    @Override
    public String getUserName(){

        return mUserName.getText().toString();
    }
    @Override
    public String getUserPwd(){

        return mPwd.getText().toString();
    }
    @Override
    public void loginSuccessInfo(UserBean userBean){

        Toast.makeText(this, "login success", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void loginFailInfo(){

        Toast.makeText(this, "login failed", Toast.LENGTH_SHORT).show();
    }
    /**
     *  初始化对象方法
     */
    private void assignViews(){

        mUserName = (EditText) findViewById(R.id.userName);
        mPwd = (EditText) findViewById(R.id.pwd);

        mLogin = (Button) findViewById(R.id.login);

        mLoginPresenter = new LoginPresenter(this);
    }
    /**
     *  EditText对象
     */
    private EditText mUserName;
    private EditText mPwd;
    /**
     *  Button对象
     */
    private Button mLogin;
    /**
     * LoginPresenter对象
     */
    private LoginPresenter mLoginPresenter;
}
