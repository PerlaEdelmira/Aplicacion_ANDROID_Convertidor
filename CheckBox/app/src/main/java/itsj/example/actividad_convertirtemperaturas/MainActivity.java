package itsj.example.actividad_convertirtemperaturas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText caja_numeros, caja_Resultado;
    RadioButton radioC, radioF, radioR, radioK;
    CheckBox chk_c, chk_f, chk_r, chk_k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caja_numeros = findViewById(R.id.lbl_caja_numeros);
        caja_Resultado = findViewById(R.id.lbl_resultado_c);

        radioC = findViewById(R.id.rbtt_c);
        radioF = findViewById(R.id.rbtt_f);
        radioK = findViewById(R.id.rbtt_k);
        radioR = findViewById(R.id.rbtt_r);

        chk_c = findViewById(R.id.chk_c);
        chk_f = findViewById(R.id.chk_f);
        chk_k = findViewById(R.id.chk_k);
        chk_r = findViewById(R.id.chk_r);
    }

    public void procesar(View v) {
        if (radioR.isChecked()) {
            Toast.makeText(getApplicationContext(), "Cantidad en Grados Centigrados",
                    Toast.LENGTH_LONG).show();
        }
        if (radioF.isChecked()) {
            Toast.makeText(getApplicationContext(), "Cantidad en Grados Farehei",
                    Toast.LENGTH_LONG).show();
        }
        if (radioR.isChecked()) {
            Toast.makeText(getApplicationContext(), "Cantidad en Grados Raike",
                    Toast.LENGTH_LONG).show();
        }
        if (radioK.isChecked()) {
            Toast.makeText(getApplicationContext(), "Cantidad en Grados Kelvin",
                    Toast.LENGTH_LONG).show();
        }
    }
}
