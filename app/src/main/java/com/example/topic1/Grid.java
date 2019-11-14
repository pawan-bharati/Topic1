package com.example.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Grid extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btnAC, btn14;
    EditText etdisplay;
    public int text1, text2;
    TextView textcheckSum;
    public int symbol = 0;
    Gridclass gridclass = new Gridclass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btnAC = findViewById(R.id.btnAC);
        etdisplay = findViewById(R.id.etdisplay);
        textcheckSum = findViewById(R.id.sumcheck);
        gridclass.setFirst(0);
        gridclass.setSecond(0);



        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etdisplay.getText())){
                    etdisplay.setError("Enter number to add");
                    return;
                }
                symbol = 1;
                text1 = Integer.parseInt(etdisplay.getText().toString());
                gridclass.setFirst(text1);
                
                etdisplay.getText().clear();
                textcheckSum.setText(text1 + "+");

            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etdisplay.getText())){
                    etdisplay.setError("Enter number to subtract");
                    return;
                }
                symbol = 2;
                text1 = Integer.parseInt(etdisplay.getText().toString());
                etdisplay.getText().clear();
                textcheckSum.setText(text1 + "-");
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etdisplay.getText())){
                    etdisplay.setError("Enter number to multiply");
                    return;
                }
                symbol = 3;
                text1 = Integer.parseInt(etdisplay.getText().toString());
                etdisplay.getText().clear();
                textcheckSum.setText(text1 + "*");
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etdisplay.getText())){
                    etdisplay.setError("Enter number to divide");
                    return;
                }
                symbol = 4;
                text1 = Integer.parseInt(etdisplay.getText().toString());
                etdisplay.getText().clear();
                textcheckSum.setText(text1 + "/");

            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.getText().clear();
                text1 = 0;
                text2 = 0;
                textcheckSum.setText("");
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etdisplay.getText())) {
                    etdisplay.setError("Enter Something to add ");
                    return;
                }
                text2 = Integer.parseInt(etdisplay.getText().toString());
                gridclass.setSecond(text2);

                if (symbol == 1) {
                    textcheckSum.setText(gridclass.foradd());
                    etdisplay.setText(Integer.toString(gridclass.addres()));
                } else if (symbol == 2) {
                    textcheckSum.setText(gridclass.forsub());
                    etdisplay.setText(Integer.toString(gridclass.subres()));
                } else if (symbol == 3) {
                    textcheckSum.setText(gridclass.formul());
                    etdisplay.setText(Integer.toString(gridclass.mulres()));
                } else if (symbol == 4) {
                    textcheckSum.setText(gridclass.fordiv());
                    etdisplay.setText(Integer.toString(gridclass.divres()));
                }
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdisplay.setText(etdisplay.getText().toString() + "9");
            }
        });



    }


}
