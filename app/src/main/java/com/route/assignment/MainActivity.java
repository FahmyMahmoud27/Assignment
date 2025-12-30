package com.route.assignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button androidBtn1;
    Button iosBtn2;
    Button fullStackBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        androidBtn1 = findViewById(R.id.androidBtn1);
        iosBtn2 = findViewById(R.id.iosBtn2);
        fullStackBtn3 = findViewById(R.id.fullStackBtn3);

        androidBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Android_Course.class);
                startActivity(intent);
            }
        });


        iosBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IosCourse.class);
                startActivity(intent);
            }
        });


        fullStackBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FullStack.class);
                startActivity(intent);
            }
        });


    }
}