package com.ohayo.loveclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.ohayo.loveclass.fragment.FgMainImportantLesson;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LcMain extends AppCompatActivity {

    @BindView(R.id.tab_menu)
    RadioGroup RgMenus;

    FgMainImportantLesson fgMainImportantLesson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        RgMenus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

            }
        });
    }
}
