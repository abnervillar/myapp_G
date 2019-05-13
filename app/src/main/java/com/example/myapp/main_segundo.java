package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class main_segundo extends AppCompatActivity {

    private EditText et1;
    private ListView lista1, lista2;
    ArrayList<String> lista;
    ArrayAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundo_main);

        et1=(EditText)findViewById(R.id.editText3);
        lista1 = (ListView)findViewById(R.id.lv1);



        et1.setEnabled(false);

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(getApplicationContext(),"BDD",null,1);
        lista = conn.llenar_lv();
        adaptador = new ArrayAdapter(this,android.R.layout.simple_list_item_1);
        lista1.setAdapter(adaptador);


        Bundle bundle = getIntent().getExtras();
        String dato =bundle.getString("mesa");
        et1.setText(dato);

    }
        public void volver1 (View view){
            Intent intent2 = new Intent(main_segundo.this,MainActivity.class);
            startActivity(intent2);

        }

        public void pedido(View view){
            Intent inte = new Intent(this, main_tercero.class);
            startActivity(inte);
        }


}
