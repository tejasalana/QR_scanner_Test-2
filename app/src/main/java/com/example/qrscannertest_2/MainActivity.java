package com.example.qrscannertest_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dlazaro66.qrcodereaderview.QRCodeReaderView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(MainActivity.this, QRCodeActivity.class));
    }
}