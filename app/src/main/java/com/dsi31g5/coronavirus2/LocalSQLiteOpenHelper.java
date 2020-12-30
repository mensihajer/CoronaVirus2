package com.dsi31g5.coronavirus2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class LocalSQLiteOpenHelper extends SQLiteOpenHelper {


    public LocalSQLiteOpenHelper(@Nullable Context context) {
        super(context, "questionnaire", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE questionnaire(   Q1 double  PRIMARY KEY ,Q2 boolean,Q3 Boolean,Q4 Boolean,Q5 Boolean,Q6 Boolean,Q7 Boolean,Q8 Boolean,Q9 Boolean,Q10 Boolean");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Questionnaire");
         onCreate(db);
    }
    public void insertQuestionnaire(questionnaire Q){
        SQLiteDatabase db=getReadableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("Q1",Q.getQ1());
        cv.put("Q2",Q.getQ2());
        cv.put("Q3",Q.getQ3());
        cv.put("Q4",Q.getQ4());
        cv.put("Q5",Q.getQ5());
        cv.put("Q6",Q.getQ6());
        cv.put("Q7",Q.getQ7());
        cv.put("Q8",Q.getQ8());
        cv.put("Q9",Q.getQ9());
        cv.put("Q10",Q.getQ10());
    }
}



