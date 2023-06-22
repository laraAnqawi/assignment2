package com.example.ass1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private ImageButton imageButton1 ;
    private ImageButton imageButton2;
    private ImageButton imageButton3 ;
    private ImageButton imageButton4;
    private Button but1;
    private TextView text1;
    private TextView text4;
    private EditText edittext1;
    double radius;
    double Result;
    private  Button count;
    private Button Exit;
    private EditText editWidth;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculation);


        but1 = findViewById(R.id.button1);
        text1=findViewById(R.id.textView1);
        text4=findViewById(R.id.textView5);
        edittext1= findViewById(R.id.Edittext);
        text1.setVisibility(View.GONE);
        text4.setVisibility(View.GONE);
        edittext1.setVisibility(View.GONE);
        count=findViewById(R.id.button8);
        editWidth =findViewById(R.id.edittext);
        editWidth.setVisibility(View.GONE);
        Exit=findViewById(R.id.exitbut);


        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        if (message != null ){
            if (message =="Rectangle"){
                Toast.makeText(MainActivity.this, "You've chosen a Rectangle shape.", Toast.LENGTH_SHORT).show();


                text1.setText("Rectangle: A = X * Y (where A is the area, X is the length, and Y is the width");
                text1.setVisibility(View.VISIBLE);
                text4.setVisibility(View.VISIBLE);
                edittext1.setVisibility(View.VISIBLE);
                editWidth.setVisibility(View.VISIBLE);



                count.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (edittext1.getText().toString().isEmpty() && editWidth.getText().toString().isEmpty()){
                            Toast.makeText(MainActivity.this, "Please enter a value", Toast.LENGTH_SHORT).show();
                        } else {
                            radius = Double.parseDouble(edittext1.getText().toString());
                            double W = Double.parseDouble(editWidth.getText().toString());
                            Result = (radius * W) ;
                            double roundedResult = Math.round(Result * 100.0) / 100.0;
                            text4.setText("The result" + roundedResult);
                        }
                    }
                });
            }else
            if (message =="Triangle"){
                text1.setText("Triangle: A = X * Y (where A is the area, X is the length, and Y is the width");
                text1.setVisibility(View.VISIBLE);
                text4.setVisibility(View.VISIBLE);
                edittext1.setVisibility(View.VISIBLE);
                editWidth.setVisibility(View.VISIBLE);



                count.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (edittext1.getText().toString().isEmpty() && editWidth.getText().toString().isEmpty()){
                            Toast.makeText(MainActivity.this, "Please enter a value", Toast.LENGTH_SHORT).show();
                        } else {
                            radius = Double.parseDouble(edittext1.getText().toString());
                            double W = Double.parseDouble(editWidth.getText().toString());
                            Result = (radius * W) ;
                            double roundedResult = Math.round(Result * 100.0) / 100.0;
                            text4.setText("The result" + roundedResult);
                        }
                    }
                });
            }
            else
                if (message =="Circle") {

                    text1.setText("Circle: A = πr² (where A is the area and r is the radius");
                    text1.setVisibility(View.VISIBLE);
                    text4.setVisibility(View.VISIBLE);
                    edittext1.setVisibility(View.VISIBLE);

                    count.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (edittext1.getText().toString().isEmpty()) {
                                Toast.makeText(MainActivity.this, "Please enter a value", Toast.LENGTH_SHORT).show();
                            } else {
                                radius = Double.parseDouble(edittext1.getText().toString());
                                Result = (radius * radius) * Math.PI;
                                double roundedResult = Math.round(Result * 100.0) / 100.0;
                                text4.setText("The result of " + radius + "^2 * π" + " is " + roundedResult);
                            }
                        }
                    });
                }else {
                    Toast.makeText(MainActivity.this, "You've chosen a square shape.", Toast.LENGTH_SHORT).show();

                    text1.setText("square: A = X * X (where A is the area, X is the length, and X is the width");
                    text1.setVisibility(View.VISIBLE);
                    text4.setVisibility(View.VISIBLE);
                    edittext1.setVisibility(View.VISIBLE);


                    count.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (edittext1.getText().toString().isEmpty()) {
                                Toast.makeText(MainActivity.this, "Please enter a value", Toast.LENGTH_SHORT).show();
                            } else {
                                radius = Double.parseDouble(edittext1.getText().toString());

                                Result = (radius * radius) ;
                                double roundedResult = Math.round(Result * 100.0) / 100.0;
                                text4.setText("The result" + roundedResult);
                            }
                        }
                    });

                }
                }
        }
        }



