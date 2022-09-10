package com.example.mysearch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class crear extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button ingresar = (Button) findViewById(R.id.regresar);
        Button abduzcan = (Button) findViewById(R.id.ingresar);

        RequestQueue requestqueue;

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nashe);
            }

        });

        abduzcan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name;
                String email;
                String password;
                String fecha;
                String hora;

                email = String.valueOf(email.getText());
            }
        });




    }
}


