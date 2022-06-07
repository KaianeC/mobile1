package com.example.ejercicio2part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private Button btnA2;
    private EditText etA2;
    private String mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnA2 = findViewById(R.id.btnAct2);
        etA2 = findViewById(R.id.etAct2);

        btnA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mensaje = etA2.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("llave", mensaje);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}