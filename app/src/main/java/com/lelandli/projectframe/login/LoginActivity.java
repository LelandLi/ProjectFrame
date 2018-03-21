package com.lelandli.projectframe.login;

import com.lelandli.projectframe.base.BaseActivity;

/**
 * Created by New Face on 2018/3/20.
 */

public class LoginActivity extends BaseActivity implements ILoginView{
    private ILoginPresenter iLoginPresenter;
    @Override
    protected int getContentViewId() {
        return 0;
    }

    @Override
    protected void initView() {
        iLoginPresenter = new LoginPresenter(this);
    }

    @Override
    protected void initData() {
        //登陆
//        iLoginPresenter.doLogin("","");
    }
    //显示数据
    @Override
    public void showData(LoginEntity loginEntity) {

    }

    @Override
    public void onFaulure(String errorStr) {

    }
}
