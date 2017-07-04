package com.star.titlebar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    CustomTitleBar titleBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        titleBar.setTitleClickListener(new CustomTitleBar.TitleClickListener() {
//            @Override
//            public void onLeftClick() {
//                //左按钮
//            }
//
//            @Override
//            public void onRightClick() {
//                //右按钮
//            }
//
//            @Override
//            public void onRightButton1Click() {
//                //右边第一个按钮（右边俩按钮）
//            }
//
//            @Override
//            public void onRightButton2Click() {
//                //右边第一个按钮（右边俩按钮）
//            }
//        });
    }



}
