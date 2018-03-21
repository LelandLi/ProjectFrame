package com.lelandli.projectframe.login;

/**
 * Created by New Face on 2018/3/21.
 */

public class LoginPresenter implements ILoginPresenter{
    private ILoginView iLoginView;
    private ILoginModel iLoginModel;
    public LoginPresenter(ILoginView iLoginView){
        this.iLoginView = iLoginView;
        iLoginModel = new LoginModel(this);
    }

    @Override
    public void doLogin(String name, String passwd) {
        //请求数据
        iLoginModel.getLoginData(name,passwd);
    }

    @Override
    public void onSuccess(LoginEntity loginEntity) {
        iLoginView.showData(loginEntity);
    }

    @Override
    public void onFaulure(Throwable throwable) {
        //可以处理逻辑
        iLoginView.onFaulure("");
    }
}
