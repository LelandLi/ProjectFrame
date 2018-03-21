package com.lelandli.projectframe.base;

import android.os.Bundle;

/**
 * Created by New Face on 2018/3/20.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        initView();
        initData();
    }
    protected abstract int getContentViewId();

    // 初始化ui
    protected abstract void initView();

    // 初始化数据
    protected abstract void initData();
}
