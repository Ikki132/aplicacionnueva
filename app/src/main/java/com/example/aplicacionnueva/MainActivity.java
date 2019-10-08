package com.example.aplicacionnueva;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView rel;
    EditText num1,num2;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rel=(TextView) findViewById(R.id.resultado);
        num1=(EditText) findViewById(R.id.numero1);
        num2=(EditText) findViewById(R.id.numero2);
        btn1=(Button) findViewById(R.id.suma);
        btn2=(Button) findViewById(R.id.resta);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int n1= Integer.parseInt(num1.getText().toString());
        int n2= Integer.parseInt(num2.getText().toString());

        if (view.getId()==R.id.suma){
            rel.setText("La suma es "+(n1+n2));
        }
        else if(view.getId()==R.id.resta){
            rel.setText("La resta es "+(n1-n2));
        }
    }
}
