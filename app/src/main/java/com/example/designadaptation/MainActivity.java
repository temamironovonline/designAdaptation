package com.example.designadaptation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    //https://translated.turbopages.org/proxy_u/en-ru.ru.467344e9-6374f6b9-d5b5af44-74722d776562/https/stackoverflow.com/questions/20896963/relativelayout-inside-scrollview-not-working

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity_main);

        TextView doNotHaveAccount = findViewById(R.id.doNotHaveAccount);
        doNotHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}