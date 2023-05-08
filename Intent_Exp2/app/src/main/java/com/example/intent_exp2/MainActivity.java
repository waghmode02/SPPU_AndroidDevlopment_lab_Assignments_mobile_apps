package com.example.intent_exp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=findViewById(R.id.button1);
        Button btn2=findViewById(R.id.button2);
        Button btn3=findViewById(R.id.button3);
        Button btn4=findViewById(R.id.button4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.geeksforgeeks.org/what-is-intent-in-android/";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.jiocinema.com/";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

            }
        });
    }
}