package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class pantalla2 extends AppCompatActivity {
    private Bundle datos2;
    private TextView usua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        datos2= getIntent().getExtras();
        usua = findViewById(R.id.etUser2);
        String recebe = datos2.getString("user");
        usua.setText(recebe);

    }
}