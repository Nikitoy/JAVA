package com.example.mysearch;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class buscar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);


        EditText titulo = (EditText) findViewById(R.id.nombre);
        EditText id = (EditText) findViewById(R.id.password);

        Button SH = (Button) findViewById(R.id.sh);
        EditText email = (EditText) findViewById(R.id.nombre);
        EditText contraseña = (EditText) findViewById(R.id.password);
        Button B = (Button) findViewById(R.id.sh);
    }
}

