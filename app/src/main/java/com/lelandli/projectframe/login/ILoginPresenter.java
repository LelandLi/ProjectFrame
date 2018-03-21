package com.lelandli.projectframe.login;

/**
 * Created by New Face on 2018/3/21.
 */

public interface ILoginPresenter {
    void doLogin(String name, String passwd);
    void onSuccess(LoginEntity loginEntity);
    void onFaulure(Throwable throwable);
}
