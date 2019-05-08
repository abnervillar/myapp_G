package com.example.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private TextView tv1;
    private CheckBox checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10;
    private Button  boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        boton2=(Button)findViewById(R.id.button2);
        et1=(EditText)findViewById(R.id.editText);
        tv1=(TextView)findViewById(R.id.textView);
        checkBox=(CheckBox)findViewById(R.id.checkBox);
        checkBox2=(CheckBox)findViewById(R.id.checkBox2);
        checkBox3=(CheckBox)findViewById(R.id.checkBox3);
        checkBox4=(CheckBox)findViewById(R.id.checkBox4);
        checkBox5=(CheckBox)findViewById(R.id.checkBox5);
        checkBox6=(CheckBox)findViewById(R.id.checkBox6);
        checkBox7=(CheckBox)findViewById(R.id.checkBox7);
        checkBox8=(CheckBox)findViewById(R.id.checkBox8);
        checkBox9=(CheckBox)findViewById(R.id.checkBox9);
        checkBox10=(CheckBox)findViewById(R.id.checkBox10);
        et1.setEnabled(false);
        boton2.setEnabled(false);



    }
    public void siguiente(View view){
        Intent intent1 = new Intent (this, main_segundo.class);
        intent1.putExtra("mesa",et1.getText().toString());
        startActivity(intent1);
    }


    public void mesa1(View v) {
        String valor1 = et1.getText().toString();
        if (checkBox.isChecked()==true){
            checkBox2.setEnabled(false);
            checkBox3.setEnabled(false);
            checkBox4.setEnabled(false);
            checkBox5.setEnabled(false);
            checkBox6.setEnabled(false);
            checkBox7.setEnabled(false);
            checkBox8.setEnabled(false);
            checkBox9.setEnabled(false);
            checkBox10.setEnabled(false);
            boton2.setEnabled(true);
            String listo= "Mesa uno";
            et1.setText(String.valueOf(listo));
       }
       else{
            String valor11 = et1.getText().toString();
           if(checkBox.isChecked()==false){
               checkBox2.setEnabled(true);
               checkBox3.setEnabled(true);
               checkBox4.setEnabled(true);
               checkBox5.setEnabled(true);
               checkBox6.setEnabled(true);
               checkBox7.setEnabled(true);
               checkBox8.setEnabled(true);
               checkBox9.setEnabled(true);
               checkBox10.setEnabled(true);
               boton2.setEnabled(false);
               String listo1= "";
               et1.setText(String.valueOf(listo1));
           }}
        }
        public void mesa2(View view) {
            String valor2 = et1.getText().toString();
            if (checkBox2.isChecked() == true) {
                checkBox.setEnabled(false);
                checkBox3.setEnabled(false);
                checkBox4.setEnabled(false);
                checkBox5.setEnabled(false);
                checkBox6.setEnabled(false);
                checkBox7.setEnabled(false);
                checkBox8.setEnabled(false);
                checkBox9.setEnabled(false);
                checkBox10.setEnabled(false);
                boton2.setEnabled(true);
                String listo2 = "Mesa dos";
                et1.setText(String.valueOf(listo2));
            }
            else{
                String valor22 = et1.getText().toString();
                if(checkBox2.isChecked()==false){
                    checkBox.setEnabled(true);
                    checkBox3.setEnabled(true);
                    checkBox4.setEnabled(true);
                    checkBox5.setEnabled(true);
                    checkBox6.setEnabled(true);
                    checkBox7.setEnabled(true);
                    checkBox8.setEnabled(true);
                    checkBox9.setEnabled(true);
                    checkBox10.setEnabled(true);
                    boton2.setEnabled(false);
                    String listo2= "";
                    et1.setText(String.valueOf(listo2));
                }


        }

    }

    public void mesa3(View view){
        String valor3 = et1.getText().toString();
        if (checkBox3.isChecked() == true) {
            checkBox.setEnabled(false);
            checkBox2.setEnabled(false);
            checkBox4.setEnabled(false);
            checkBox5.setEnabled(false);
            checkBox6.setEnabled(false);
            checkBox7.setEnabled(false);
            checkBox8.setEnabled(false);
            checkBox9.setEnabled(false);
            checkBox10.setEnabled(false);
            boton2.setEnabled(true);
            String listo3 = "Mesa tres";
            et1.setText(String.valueOf(listo3));
        }
        else{
            String valor33 = et1.getText().toString();
            if(checkBox3.isChecked()==false){
                checkBox.setEnabled(true);
                checkBox2.setEnabled(true);
                checkBox4.setEnabled(true);
                checkBox5.setEnabled(true);
                checkBox6.setEnabled(true);
                checkBox7.setEnabled(true);
                checkBox8.setEnabled(true);
                checkBox9.setEnabled(true);
                checkBox10.setEnabled(true);
                boton2.setEnabled(false);
                String listo3= "";
                et1.setText(String.valueOf(listo3));
            }


        }

    }

    public void mesa4(View view){
        String valor4 = et1.getText().toString();
        if (checkBox4.isChecked() == true) {
            checkBox.setEnabled(false);
            checkBox2.setEnabled(false);
            checkBox3.setEnabled(false);
            checkBox5.setEnabled(false);
            checkBox6.setEnabled(false);
            checkBox7.setEnabled(false);
            checkBox8.setEnabled(false);
            checkBox9.setEnabled(false);
            checkBox10.setEnabled(false);
            boton2.setEnabled(true);
            String listo4 = "Mesa cuatro";
            et1.setText(String.valueOf(listo4));
        }
        else{
            String valor44 = et1.getText().toString();
            if(checkBox4.isChecked()==false){
                checkBox.setEnabled(true);
                checkBox2.setEnabled(true);
                checkBox3.setEnabled(true);
                checkBox5.setEnabled(true);
                checkBox6.setEnabled(true);
                checkBox7.setEnabled(true);
                checkBox8.setEnabled(true);
                checkBox9.setEnabled(true);
                checkBox10.setEnabled(true);
                boton2.setEnabled(false);
                String listo4= "";
                et1.setText(String.valueOf(listo4));
            }


        }
    }

    public void mesa5(View view){
        String valor5 = et1.getText().toString();
        if (checkBox5.isChecked() == true) {
            checkBox.setEnabled(false);
            checkBox2.setEnabled(false);
            checkBox3.setEnabled(false);
            checkBox4.setEnabled(false);
            checkBox6.setEnabled(false);
            checkBox7.setEnabled(false);
            checkBox8.setEnabled(false);
            checkBox9.setEnabled(false);
            checkBox10.setEnabled(false);
            boton2.setEnabled(true);
            String listo5 = "Mesa cinco";
            et1.setText(String.valueOf(listo5));
        }
        else{
            String valor55 = et1.getText().toString();
            if(checkBox5.isChecked()==false){
                checkBox.setEnabled(true);
                checkBox2.setEnabled(true);
                checkBox3.setEnabled(true);
                checkBox4.setEnabled(true);
                checkBox6.setEnabled(true);
                checkBox7.setEnabled(true);
                checkBox8.setEnabled(true);
                checkBox9.setEnabled(true);
                checkBox10.setEnabled(true);
                boton2.setEnabled(false);
                String listo5= "";
                et1.setText(String.valueOf(listo5));
            }


        }
    }

    public void mesa6 (View view){
        String valor6 = et1.getText().toString();
        if (checkBox6.isChecked() == true) {
            checkBox.setEnabled(false);
            checkBox2.setEnabled(false);
            checkBox3.setEnabled(false);
            checkBox4.setEnabled(false);
            checkBox5.setEnabled(false);
            checkBox7.setEnabled(false);
            checkBox8.setEnabled(false);
            checkBox9.setEnabled(false);
            checkBox10.setEnabled(false);
            boton2.setEnabled(true);
            String listo6 = "Mesa seis";
            et1.setText(String.valueOf(listo6));
        }
        else{
            String valor66 = et1.getText().toString();
            if(checkBox6.isChecked()==false){
                checkBox.setEnabled(true);
                checkBox2.setEnabled(true);
                checkBox3.setEnabled(true);
                checkBox4.setEnabled(true);
                checkBox5.setEnabled(true);
                checkBox7.setEnabled(true);
                checkBox8.setEnabled(true);
                checkBox9.setEnabled(true);
                checkBox10.setEnabled(true);
                boton2.setEnabled(false);
                String listo6= "";
                et1.setText(String.valueOf(listo6));
            }


        }
    }

    public void mesa7(View view){
        String valor7 = et1.getText().toString();
        if (checkBox7.isChecked() == true) {
            checkBox.setEnabled(false);
            checkBox2.setEnabled(false);
            checkBox3.setEnabled(false);
            checkBox4.setEnabled(false);
            checkBox5.setEnabled(false);
            checkBox6.setEnabled(false);
            checkBox8.setEnabled(false);
            checkBox9.setEnabled(false);
            checkBox10.setEnabled(false);
            boton2.setEnabled(true);
            String listo7 = "Mesa siete";
            et1.setText(String.valueOf(listo7));
        }
        else{
            String valor77 = et1.getText().toString();
            if(checkBox7.isChecked()==false){
                checkBox.setEnabled(true);
                checkBox2.setEnabled(true);
                checkBox3.setEnabled(true);
                checkBox4.setEnabled(true);
                checkBox5.setEnabled(true);
                checkBox6.setEnabled(true);
                checkBox8.setEnabled(true);
                checkBox9.setEnabled(true);
                checkBox10.setEnabled(true);
                boton2.setEnabled(false);
                String listo7= "";
                et1.setText(String.valueOf(listo7));
            }


        }
    }

    public void mesa8(View view){
        String valor8 = et1.getText().toString();
        if (checkBox8.isChecked() == true) {
            checkBox.setEnabled(false);
            checkBox2.setEnabled(false);
            checkBox3.setEnabled(false);
            checkBox4.setEnabled(false);
            checkBox5.setEnabled(false);
            checkBox6.setEnabled(false);
            checkBox7.setEnabled(false);
            checkBox9.setEnabled(false);
            checkBox10.setEnabled(false);
            boton2.setEnabled(true);
            String listo8 = "Mesa ocho";
            et1.setText(String.valueOf(listo8));
        }
        else{
            String valor88 = et1.getText().toString();
            if(checkBox2.isChecked()==false){
                checkBox.setEnabled(true);
                checkBox2.setEnabled(true);
                checkBox3.setEnabled(true);
                checkBox4.setEnabled(true);
                checkBox5.setEnabled(true);
                checkBox6.setEnabled(true);
                checkBox7.setEnabled(true);
                checkBox9.setEnabled(true);
                checkBox10.setEnabled(true);
                boton2.setEnabled(false);
                String listo8= "";
                et1.setText(String.valueOf(listo8));
            }


        }
    }
    public void mesa9(View view){
        String valor9 = et1.getText().toString();
        if (checkBox9.isChecked() == true) {
            checkBox.setEnabled(false);
            checkBox2.setEnabled(false);
            checkBox3.setEnabled(false);
            checkBox4.setEnabled(false);
            checkBox5.setEnabled(false);
            checkBox6.setEnabled(false);
            checkBox7.setEnabled(false);
            checkBox8.setEnabled(false);
            checkBox10.setEnabled(false);
            boton2.setEnabled(true);
            String listo9 = "Mesa nueve";
            et1.setText(String.valueOf(listo9));
        }
        else{
            String valor99 = et1.getText().toString();
            if(checkBox9.isChecked()==false){
                checkBox.setEnabled(true);
                checkBox2.setEnabled(true);
                checkBox3.setEnabled(true);
                checkBox4.setEnabled(true);
                checkBox5.setEnabled(true);
                checkBox6.setEnabled(true);
                checkBox7.setEnabled(true);
                checkBox8.setEnabled(true);
                checkBox10.setEnabled(true);
                boton2.setEnabled(false);
                String listo9= "";
                et1.setText(String.valueOf(listo9));
            }


        }
    }
    public void mesa10(View view){
        String valor10 = et1.getText().toString();
        if (checkBox10.isChecked() == true) {
            checkBox.setEnabled(false);
            checkBox2.setEnabled(false);
            checkBox3.setEnabled(false);
            checkBox4.setEnabled(false);
            checkBox5.setEnabled(false);
            checkBox6.setEnabled(false);
            checkBox7.setEnabled(false);
            checkBox8.setEnabled(false);
            checkBox9.setEnabled(false);
            boton2.setEnabled(true);
            String listo10 = "Mesa diez";
            et1.setText(String.valueOf(listo10));
        }
        else{
            String valor1010 = et1.getText().toString();
            if(checkBox2.isChecked()==false){
                checkBox.setEnabled(true);
                checkBox2.setEnabled(true);
                checkBox3.setEnabled(true);
                checkBox4.setEnabled(true);
                checkBox5.setEnabled(true);
                checkBox6.setEnabled(true);
                checkBox7.setEnabled(true);
                checkBox8.setEnabled(true);
                checkBox9.setEnabled(true);
                boton2.setEnabled(false);
                String listo10= "";
                et1.setText(String.valueOf(listo10));
            }


        }
    }









}

