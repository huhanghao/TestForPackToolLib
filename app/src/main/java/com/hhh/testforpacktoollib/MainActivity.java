package com.hhh.testforpacktoollib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Thread thread1;
    private int data1 = 0;
    private int data2 = 0;
    private Thread thread2;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View viewById = findViewById(R.id.tv_test);

//        thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    try {
//                        Thread.sleep(20);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    data1++;
//                }
//                LogUitls.d(data1 + "");
//            }
//        });
//
//        thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    try {
//                        Thread.sleep(20);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    data2++;
//                }
//                LogUitls.d(data2 + "");
//            }
//        });

        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Date friday = DateTimeUtils.getDay();
//
//                LogUitls.d(s);

            }
        });
    }
}
