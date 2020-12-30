package com.dsi31g5.coronavirus2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class questionnaire extends AppCompatActivity {
                 double Q1;
                 boolean Q2;
                 boolean Q3;
                 boolean Q4;
                 boolean Q5;
                 boolean Q6;
                 boolean Q7;
                 boolean Q8;
                 boolean Q9;
                 boolean Q10;

    public questionnaire(double q1, boolean q2, boolean q3, boolean q4, boolean q5, boolean q6, boolean q7, boolean q8, boolean q9, boolean q10) {
        Q1 = q1;
        Q2 = q2;
        Q3 = q3;
        Q4 = q4;
        Q5 = q5;
        Q6 = q6;
        Q7 = q7;
        Q8 = q8;
        Q9 = q9;
        Q10 = q10;
    }
    public questionnaire(){

    }

    public double getQ1() {
        return Q1;
    }

    public void setQ1(double q1) {
        Q1 = q1;
    }

    public boolean getQ2() {
        return Q2;
    }

    public void setQ2(boolean q2) {
        Q2 = q2;
    }

    public boolean getQ3() {
        return Q3;
    }

    public void setQ3(boolean q3) {
        Q3 = q3;
    }

    public boolean getQ4() {
        return Q4;
    }

    public void setQ4(boolean q4) {
        Q4 = q4;
    }

    public boolean getQ5() {
        return Q5;
    }

    public void setQ5(boolean q5) {
        Q5 = q5;
    }

    public boolean getQ6() {
        return Q6;
    }

    public void setQ6(boolean q6) {
        Q6 = q6;
    }

    public boolean getQ7() {
        return Q7;
    }

    public void setQ7(boolean q7) {
        Q7 = q7;
    }

    public boolean getQ8() {
        return Q8;
    }

    public void setQ8(boolean q8) {
        Q8 = q8;
    }

    public boolean getQ9() {
        return Q9;
    }

    public void setQ9(boolean q9) {
        Q9 = q9;
    }

    public boolean getQ10() {
        return Q10;
    }

    public void setQ10(boolean q10) {
        Q10 = q10;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);
    }
}