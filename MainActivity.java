package com.example.ece387button_songm4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int cnt = 0;
    public void onClick(View view) {
        cnt++;
        TextView text = findViewById(R.id.textView);
        text.setText(""+cnt);
    }
}
