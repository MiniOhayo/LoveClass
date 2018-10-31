package com.ohayo.loveclass;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class LcLogo extends AppCompatActivity {

    private Handler mhandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_lc_logo);

        initPath();
    }

    public void initPath() {
        mhandler = new Handler();
        new Thread() {
            @Override
            public void run() {
                mhandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(LcLogo.this, LcMain.class));
                        finish();
                    }
                }, 2000);
            }
        }.start();
    }
}
