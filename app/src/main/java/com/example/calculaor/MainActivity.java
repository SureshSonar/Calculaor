package com.example.calculaor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editweight, editheightfeet, editheightinch;
        TextView txtresult;
        Button btncalc;


        editweight = findViewById(R.id.editweight);
        editheightfeet = findViewById(R.id.editheightfeet);
        editheightinch = findViewById(R.id.editheightinch);
        btncalc=findViewById(R.id.btncalc);
        txtresult=findViewById(R.id.txtresult);


        btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt =Integer.parseInt(editweight.getText().toString());
                int ft =Integer.parseInt(editheightfeet.getText().toString());
                int in =Integer.parseInt(editheightinch.getText().toString());

               int totalin = ft*12+in;
               double totalcm=totalin*2.53;
               double totalm=totalcm/100;
               double bmi=wt/(totalm*totalm);

               if(bmi>25){
                   txtresult.setText("Overwieight");

               } else if (bmi<18) {
                   txtresult.setText("Underweight");


               }
               else {
                   txtresult.setText("healthy");

               }
            }
        });







    }
}