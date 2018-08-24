package com.raise_technology.proyecto2;

//Recursos externos que los creadores de android
//Nos dan para trabajar
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Se declaran los elementos XML con su homologo en java
    EditText txtNombre, txtNacimiento, txtPeso, txtAltura, txtSangre;
    CheckBox ckbAlergias, ckbDonador;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Codigo autogenerado por el sistema
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Despues de esta linea va nuestro propio codigo
        //Se enlazan los elementos java con xml
        txtNombre = findViewById(R.id.txtNombre);
        txtNacimiento = findViewById(R.id.txtNacimiento);
        txtPeso = findViewById(R.id.txtPeso);
        txtAltura = findViewById(R.id.txtAltura);
        txtSangre = findViewById(R.id.txtSangre);

        ckbAlergias = findViewById(R.id.ckbAlergias);
        ckbDonador = findViewById(R.id.ckbDonador);

        btnEnviar = findViewById(R.id.btnEnviar);

        txtNombre.setText("Thor Hijo de Odin");

    }//fin del onCreate
}
