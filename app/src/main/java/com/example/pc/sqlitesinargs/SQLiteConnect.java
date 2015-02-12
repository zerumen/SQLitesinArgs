package com.example.pc.sqlitesinargs;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Pc on 12/02/2015.
 */
public class SQLiteConnect extends SQLiteOpenHelper {
    String SqliteCreate="CREATE TABLE usuarios(codigo INTEGER,nombre TEXT)";

    public SQLiteConnect(Context contexto,String nombre, SQLiteDatabase.CursorFactory factory,int version){
        super(contexto,nombre,factory,version);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(SqliteCreate);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS usuarios");
        db.execSQL(SqliteCreate);
    }
}
