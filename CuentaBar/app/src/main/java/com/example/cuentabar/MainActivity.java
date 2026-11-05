package com.example.cuentabar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText totalCuenta;
    private CheckBox propinaSi;
    private SeekBar porcentajePropina;
    private TextView valorPropina;
    private RadioButton efectivo;
    private RadioButton tarjeta;
    private RatingBar calificacion;
    private Button calcular;
    private TextView resultado;
    private double resultadoFinal;
    private TextView resultadoTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        totalCuenta = findViewById(R.id.totalCuenta);
        propinaSi = findViewById(R.id.propinaSi);
        porcentajePropina = findViewById(R.id.porcentajePropina);
        valorPropina = findViewById(R.id.valorPropina);

        efectivo = findViewById(R.id.efectivo);
        tarjeta = findViewById(R.id.tarjeta);
        calificacion = findViewById(R.id.calificacion);
        calcular = findViewById(R.id.calcular);
        resultado = findViewById(R.id.resultado);
        resultadoTexto = findViewById(R.id.resultadoTexto);
    }

    public void onStart(){
        super.onStart();



        porcentajePropina.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                valorPropina.setText(progress + " %");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        });


        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textoCuenta = totalCuenta.getText().toString().trim();

                if(!textoCuenta.isEmpty()) {
                    if (propinaSi.isChecked()) {
                        double valorCuenta;
                        valorCuenta = Double.parseDouble(textoCuenta.replace(",", "."));

                        double porcentaje = porcentajePropina.getProgress();

                        double resultadoCalculado;
                        resultadoCalculado = valorCuenta + ((valorCuenta * porcentaje) / 100);

                        resultadoFinal = resultadoCalculado;

                        resultado.setText(String.format("%.2f", resultadoFinal));

                    } else {

                        resultado.setText(totalCuenta.getText());

                    }

                    String metodoPago = "";


                    String estrellas = String.valueOf(calificacion.getRating());

                    if (calificacion.getRating() > 0) {


                        if (efectivo.isChecked()) {
                            metodoPago = getString(R.string.pago_efectivo);
                        } else if (tarjeta.isChecked()) {
                            metodoPago = getString(R.string.pago_tarjeta);
                        }

                        resultadoTexto.setText(getString(R.string.texto_calificacion) + estrellas + getString(R.string.texto_y_paga) + metodoPago);
                        resultadoTexto.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.white));
                    } else {

                        if (efectivo.isChecked()) {
                            metodoPago = getString(R.string.pago_efectivo);
                        } else if (tarjeta.isChecked()) {
                            metodoPago = getString(R.string.pago_tarjeta);
                        }else{
                            metodoPago = getString(R.string.pago_no_seleccionado);
                        }

                        resultadoTexto.setText(getString(R.string.texto_no_califica) + metodoPago);
                        resultadoTexto.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.mi_color_Error));
                    }
                }else {
                    resultadoTexto.setText(getString(R.string.error_cuenta));
                    resultadoTexto.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.mi_color_Error));
                }
            }
        });


    }
}