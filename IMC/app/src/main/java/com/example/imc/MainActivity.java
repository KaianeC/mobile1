package com.example.imc;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtpeso, edtaltura;
    private Button btncalcular, btnborrar;
    private TextView tvIMC, tvBajoPeso, tvNormal, tvSobrepeso;
    private float imc, peso, altura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        edtpeso = findViewById(R.id.peso);
        edtaltura = findViewById(R.id.altura);
        btnborrar = findViewById(R.id.borrar);
        btncalcular = findViewById(R.id.calcular);
        tvIMC = findViewById(R.id.imc);
        tvBajoPeso = findViewById(R.id.bajopeso);
        tvNormal = findViewById(R.id.normal);
        tvSobrepeso = findViewById(R.id.sobrepeso);
        btnborrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                borrar();
                edtpeso.setText("");
                edtaltura.setText("");
                tvIMC.setText("IMC: ");
            }
        });
        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peso= Float.parseFloat(edtpeso.getText().toString());
                altura= Float.parseFloat(edtaltura.getText().toString());

                imc = peso/(altura*altura);
                tvIMC.setText("IMC: "+ redondear(imc));
                if (imc< 18.5){
                    tvBajoPeso.setBackgroundColor(Color.parseColor("#FF6200EE"));

                    }
                if (imc>= 18.5 && imc<=24.9){
                    tvNormal.setBackgroundColor(Color.parseColor("#FF6200EE"));

                    }
                if (imc>= 25 && imc<=29.9){
                    tvSobrepeso.setBackgroundColor(Color.parseColor("#FF6200EE"));

                    }
            }

        });



    }

    @Override
    public void onClick(View v) {

    }
    public float redondear(float n){
        float res;
        int valor = 0;
        valor= (int)(n*100);
        res = (float) valor/100;
        return res;
    }
    public void borrar (){
            tvBajoPeso.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
            tvNormal.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
            tvSobrepeso.setBackgroundColor(Color.parseColor("#FFFFFFFF"));

    }
}