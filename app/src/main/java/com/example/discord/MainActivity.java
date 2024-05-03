package com.example.discord;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        int[] clickers = {R.id.btn_title, R.id.btn_search, R.id.btn_invite, R.id.btn_event, R.id.btn_info, R.id.btn_ask_team,
                R.id.btn_ai, R.id.btn_app, R.id.btn_proj, R.id.btn_lunch, R.id.btn_off, R.id.btn_share, R.id.btn_study};


        for (int i = 0; i < clickers.length; i++){


            Button button = findViewById(clickers[i]);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    CharSequence text = "현재 준비 중 입니다.";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(MainActivity.this, text, duration);
                    toast.show();
                }
            });
        }
    }
}