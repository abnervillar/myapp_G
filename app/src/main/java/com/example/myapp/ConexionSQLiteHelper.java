package com.example.myapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {

    final String CREAR_TABLA_USUARIO="CREATE TABLE comida (id INTEGER, nombre TEXT, precio TEXT)";

    final String INSERTAR_DATOS_TABLA1="INSERT INTO comida values ( 01 , 'Papas fritas','1500')";
    final String INSERTAR_DATOS_TABLA2="INSERT INTO comida values ( 02 , 'Brochetas','3000')";
    final String INSERTAR_DATOS_TABLA3="INSERT INTO comida values ( 03 , 'Sushi','6500')";

    public ConexionSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "BDD", factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAR_TABLA_USUARIO);
        db.execSQL(INSERTAR_DATOS_TABLA1);
        db.execSQL(INSERTAR_DATOS_TABLA2);
        db.execSQL(INSERTAR_DATOS_TABLA3);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int VersionAntigua, int VersionNueva) {
        db.execSQL("DROP TABLE IF EXISTS comida");
        onCreate(db);

    }

        public ArrayList llenar_lv(){
        ArrayList<String>  lista = new ArrayList<>();
        SQLiteDatabase database = this.getWritableDatabase();
        String mostrar_r = "SELECT * FROM comida";
            Cursor registros = database.rawQuery(mostrar_r,null);
            if(registros.moveToFirst()){
                do {
                    lista.add(registros.getString(0));
                    lista.add(registros.getString(1));
                    lista.add(registros.getString(2));
                }while(registros.moveToNext());
            }


        return lista;
        }



}
