package com.lelandli.projectframe.start;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.lelandli.projectframe.R;
public class StartPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        Log.i("LJL",this.isFinishing()+"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LJL",this.isFinishing()+"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LJL",this.isFinishing()+"onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LJL",this.isFinishing()+"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LJL",this.isFinishing()+"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LJL",this.isFinishing()+"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LJL",this.isFinishing()+"onDestroy");
    }
}
