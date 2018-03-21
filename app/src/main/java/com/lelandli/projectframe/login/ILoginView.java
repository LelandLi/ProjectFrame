package com.lelandli.projectframe.login;

/**
 * Created by New Face on 2018/3/21.
 */

public interface ILoginView {
    void showData(LoginEntity loginEntity);
    void onFaulure(String errorStr);
}
