package com.example.myloginsao;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    private Button btnRequest;
    private Button btnSearch;
    private EditText edName;
    
    private RequestQueue mRequestQueue;
    private StringRequest mSringRequest;
    //private String url = "http://headers.jsontest.com/";
    private String url = "urlpostman";//"https://run.mocky.io/v3/b645788a-cbda-4d74-9780-75b0344ccbfb";
    
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        edName = (EditText) findViewById(R.id.edtTextName);
        
        btnSearch = (Button) findViewById(R.id.btnSearch);
        
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { sendAndRequestResponse();}
        }
    );
        btnRequest = (Button) findViewById(R.id.buttonRequest);
        
        btnRequest.setOnClickListener(new View.OnclickListener() {
            @Override
            public void onClick(View v) { sendAndRequestResponse();}
        }
     );
    }
    private void sendAndRequestResponse() {
        
        //RequestQueue initialized
        mRequestQueue = Volley.newRequestQueue(this);
        Toast.makeText(getApplicationContext(),"manda", Toast.LENGTH_LONG).show();
        mStringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.e("HttpClient", "success! response: " + response.toString());
                Toast.makeText(getApplicationContext(), "Response :" + response.toString(), Toast.LENGHT_LONG).show();
            }
        
                
}
