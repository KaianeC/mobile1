package com.example.ejercicio2part2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnA1;
    private TextView tvreceb;
    private final static  int CODIGO_IDENTIFICADOR = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnA1 = findViewById(R.id.btnAct1);
        tvreceb = findViewById(R.id.tvreceve);
        btnA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela2 = new Intent(getApplicationContext(), MainActivity2.class);
                startActivityForResult(tela2, CODIGO_IDENTIFICADOR);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String recebe = data.getStringExtra("llave");
        tvreceb.setText(recebe);
    }
}
