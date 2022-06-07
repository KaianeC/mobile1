package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn;
    private EditText etuser;
    private EditText etcontra;
    private Bundle datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etuser=findViewById(R.id.etusuario);
        etcontra=findViewById(R.id.etusuario);
        btn= findViewById(R.id.boton);
        btn.setOnClickListener(this);
        getSupportActionBar().hide();
    }

    @Override
    public void onClick(View v) {
        String usuario;
        String contrasena;
        String msg="Usuario o contraseña incorrectos. Intente nuevamente";;
        usuario = etuser.getText().toString();
        contrasena = etcontra.getText().toString();
        if(usuario.equals("kai") && contrasena.equals("kai")){
            datos=new Bundle();
            datos.putString("user", usuario);
            Intent i = new Intent(getApplicationContext(),pantalla2.class);
            i.putExtras(datos);
            startActivity(i);
        }else{
            Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
        }
    }
}