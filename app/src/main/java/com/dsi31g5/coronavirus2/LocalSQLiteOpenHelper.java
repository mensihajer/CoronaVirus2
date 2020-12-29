package com.dsi31g5.coronavirus2;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class LocalSQLiteOpenHelper extends SQLiteOpenHelper {


    public LocalSQLiteOpenHelper(@Nullable Context context) {
        super(context, "GestionCorona", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE User(id INTEGER PRIMARY KEY AUTOINCREMENT ,Nom TEXT,Prenom TEXT,Email TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS User ");
         onCreate(db);
    }
}



