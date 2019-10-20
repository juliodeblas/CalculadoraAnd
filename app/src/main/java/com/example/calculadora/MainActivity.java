package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    double op1 = 0.0, op2 = 0.0, resultado = 0.0;
    int tipoOperacion = 0;
    EditText pantalla;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, punto, suma, resta, igual, multiplicacion, division, bc;
    Button bsen, bcos, btan, blog, bln;
    double grados;
    String cap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
        if (getApplication().getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            accionesHorizontal();
        }
    }

    public void instancias() {
        pantalla = (EditText) findViewById(R.id.pantalla);
        b0 = this.findViewById(R.id.boton0);
        b1 = this.findViewById(R.id.boton1);
        b2 = this.findViewById(R.id.boton2);
        b3 = this.findViewById(R.id.boton3);
        b4 = this.findViewById(R.id.boton4);
        b5 = this.findViewById(R.id.boton5);
        b6 = this.findViewById(R.id.boton6);
        b7 = this.findViewById(R.id.boton7);
        b8 = this.findViewById(R.id.boton8);
        b9 = this.findViewById(R.id.boton9);
        punto = this.findViewById(R.id.botonPunto);
        suma = this.findViewById(R.id.botonSuma);
        resta = this.findViewById(R.id.botonResta);
        igual = this.findViewById(R.id.botonIgual);
        multiplicacion = this.findViewById(R.id.botonMultiplicacion);
        division = this.findViewById(R.id.botonDivision);
        bc = this.findViewById(R.id.botonC);
        bsen = this.findViewById(R.id.botonSen);
        bcos = this.findViewById(R.id.botonCos);
        btan = this.findViewById(R.id.botonTan);
        blog = this.findViewById(R.id.botonLog);
        bln = this.findViewById(R.id.botonLn);
    }

    public void acciones() {
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multiplicacion.setOnClickListener(this);
        division.setOnClickListener(this);
        igual.setOnClickListener(this);
        punto.setOnClickListener(this);
        bc.setOnClickListener(this);
    }

    private void accionesHorizontal() {
        bsen.setOnClickListener(this);
        bcos.setOnClickListener(this);
        btan.setOnClickListener(this);
        blog.setOnClickListener(this);
        bln.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.boton0:
                cap = pantalla.getText().toString();
                cap += "0";
                pantalla.setText(cap);
                break;
            case R.id.boton1:
                cap = pantalla.getText().toString();
                cap += "1";
                pantalla.setText(cap);
                break;
            case R.id.boton2:
                cap = pantalla.getText().toString();
                cap += "2";
                pantalla.setText(cap);
                break;
            case R.id.boton3:
                cap = pantalla.getText().toString();
                cap += "3";
                pantalla.setText(cap);
                break;
            case R.id.boton4:
                cap = pantalla.getText().toString();
                cap += "4";
                pantalla.setText(cap);
                break;
            case R.id.boton5:
                cap = pantalla.getText().toString();
                cap += "5";
                pantalla.setText(cap);
                break;
            case R.id.boton6:
                String cap = pantalla.getText().toString();
                cap += "6";
                pantalla.setText(cap);
                break;
            case R.id.boton7:
                cap = pantalla.getText().toString();
                cap += "7";
                pantalla.setText(cap);
                break;
            case R.id.boton8:
                cap = pantalla.getText().toString();
                cap += "8";
                pantalla.setText(cap);
                break;
            case R.id.boton9:
                cap = pantalla.getText().toString();
                cap += "9";
                pantalla.setText(cap);
                break;
            case R.id.botonSuma:
                try {
                    op1 = Double.valueOf(pantalla.getText().toString());
                } catch (NumberFormatException e) {
                }
                pantalla.setText("");
                tipoOperacion = 1;
                punto.setEnabled(true);
                break;
            case R.id.botonResta:
                try {
                    op1 = Double.valueOf(pantalla.getText().toString());
                } catch (NumberFormatException e) {
                }
                pantalla.setText("");
                tipoOperacion = 2;
                punto.setEnabled(true);
                break;
            case R.id.botonMultiplicacion:
                try {
                    op1 = Double.valueOf(pantalla.getText().toString());
                } catch (NumberFormatException e) {
                }
                pantalla.setText("");
                tipoOperacion = 3;
                punto.setEnabled(true);
                break;
            case R.id.botonDivision:
                try {
                    op1 = Double.valueOf(pantalla.getText().toString());
                } catch (NumberFormatException e) {
                }
                pantalla.setText("");
                tipoOperacion = 4;
                punto.setEnabled(true);
                break;
            case R.id.botonSen:
                try {
                    op1 = Double.valueOf(pantalla.getText().toString());
                } catch (NumberFormatException e) {
                }
                pantalla.setText("sin(" + op1 + ")");
                tipoOperacion = 5;
                punto.setEnabled(true);
                break;
            case R.id.botonCos:
                try {
                    op1 = Double.valueOf(pantalla.getText().toString());
                } catch (NumberFormatException e) {
                }
                pantalla.setText("cos(" + op1 + ")");
                tipoOperacion = 6;
                punto.setEnabled(true);
                break;
            case R.id.botonTan:
                try {
                    op1 = Double.valueOf(pantalla.getText().toString());
                } catch (NumberFormatException e) {
                }
                pantalla.setText("tan(" + op1 + ")");
                tipoOperacion = 7;
                punto.setEnabled(true);
                break;
            case R.id.botonLog:
                try {
                    op1 = Double.valueOf(pantalla.getText().toString());
                } catch (NumberFormatException e) {
                }
                pantalla.setText("log(" + op1 + ")");
                tipoOperacion = 8;
                punto.setEnabled(true);
                break;
            case R.id.botonLn:
                try {
                    op1 = Double.valueOf(pantalla.getText().toString());
                } catch (NumberFormatException e) {
                }
                pantalla.setText("ln(" + op1 + ")");
                tipoOperacion = 9;
                punto.setEnabled(true);
                break;
            case R.id.botonIgual:
                try {
                    op2 = Double.valueOf(pantalla.getText().toString());
                } catch (NumberFormatException e) {
                }
                pantalla.setText("");

                switch (tipoOperacion) {
                    case 1:
                        resultado = op1 + op2;
                        break;
                    case 2:
                        resultado = op1 - op2;
                        break;
                    case 3:
                        resultado = op1 * op2;
                        break;
                    case 4:
                        resultado = op1 / op2;
                        break;
                    case 5:
                        grados = Math.toRadians(op1);
                        resultado = Math.sin(op1);
                        break;
                    case 6:
                        grados = Math.toRadians(op1);
                        resultado = Math.cos(op1);
                        break;
                    case 7:
                        grados = Math.toRadians(op1);
                        resultado = Math.tan(op1);
                        break;
                    case 8:
                        resultado = Math.log10(op1);
                        break;
                    case 9:
                        resultado = Math.log(op1);
                        break;
                }
                pantalla.setText("" + resultado);
                op1 = resultado;
                punto.setEnabled(false);
                break;
            case R.id.botonC:
                pantalla.setText("");
                op1 = 0;
                op2 = 0;
                resultado = 0;
                punto.setEnabled(true);
                break;
            case R.id.botonPunto:
                if (!pantalla.getText().equals("")) {
                    cap = pantalla.getText().toString();
                    cap += ".";
                    pantalla.setText(cap);
                } else {
                    pantalla.setText("0.");
                }
                punto.setEnabled(false);
                break;
        }
    }
}
