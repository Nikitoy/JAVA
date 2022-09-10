package com.example.mysearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button busc = (Button) findViewById(R.id.search);
        Intent nashe = new Intent(this, crear.class );

        Button regis = (Button) findViewById(R.id.ingresar);
        Intent buss = new Intent(this, buscar.class);


        busc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nashe);
            }
        });

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(buss);
            }
        });
    }
}