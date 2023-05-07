package com.example.ass1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
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
    private EditText editWidth;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton1 = findViewById(R.id.imageButton2);
        imageButton2= findViewById(R.id.imageButton3);
        imageButton3 = findViewById(R.id.imageButton4);
        imageButton4 = findViewById(R.id.imageButton5);
        but1 = findViewById(R.id.button1);
        text1=findViewById(R.id.textView2);
        text4=findViewById(R.id.textView5);
        edittext1= findViewById(R.id.Edittext);
        text1.setVisibility(View.GONE);
        text4.setVisibility(View.GONE);
        edittext1.setVisibility(View.GONE);
        count=findViewById(R.id.button8);
        editWidth =findViewById(R.id.edittext);
        editWidth.setVisibility(View.GONE);



        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You've chosen a circle shape.", Toast.LENGTH_SHORT).show();
                imageButton2.setVisibility(View.GONE);
                imageButton3.setVisibility(View.GONE);
                imageButton4.setVisibility(View.GONE);
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


            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You've chosen a Rectangle shape.", Toast.LENGTH_SHORT).show();
                imageButton1.setVisibility(View.GONE);
                imageButton3.setVisibility(View.GONE);
                imageButton4.setVisibility(View.GONE);

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
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You've chosen a square shape.", Toast.LENGTH_SHORT).show();
                imageButton2.setVisibility(View.GONE);
                imageButton1.setVisibility(View.GONE);
                imageButton4.setVisibility(View.GONE);
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
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You've chosen a Triangle shape.", Toast.LENGTH_SHORT).show();
                imageButton2.setVisibility(View.GONE);
                imageButton3.setVisibility(View.GONE);
                imageButton1.setVisibility(View.GONE);
                editWidth.setVisibility(View.VISIBLE);

                text1.setText("Triangle: A = 0.5bh (where A is the area, b is the base, and h is the height)");
                text1.setVisibility(View.VISIBLE);
                text4.setVisibility(View.VISIBLE);
                edittext1.setVisibility(View.VISIBLE);

                count.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (edittext1.getText().toString().isEmpty() && editWidth.getText().toString().isEmpty()) {
                            Toast.makeText(MainActivity.this, "Please enter a value", Toast.LENGTH_SHORT).show();
                        } else {
                            radius = Double.parseDouble(edittext1.getText().toString());
                            double W = Double.parseDouble(editWidth.getText().toString());
                            Result = (radius * W * 0.5) ;
                            double roundedResult = Math.round(Result * 100.0) / 100.0;
                            text4.setText("The result" + roundedResult);
                        }
                    }
                });

            }
        });
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageButton2.setVisibility(View.VISIBLE);
                imageButton3.setVisibility(View.VISIBLE);
                imageButton1.setVisibility(View.VISIBLE);
                imageButton4.setVisibility(View.VISIBLE);
                text1.setVisibility(View.GONE);
                text4.setVisibility(View.GONE);
                edittext1.setVisibility(View.GONE);
                editWidth.setVisibility(View.GONE);
                edittext1.setText(null);
                editWidth.setText(null);
                text4.setText(null);
            }
        });
    }

}