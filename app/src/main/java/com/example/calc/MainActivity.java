package com.example.calc;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public float x=0;
public float y=0;
public float z=0;
public void getx(View sonic){
    TextInputEditText num1= (TextInputEditText) findViewById(R.id.num);
    String v=num1.getText().toString();
    x=Float.valueOf(v);
}
    public void gety(View sonic){
        TextInputEditText num1= (TextInputEditText) findViewById(R.id.num);
        String v=num1.getText().toString();
        y=Float.valueOf(v);
    }
    public void pl(View sonic){
    z=x+y;
        TextView r= (TextView) findViewById(R.id.res);
        String v=Float.toString(z);
        r.setText(v);
    }
    public void mi(View sonic){
    z=x-y;
        TextView r= (TextView) findViewById(R.id.res);
        String v=Float.toString(z);
        r.setText(v);
    }
    public void ml(View sonic){
    z=x*y;
        TextView r= (TextView) findViewById(R.id.res);
        String v=Float.toString(z);
        r.setText(v);
    }
    public void di(View sonic){
    z=x/y;
        TextView r= (TextView) findViewById(R.id.res);
        String v=Float.toString(z);
        if(y==0){
            v="NO JUST NO";
        }
        r.setText(v);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
