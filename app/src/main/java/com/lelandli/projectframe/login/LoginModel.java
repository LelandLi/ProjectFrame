package com.lelandli.projectframe.login;

/**
 * Created by New Face on 2018/3/21.
 */

public class LoginModel implements ILoginModel {
    private LoginPresenter LoginPresenter;
    public LoginModel(LoginPresenter LoginPresenter){
        this.LoginPresenter = LoginPresenter;
    }

    @Override
    public void getLoginData(String username, String password) {
        //请求数据

    }
}
