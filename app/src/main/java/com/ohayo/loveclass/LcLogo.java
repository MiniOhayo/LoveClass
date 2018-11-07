package com.ohayo.loveclass;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class LcLogo extends AppCompatActivity {

    private Handler mhandler = new Handler();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_lc_logo);
        mhandler.postDelayed(mRunnable, 2000);
    }

    private Runnable mRunnable = new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(LcLogo.this, LcMain.class));
            finish();
        }
    };

    @Override
    protected void onDestroy() {
        mhandler.removeCallbacksAndMessages(null);
        super.onDestroy();
    }
}
