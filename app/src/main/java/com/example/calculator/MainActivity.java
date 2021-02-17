package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.calculator.R;

public class MainActivity extends AppCompatActivity {
    EditText et;
    float num1,num2;
    boolean add,subtract,multiply,divide,mod;
    Button button1,button2,button3,button4,button5,button6,button7,button8,
            button9,button0,buttonadd,buttonsub,buttonmulti,buttondivide,buttonmod,buttoneql,buttonclr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et= findViewById(R.id.et);
        button1=findViewById(R.id.oneBTN);
        button2=findViewById(R.id.twoBTN);
        button3=findViewById(R.id.threeBTN);
        button4=findViewById(R.id.fourBTN);
        button5=findViewById(R.id.fiveBTN);
        button6=findViewById(R.id.sixBTN);
        button7=findViewById(R.id.sevenBTN);
        button8=findViewById(R.id.eightBTN);
        button9=findViewById(R.id.nineBTN);
        button0=findViewById(R.id.zeroBTN);
        buttonadd=findViewById(R.id.addBTN);
        buttonsub=findViewById(R.id.subtractBTN);
        buttonmod=findViewById(R.id.modBTN);
        buttonmulti=findViewById(R.id.multiplyBTN);
        buttondivide=findViewById(R.id.divideBTN);
        buttoneql=findViewById(R.id.equalsBTN);
        buttonclr=findViewById(R.id.clearBTN);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"0");
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et==null)
                {
                    et.setText("");

                }
                else
                {
                    num1= Float.parseFloat(et.getText()+"");
                    add=true;
                    et.setText(null);
                }

            }
        });

        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et==null)
                {
                    et.setText("");

                }
                else
                {
                    num1= Float.parseFloat(et.getText()+"");
                    subtract=true;
                    et.setText(null);
                }

            }
        });

        buttonmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et==null)
                {
                    et.setText("");

                }
                else
                {
                    num1= Float.parseFloat(et.getText()+"");
                    multiply=true;
                    et.setText(null);
                }

            }
        });

        buttonmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et==null)
                {
                    et.setText("");

                }
                else
                {
                    num1= Float.parseFloat(et.getText()+"");
                    mod=true;
                    et.setText(null);
                }

            }
        });

        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et==null)
                {
                    et.setText("");

                }
                else
                {
                    num1= Float.parseFloat(et.getText()+"");
                    divide=true;
                    et.setText(null);
                }

            }
        });

        buttoneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2=Float.parseFloat(et.getText()+"");
                if (add==true)
                {
                    et.setText((num1+num2+""));
                    add=false;
                }

                if (subtract==true)
                {
                    et.setText((num1-num2+""));
                    subtract=false;
                }
                if (multiply==true)
                {
                    et.setText((num1*num2+""));
                    multiply=false;
                }
                if (divide==true)
                {
                    et.setText((num1/num2+""));
                    divide=false;
                }
                if (mod==true)
                {
                    et.setText((num1%num2+""));
                    mod=false;
                }
            }
        });

        buttonclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText("");
            }
        });
    }
}