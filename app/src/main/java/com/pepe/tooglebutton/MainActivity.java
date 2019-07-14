package com.pepe.tooglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.pepe.ToogleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToogleButton btn_toogle = findViewById(R.id.btn_toogle);
        btn_toogle.setOnCheckListener(new ToogleButton.OnCheckListener() {
            @Override
            public void onCheck(boolean isCheck) {
                Toast.makeText(MainActivity.this, isCheck ? "打开" : "关闭", Toast.LENGTH_SHORT).show();
            }
        });
        btn_toogle.toogleOn();
    }
}
