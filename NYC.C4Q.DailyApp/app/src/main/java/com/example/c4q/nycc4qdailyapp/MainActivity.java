package com.example.c4q.nycc4qdailyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

 /*
 * CHECKS TO SEE IF THE EMAIL IS IN A VALID FORMAT
 * */
    public boolean checkEmail() {

        String email = "";
        int countVarAtSymbol = 0;
        int countComSuffix = 0;
        String message;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@'){
                countVarAtSymbol++;
            }
            if (email.endsWith(".com")){
                countComSuffix++;
            }
        }

        if (countVarAtSymbol == 1 && countComSuffix == 1){
            message = "This is a valid email";
            return true;
        }else{
            message = "This is not a valid email";
            return false;
        }
    }


}
