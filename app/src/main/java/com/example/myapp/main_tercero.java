package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class main_tercero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tercera_main);

    }


    public void volver_segundo(View view){
        Intent i1 = new Intent(main_tercero.this, main_segundo.class);
        startActivity(i1);
    }

}