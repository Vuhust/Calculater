


package com.example.calculater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    String a="", b = "" , math="";
    int count;
    int dot = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_0 = findViewById(R.id.n0);
        Button button_1 =  findViewById(R.id.no1);
        Button button_2 =  findViewById(R.id.no2);
        Button button_3 = findViewById(R.id.no3);
        Button button_4 = findViewById(R.id.no4);
        Button button_5 = findViewById(R.id.no5);
        Button button_6 = findViewById(R.id.no6);
        Button button_7 = findViewById(R.id.no7);
        Button button_8 = findViewById(R.id.no8);
        Button button_9 = findViewById(R.id.no9);
        Button button_Dot = findViewById(R.id.dot);
        Button button_Add = findViewById(R.id.add);
        Button button_Sub = findViewById(R.id.aub);            //aub la sub viet nham
        Button button_Mul = findViewById(R.id.mu);
        Button button_Div = findViewById(R.id.di);
        Button button_C = findViewById(R.id.C);
        Button button_CE = findViewById(R.id.CE);
        Button button_Equ = findViewById(R.id.equal);
        TextView ans = findViewById(R.id.ans);
        TextView his = findViewById(R.id.His);
        Button renum = findViewById(R.id.renum);
        Button del = findViewById(R.id.del);


        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( count == 1 ) {
                    b = b + "1";
                }
                else a = a + "1";
                    ans.setText(ans.getText()+"1");


            }
        });


        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( count == 1 ) {
                    b = b + "2";
                }
                else a = a + "2";
                ans.setText(ans.getText()+"2");


            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( count == 1 ) {
                    b = b + "3";
                }
                else a = a + "3";
                ans.setText(ans.getText()+"3");

            }



        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( count == 1 ) {
                    b = b + "4";
                }
                else a = a + "4";
                ans.setText(ans.getText()+"4");


            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( count == 1 ) {
                    b = b + "5";
                }
                else a = a + "5";
                ans.setText(ans.getText()+"5");


            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( count == 1 ) {
                    b = b + "6";
                }
                else a = a + "6";
                ans.setText(ans.getText()+"6");


            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( count == 1 ) {
                    b = b + "7";
                }
                else a = a + "7";
                ans.setText(ans.getText()+"7");


            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( count == 1 ) {
                    b = b + "8";
                }
                else a = a + "8";

                ans.setText(ans.getText() + "8");
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( count == 1 ) {
                    b = b + "9";
                }
                else a = a + "9";

                ans.setText(ans.getText() + "9");
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( count == 1 ) {
                    b = b + "0";
                }
                else a = a + "0";

                ans.setText(ans.getText() + "0");
            }
        });

        button_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText() != "") {
                   if (count == 0){
                       a = String.valueOf(ans.getText());
                       ans.setText(a+"+");
                       math ="+";
                       count = 1;
                   }
                   else if(b == ""){
                       ans.setText(a+"+");
                       math ="+";
                   }
                   else{
                       Float c = Float.valueOf(a) + Float.valueOf(b);
                       float x = (float) c;
                       if ((x - (int)x) == 0) dot =0;
                       else dot =1;
                       ans.setText(String.valueOf(c)+"+");
                       a = String.valueOf(c);
                       his.setText(a+math+b+"=");
                       b = "";
                       math = "+";
                   }
                }
                dot = 0;
            }
        });

        button_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText().length() != 0) {
                    if (count == 0){
                        a = String.valueOf(ans.getText());
                        ans.setText(a+"-");
                        math ="-";
                        count = 1;
                    }
                    else if(b == ""){
                        ans.setText(a+"-");
                        math ="-";
                    }
                    else{
                        Float c = Float.valueOf(a) - Float.valueOf(b);
                        float x = (float) c;
                        if ((x - (int)x) == 0) dot =0;
                        else dot =1;
                        ans.setText(String.valueOf(c)+"-");
                        a = String.valueOf(c);
                        his.setText(a+ math + b + "=" );
                        b = "";
                        math = "-";
                    }
                }
                dot = 0;
            }
        });

        button_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText() != "") {
                    if (count == 0){
                        a = String.valueOf(ans.getText());
                        ans.setText(a+"x");
                        math ="x";
                        count = 1;
                    }
                    else if(b == ""){
                        ans.setText(a+"X");
                        math ="X";
                    }
                    else{
                        Float c = Float.valueOf(a)*Float.valueOf(b);
                        float x = (float) c;
                        if ((x - (int)x) == 0) dot =0;
                        else dot =1;
                        ans.setText(String.valueOf(c));
                        his.setText(a+ math + b+ "=");
                        b = "";
                        math = "X";
                    }
                }
                dot = 0;
            }
        });

        button_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans.getText() != "") {
                    if (count == 0){
                        a = String.valueOf(ans.getText());
                        ans.setText(a+"/");
                        math ="/";
                        count = 1;
                    }
                    else if(b == ""){
                        ans.setText(a+"/");
                        math ="/";
                    }
                    else{
                        Float c = Float.valueOf(a) / Float.valueOf(b);
                        float x = (float) c;
                        if ((x - (int)x) == 0) dot =0;
                        else dot =1;
                        ans.setText(String.valueOf(c));
                        a = String.valueOf(c);
                        his.setText(a+ math + b+ "=");
                        b = "";
                        math = "/";
                    }
                }
                dot = 0;
            }
        });

        button_CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( count == 0 ){
                    ans.setText("0");
                    a = "";
                    b = "";
                    count = 0;
                    his.setText("");
                }
                else{
                    b = "";
                    ans.setText(a+math);

                }
                dot = 0;
                }
        });

        button_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText("0");
                a = "";
                b = "";
                count = 0;
                his.setText("");
                dot = 0;
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int l = ans.getText().length();
                int endI = 0;
                if (l != 1) {
                    endI = l - 1;

                    String text = String.valueOf(ans.getText());
                    String end = text.substring(endI, endI);
                    if (end == math) {
                        math = "";
                        ans.setText(a);
                    } else if (end == ".") {
                        if (count == 0) {
                            a = a.substring(0, endI);
                            ans.setText(a);
                        } else {
                            b = b.substring(0, b.length() - 1);
                            ans.setText(text.substring(0, endI));
                        }
                        dot = 0;
                    } else {
                        ans.setText(text.substring(0, l - 1));
                    }
                }
            }
        });

        button_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( dot == 0) {
                    if (count == 0) {
                        a = a + ".";
                        ans.setText(String.valueOf(a));
                        dot = 1;
                    } else if (b == "") {
                        b = b + "0.";
                        ans.setText(a + math + "0.");
                        dot = 1;
                    } else {
                        b = b + ".";
                        ans.setText(a + math + b);
                        dot = 1;
                    }
                }
            }
        });

        renum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( count == 0) {
                    Float now = Float.valueOf(String.valueOf(ans.getText()));
                    now = -now;
                    a = String.valueOf(now);
                    ans.setText(String.valueOf(now));
                }
                }
        });

        button_Equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( count ==  1 & b != "" & a != ""){
                    dot = 0;
                    switch ( math){
                        case "+":
                            ans.setText(String.valueOf(Float.valueOf(a)+Float.valueOf(b)));
                            his.setText(a + math + b+ "=");
                            a =String.valueOf(ans.getText()); b = ""; math = ""; count =0;
                            dot = 1;
                            break;
                        case "-":
                            ans.setText(String.valueOf(Float.valueOf(a)-Float.valueOf(b)));
                            his.setText(a + math + b+ "=");
                            a = String.valueOf(ans.getText()); b = ""; math = ""; count =0;
                            dot = 1;
                            break;
                        case "x":
                            ans.setText(String.valueOf(Float.valueOf(a)*Float.valueOf(b)));
                            his.setText(a + math + b+ "=");
                            a = String.valueOf(ans.getText()); b = ""; math = ""; count =0;
                            dot = 1;
                            break;
                        case "/":
                            ans.setText(String.valueOf(Float.valueOf(a)/Float.valueOf(b)));
                            his.setText(a + math + b+ "=");
                            a = String.valueOf(ans.getText()); b = ""; math = ""; count =0;
                            dot =1;
                            break;
                    }
                }

            }
        });


    }
}