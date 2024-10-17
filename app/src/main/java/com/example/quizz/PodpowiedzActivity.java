package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PodpowiedzActivity extends AppCompatActivity {
    private TextView textView = findViewById(R.id.textView);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podpowiedz);
        String podpowiedz = getIntent().getStringExtra("PODPOWIEDZ");
        textView.setText(podpowiedz);
    }
}