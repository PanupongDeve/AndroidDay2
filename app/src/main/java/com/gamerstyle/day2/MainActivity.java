package com.gamerstyle.day2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main";
    private TextView tv1;
    private TextView tv2;
    private EditText edtName;
    private int status = 0;
    private TextView btnSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtName);
        btnSub = findViewById(R.id.btnSubmit);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
    }

    public void submit(View view) {
        switch (status) {
            case 0:
                tv1.setText( edtName.getText() );
                tv2.setText("Yeah");
                System.out.println(btnSub);
                btnSub.setText("Delete");
                btnSub.setBackgroundColor(Color.RED);
                status = 1;
                break;
            case 1:
                tv1.setText("");
                tv2.setText("");
                btnSub.setText("Submit");
                btnSub.setBackgroundColor(Color.BLUE);
                status = 0;
                break;
        }

    }
}
