package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView textCalculadora;
    private Button boton1;
    private Button boton2;
    private Button boton3;
    private Button botonDividir;
    private Button boton4;
    private Button boton5;
    private Button boton6;
    private Button botonMultiplicar;
    private Button boton7;
    private Button boton8;
    private Button boton9;
    private Button botonRestar;
    private Button boton0;
    private Button botonPunto;
    private Button botonIgual;
    private Button botonSumar;
    private Button botonC;
    private Button botonAC;
    private boolean banderaIgual;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


            textCalculadora = findViewById(R.id.textCalculadora);
            boton1 = findViewById(R.id.boton1);
            boton2 = findViewById(R.id.boton2);
            boton3 = findViewById(R.id.boton3);
            botonDividir = findViewById(R.id.botonDividir);
            boton4 = findViewById(R.id.boton4);
            boton5 = findViewById(R.id.boton5);
            boton6 = findViewById(R.id.boton6);
            botonMultiplicar = findViewById(R.id.botonMultiplicar);
            boton7 = findViewById(R.id.boton7);
            boton8 = findViewById(R.id.boton8);
            boton9 = findViewById(R.id.boton9);
            botonRestar = findViewById(R.id.botonRestar);
            boton0 = findViewById(R.id.boton0);
            botonPunto = findViewById(R.id.botonPunto);
            botonIgual = findViewById(R.id.botonIgual);
            botonSumar = findViewById(R.id.botonSumar);
            botonC = findViewById(R.id.botonC);
            botonAC = findViewById(R.id.botonAC);
            banderaIgual = false;
    }

    public void onStart(){
        super.onStart();


        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoActual = textCalculadora.getText().toString();

                if(banderaIgual == true ) {

                    textCalculadora.setText("1");

                    banderaIgual = false;

                }else{

                    if(textoActual.equals("0")) {

                        textCalculadora.setText("1");

                    }else if (textoActual.endsWith("+0") || textoActual.endsWith("-0") || textoActual.endsWith("*0") || textoActual.endsWith("/0")) {

                        textCalculadora.setText(textoActual + ",1");

                    } else {

                        textCalculadora.setText(textoActual + "1");
                    }
                }
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoActual = textCalculadora.getText().toString();

                if(banderaIgual == true ) {

                    textCalculadora.setText("2");

                    banderaIgual = false;
                }else{

                    if(textoActual.equals("0")) {

                        textCalculadora.setText("2");

                    }else if (textoActual.endsWith("+0") || textoActual.endsWith("-0") || textoActual.endsWith("*0") || textoActual.endsWith("/0")) {

                        textCalculadora.setText(textoActual + ",2");

                    } else {

                        textCalculadora.setText(textoActual + "2");
                    }

                }
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoActual = textCalculadora.getText().toString();

                if(banderaIgual == true ) {

                    textCalculadora.setText("3");

                    banderaIgual = false;
                }else{

                    if(textoActual.equals("0")) {

                        textCalculadora.setText("3");

                    }else if (textoActual.endsWith("+0") || textoActual.endsWith("-0") || textoActual.endsWith("*0") || textoActual.endsWith("/0")) {

                        textCalculadora.setText(textoActual + ",3");

                    }else {

                        textCalculadora.setText(textoActual + "3");
                    }
                }
            }
        });

        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoActual = textCalculadora.getText().toString();

                if(banderaIgual == true ) {

                    textCalculadora.setText("4");

                    banderaIgual = false;
                }else {

                    if(textoActual.equals("0")) {

                        textCalculadora.setText("4");

                    }else if (textoActual.endsWith("+0") || textoActual.endsWith("-0") || textoActual.endsWith("*0") || textoActual.endsWith("/0")) {

                        textCalculadora.setText(textoActual + ",4");

                    } else {

                        textCalculadora.setText(textoActual + "4");
                    }
                }
            }
        });

        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoActual = textCalculadora.getText().toString();

                if(banderaIgual == true ) {

                    textCalculadora.setText("5");

                    banderaIgual = false;
                }else {

                    if(textoActual.equals("0")) {

                        textCalculadora.setText("5");

                    }else if (textoActual.endsWith("+0") || textoActual.endsWith("-0") || textoActual.endsWith("*0") || textoActual.endsWith("/0")) {

                        textCalculadora.setText(textoActual + ",5");

                    } else {

                        textCalculadora.setText(textoActual + "5");
                    }
                }
            }
        });

        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoActual = textCalculadora.getText().toString();

                if(banderaIgual == true ) {

                    textCalculadora.setText("6");

                    banderaIgual = false;
                }else {

                    if(textoActual.equals("0")) {

                        textCalculadora.setText("6");

                    }else if (textoActual.endsWith("+0") || textoActual.endsWith("-0") || textoActual.endsWith("*0") || textoActual.endsWith("/0")) {

                        textCalculadora.setText(textoActual + ",6");

                    } else {

                        textCalculadora.setText(textoActual + "6");
                    }
                }
            }
        });

        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoActual = textCalculadora.getText().toString();

                if(banderaIgual == true ) {

                    textCalculadora.setText("7");

                    banderaIgual = false;
                }else {

                    if(textoActual.equals("0")) {

                        textCalculadora.setText("7");

                    }else if (textoActual.endsWith("+0") || textoActual.endsWith("-0") || textoActual.endsWith("*0") || textoActual.endsWith("/0")) {

                        textCalculadora.setText(textoActual + ",7");

                    } else {

                        textCalculadora.setText(textoActual + "7");
                    }
                }
            }
        });

        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoActual = textCalculadora.getText().toString();

                if(banderaIgual == true ) {

                    textCalculadora.setText("8");

                    banderaIgual = false;
                }else {

                    if(textoActual.equals("0")) {

                        textCalculadora.setText("8");

                    }else if (textoActual.endsWith("+0") || textoActual.endsWith("-0") || textoActual.endsWith("*0") || textoActual.endsWith("/0")) {

                        textCalculadora.setText(textoActual + ",8");

                    } else {

                        textCalculadora.setText(textoActual + "8");
                    }
                }
            }
        });

        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoActual = textCalculadora.getText().toString();

                if(banderaIgual == true ) {

                    textCalculadora.setText("9");

                    banderaIgual = false;
                }else {

                    if(textoActual.equals("0")) {

                        textCalculadora.setText("9");

                    }else if (textoActual.endsWith("+0") || textoActual.endsWith("-0") || textoActual.endsWith("*0") || textoActual.endsWith("/0")) {

                        textCalculadora.setText(textoActual + ",9");

                    } else {

                        textCalculadora.setText(textoActual + "9");
                    }
                }
            }
        });

        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoActual = textCalculadora.getText().toString();

                if(banderaIgual == true ) {

                    textCalculadora.setText("0,");
                    banderaIgual = false;

                }else {

                    if (textoActual.endsWith("+0") || textoActual.endsWith("-0") || textoActual.endsWith("*0") || textoActual.endsWith("/0")) {

                        textCalculadora.setText(textoActual + ",");

                    } else {

                        if(textCalculadora.getText().toString().equals("0")) {

                            textCalculadora.setText("0,");

                        }else {

                            textCalculadora.setText(textoActual + "0");
                        }
                    }
                }
            }
        });

        botonPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoActual = textCalculadora.getText().toString();

                if(banderaIgual){

                    textCalculadora.setText("0,");
                    banderaIgual = false;
                    return;
                }

                else if(textoActual.equals("0")) {

                    textCalculadora.setText("0,");
                    return;
                }

                 for (int i = textoActual.length()-1; i >= 0; i--){

                     char caracter = textoActual.charAt(i);


                    if(caracter == ',') {
                        return;
                    }

                    if (caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/') {

                        if( i == textoActual.length() -1){

                            textCalculadora.setText(textoActual + "0,");
                        }else {

                            textCalculadora.setText(textoActual + ",");
                        }
                        return;
                    }
                 }
                textCalculadora.setText(textoActual + ",");
            }
        });


        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoActual = textCalculadora.getText().toString();

                banderaIgual = false;

                if(textoActual.endsWith("+") || textoActual.endsWith("-") || textoActual.endsWith("*") || textoActual.endsWith("/")){

                    String textoSimbolo = textoActual.substring(0, textoActual.length() -1);
                    textCalculadora.setText(textoSimbolo + "/");

                }else{

                    textCalculadora.setText(textoActual + "/");
                }


            }
        });

        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoActual = textCalculadora.getText().toString();

                banderaIgual = false;

                if(textoActual.endsWith("+") || textoActual.endsWith("-") || textoActual.endsWith("*") || textoActual.endsWith("/")){

                    String textoSimbolo = textoActual.substring(0, textoActual.length() -1);
                    textCalculadora.setText(textoSimbolo + "*");

                }else{

                    textCalculadora.setText(textoActual + "*");
                }
            }
        });

        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoActual = textCalculadora.getText().toString();

                banderaIgual = false;

                if(textoActual.endsWith("+") || textoActual.endsWith("-") || textoActual.endsWith("*") || textoActual.endsWith("/")){

                    String textoSimbolo = textoActual.substring(0, textoActual.length() -1);
                    textCalculadora.setText(textoSimbolo + "-");

                }else{

                    textCalculadora.setText(textoActual + "-");
                }
            }
        });

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoActual = textCalculadora.getText().toString();

                banderaIgual = false;

                if(textoActual.endsWith("+") || textoActual.endsWith("-") || textoActual.endsWith("*") || textoActual.endsWith("/")){

                    String textoSimbolo = textoActual.substring(0, textoActual.length() -1);
                    textCalculadora.setText(textoSimbolo + "+");

                }else{

                    textCalculadora.setText(textoActual + "+");
                }
            }
        });

        botonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textCalculadora.setText("0");
                banderaIgual = false;
            }
        });

        botonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoActual = textCalculadora.getText().toString();

                String textoBorrar = textoActual.substring(0, textoActual.length() -1);

                textCalculadora.setText(textoBorrar);

                if(textCalculadora.getText().toString().equals("")){

                    textCalculadora.setText("0");
                }

                banderaIgual = false;
            }
        });

        botonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String operacion = textCalculadora.getText().toString();

                if(operacion.endsWith("/0") || operacion.endsWith("/0,0") || operacion.endsWith("/0,00")){

                    textCalculadora.setText("Error de division");
                    banderaIgual = true;
                    return;
                }

                if(operacion.endsWith("+") || operacion.endsWith("-") || operacion.endsWith("*") || operacion.endsWith("/")){

                    operacion = operacion.substring(0, operacion.length() -1);
                }

                String[] numeros = operacion.split("\\+|\\-|\\*|\\/");


                List<Double> numero = new ArrayList<>();

                for(int i = 0; i < numeros.length; i++){

                    numero.add(Double.parseDouble(numeros[i].replace(",", ".")));
                }

                List<Character> listaSimbolos = new ArrayList<>();


                for(int i = 0; i <operacion.length(); i++){

                    char letra = operacion.charAt(i);

                    if(letra == '+' || letra == '-' || letra == '*' || letra == '/'){

                        listaSimbolos.add(letra);
                    }
                }
                double resultado = numero.get(0);
                for(int i = 0; i < listaSimbolos.size(); i++ ){

                    if (listaSimbolos.get(i) == '+' ){

                        resultado = resultado + numero.get(i+1);

                    }else if(listaSimbolos.get(i) == '-' ){

                        resultado = resultado - numero.get(i+1);

                    }else if(listaSimbolos.get(i) == '*' ){

                        resultado = resultado * numero.get(i+1);

                    }else if(listaSimbolos.get(i) == '/' ){

                        resultado = resultado / numero.get(i+1);
                    }
                }
                String resultadoTxt = String.valueOf(resultado);

                resultadoTxt = resultadoTxt.replace(".", ",");

                if(resultadoTxt.endsWith(",0")){

                    resultadoTxt = resultadoTxt.substring(0, resultadoTxt.length() -2);
                }

                textCalculadora.setText(resultadoTxt);

                banderaIgual = true;
            }
        });

    }
}