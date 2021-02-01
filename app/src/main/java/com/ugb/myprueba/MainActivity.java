package com.ugb.myprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.DocumentType;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button sumar = findViewById(R.id.btnsuma);
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tempVal = (TextView)findViewById(R.id.txtnum1);
                double num1 = Double.parseDouble(tempVal.getText().toString());

                tempVal = (TextView)findViewById(R.id.txtnum2);
                double num2 = Double.parseDouble(tempVal.getText().toString());

                double respuesta = 1;

                respuesta = num1 + num2;


                tempVal = findViewById(R.id.lblrespuesta);
                tempVal.setText("Respuesta:" + respuesta);
            }
        });

        final Button restar = findViewById(R.id.btnresta);
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tempVal = (TextView)findViewById(R.id.txtnum1);
                double num1 = Double.parseDouble(tempVal.getText().toString());

                tempVal = (TextView)findViewById(R.id.txtnum2);
                double num2 = Double.parseDouble(tempVal.getText().toString());

                double respuesta = 1;

                respuesta = num1 - num2;

                tempVal = findViewById(R.id.lblrespuesta);
                tempVal.setText("Respuesta:" + respuesta);
            }
        });

        final Button multiplicar = findViewById(R.id.btnmulti);
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tempVal = (TextView)findViewById(R.id.txtnum1);
                double num1 = Double.parseDouble(tempVal.getText().toString());

                tempVal = (TextView)findViewById(R.id.txtnum2);
                double num2 = Double.parseDouble(tempVal.getText().toString());

                double respuesta = 1;

                respuesta = num1 * num2;

                tempVal = findViewById(R.id.lblrespuesta);
                tempVal.setText("Respuesta: " + respuesta);
            }
        });

        final Button dividir = findViewById(R.id.btndivi);
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tempVal = (TextView)findViewById(R.id.txtnum1);
                double num1 = Double.parseDouble(tempVal.getText().toString());

                tempVal = (TextView)findViewById(R.id.txtnum2);
                double num2 = Double.parseDouble(tempVal.getText().toString());

                double respuesta = 1;

                respuesta = num1 /  num2;

                tempVal = findViewById(R.id.lblrespuesta);
                tempVal.setText("Respuesta:" + respuesta);


            }
        });

        final Button factorizar = findViewById(R.id.btnfact);
        factorizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tempVal = (TextView)findViewById(R.id.txtnum1);
                double num1 = Double.parseDouble(tempVal.getText().toString());

                double respuesta = 1;
                for (int i =2; i <= num1; i++){
                    respuesta *= i;
                }

                tempVal = findViewById(R.id.lblrespuesta);
                tempVal.setText("Respuesta: " + respuesta);

            }
        });

        final Button porcentaje = findViewById(R.id.btnporcen);
        porcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tempVal = (TextView)findViewById(R.id.txtnum1);
                double num1 = Double.parseDouble(tempVal.getText().toString());

                tempVal = (TextView)findViewById(R.id.txtnum2);
                double num2 = Double.parseDouble(tempVal.getText().toString());

                double respuesta = 1;

                respuesta = (num2 * num1) / 100;

                tempVal = findViewById(R.id.lblrespuesta);
                tempVal.setText("Respuesta: " + respuesta);
            }
        });

        final Button exponenciacion = findViewById(R.id.btnexpo);
        exponenciacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView tempVal = (TextView)findViewById(R.id.txtnum1);
                double num1 = Double.parseDouble(tempVal.getText().toString());

                tempVal = (TextView)findViewById(R.id.txtnum2);
                double  num2 = Double.parseDouble(tempVal.getText().toString());

                double respuesta = Math.pow(num1 , num2);

                tempVal = findViewById(R.id.lblrespuesta);
                tempVal.setText("Respuesta: " + respuesta);

            }
        });

        final Button raizCuadrada = findViewById(R.id.btnra2);
        raizCuadrada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tempVal = (TextView)findViewById(R.id.txtnum1);
                double  num1 = Double.parseDouble(tempVal.getText().toString());

                double respuesta = Math.sqrt(num1);

                tempVal = findViewById(R.id.lblrespuesta);
                tempVal.setText("Respuesta: " + respuesta);

            }
        });

        final Button raizCubica = findViewById(R.id.btnraiz3);
        raizCubica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tempVal = (TextView)findViewById(R.id.txtnum1);
                double num1 = Double.parseDouble(tempVal.getText().toString());

                double respuesta = Math.cbrt(num1);

                tempVal = findViewById(R.id.lblrespuesta);
                tempVal.setText("Respuesta: " + respuesta);

            }
        });

        final Button raizN = findViewById(R.id.btnraizn);
        raizN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tempVal = (TextView)findViewById(R.id.txtnum1);
                double num1 = Double.parseDouble(tempVal.getText().toString());

                tempVal = (TextView)findViewById(R.id.txtnum2);
                double num2 = Double.parseDouble(tempVal.getText().toString());

                double respuesta = 1;

                respuesta = (float) Math.pow(num1, 1 / num2);


                tempVal = findViewById(R.id.lblrespuesta);
                tempVal.setText("Respuesta: " + respuesta);


            }

        });

        final Button modulo = findViewById(R.id.btnmod);
        modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tempVal = (TextView)findViewById(R.id.txtnum1);
                double num1 = Double.parseDouble(tempVal.getText().toString());

                tempVal = (TextView)findViewById(R.id.txtnum2);
                double num2 = Double.parseDouble(tempVal.getText().toString());

                double respuesta = num1 % num2;

                tempVal = findViewById(R.id.lblrespuesta);
                tempVal.setText("Respuesta: " + respuesta);


            }
        });

        final Button mayormenor = findViewById(R.id.btnmaymen);
        mayormenor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tempVal = (TextView)findViewById(R.id.txtnum1);
                double num1 = Double.parseDouble(tempVal.getText().toString());

                tempVal = (TextView)findViewById(R.id.txtnum2);
                double num2 = Double.parseDouble(tempVal.getText().toString());

                tempVal = findViewById(R.id.lblrespuesta);
                if (num1 < num2){
                    tempVal.setText("El numero mayor es: " + num2);
                }else {
                    tempVal.setText("El numero mayor es: " + num1);
                }
            }
        });

        

    }


}