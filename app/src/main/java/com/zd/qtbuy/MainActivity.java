package com.zd.qtbuy;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "zzdd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        test(5, 0.9, 4, 100, 2);
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.rv_result);

    }

    private void test(int fillTimes, double proportion, double cost, int numbers, int multiple) {
        for (int i = 0; i < fillTimes; i++) {
            int count = (int) (Math.pow(multiple, i) * numbers);
            double nowPrice = cost * Math.pow(proportion, i) * count;
            String buf = String.format(Locale.getDefault(),
                    "第%d次补仓[%d]股 金额:%.2f", i, count, nowPrice);
            Log.i(TAG, buf);
        }
    }
}