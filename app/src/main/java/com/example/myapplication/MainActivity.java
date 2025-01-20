package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        findViewById(R.id.button_click_me).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Button CLICK ME pressed");
                Toast.makeText(MainActivity.this, "CLICK ME clicked", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.button_dont_click_me).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Button DON'T CLICK ME pressed");
                Toast.makeText(MainActivity.this, "DON'T CLICK ME clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}