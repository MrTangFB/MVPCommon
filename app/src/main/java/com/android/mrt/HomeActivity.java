package com.android.mrt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Mr.T on 2018/4/27.
 */

public class HomeActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViewById(R.id.java).setOnClickListener(this);
        findViewById(R.id.kotlin).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.java:
                intent.setClass(this, com.android.mrt.mvp.java.activity.MainActivity.class);
                break;
            case R.id.kotlin:
                intent.setClass(this, com.android.mrt.mvp.kotlin.activity.MainActivity.class);
                break;
        }
        startActivity(intent);
    }
}
