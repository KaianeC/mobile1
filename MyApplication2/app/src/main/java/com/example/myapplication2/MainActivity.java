package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText e1;
    private EditText e2;
    private EditText e3;
    private Button btn;
    private TextView t1;
    private TextView t2;
    private TextView t3;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= findViewById(R.id.nombre);
        e2= findViewById(R.id.contrasena);
        e3= findViewById(R.id.matricula);
        btn= findViewById(R.id.botonSET);
        t1= findViewById(R.id.palabra);
        t2= findViewById(R.id.pcontrasena);
        t3 = findViewById(R.id.pmatricula);
        btn2= findViewById(R.id.botonborrar);
        btn3 = findViewById(R.id.botonToast);
        btn.setOnClickListener(this);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String n2;
                String c2;
                String m2;

                n2 = e1.getText().toString();
                c2 = e2.getText().toString();
                m2 = e3.getText().toString();

                String msg = "Usuario " + n2 + ", Contraseña " + c2 + ", matricula " + m2;

                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String n1 = "Nombre:";
                String c1="Contraseña:";
                String m1="Matricula:";

                t1.setText(n1);
                t2.setText(c1);
                t3.setText(m1);

            }
                                });



        getSupportActionBar().hide(); //para desaparecer la barrita con el titulo de la app
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.botonSET) {
            String n;
            String c;
            String m;

            n = e1.getText().toString();
            c = e2.getText().toString();
            m = e3.getText().toString();

            t1.setText(n);
            t2.setText(c);
            t3.setText(m);
        }
    }
}