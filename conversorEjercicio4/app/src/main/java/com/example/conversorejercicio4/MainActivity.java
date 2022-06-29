package com.example.conversorejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etConvertir;
    private Button btnpesos;
    private Button btnreales;
    private Button btndolares;
    private TextView tvtotal;
    private Button btnborrar;
    double reales = 0;
    double dolares = 0;
    double pesos = 0;
    double totalR = 0;
    double totalD =0;
    double totalP =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etConvertir = findViewById(R.id.etConvertir);
        btnpesos = findViewById(R.id.btnpesos);
        btnreales = findViewById(R.id.btnreales);
        btndolares = findViewById(R.id.btndolares);
        btnborrar =findViewById(R.id.btnborrar);
        tvtotal = findViewById(R.id.tvtotal);
        DecimalFormat fromato = new DecimalFormat("#.00");
        //de pesos a reales y dolares
        btnpesos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reales = 0.13;
                dolares = 0.025;
                double valor= Double.parseDouble(etConvertir.getText().toString());
                 totalR = valor * reales;
                 totalD = valor * dolares;

                tvtotal.setText("En dolares: "+ fromato.format(totalD) + "\nEn reales: "+ fromato.format(totalR));
            }
        });
        // de dolares a pesos y reales
        btndolares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pesos= 39.47;
                reales= 5.24;
                double valor= Double.parseDouble(etConvertir.getText().toString());
                totalR = valor * reales;
                totalP = valor * pesos;
                tvtotal.setText("En pesos: "+ fromato.format(totalP) + "\nEn reales: "+ fromato.format(totalR));
            }
        });
        //de reales a pesos y dolares
        btnreales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dolares= 0.19;
                pesos= 7.53;
                double valor= Double.parseDouble(etConvertir.getText().toString());
                totalD = valor * dolares;
                totalP = valor * pesos;

                tvtotal.setText("En pesos: "+ fromato.format(totalP)  + "\nEn dolares: "+ fromato.format(totalD));
            }
        });

        //para limpiar los resltados
        btnborrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etConvertir.setText("");
                tvtotal.setText("Esperando un nuevo resultado...");
            }
        });
    }

    @Override
    public void onClick(View v) {
    }
}