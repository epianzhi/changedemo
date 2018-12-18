package com.lnkj.cash.aaa;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.lnkj.cash.aaa.R;
import com.lnkj.cash.aaa.weight.PresentView;


public class MainActivity extends AppCompatActivity {

    private PresentView presentView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presentView = findViewById(R.id.present);
        editText=findViewById(R.id.et_number);

        presentView.setColor(Color.BLACK,Color.GREEN,Color.GRAY,"PK");
        presentView.setRate(0.4f);
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("flag", "onResume: ");
    }
}
