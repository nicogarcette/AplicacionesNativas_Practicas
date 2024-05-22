package com.example.quetalfuetudiaa;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MensajeActivity extends AppCompatActivity {
    TextView txt_mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);
        int option;

        txt_mensaje = (TextView)findViewById(R.id.tex_mensaje);

        Bundle bundle = getIntent().getExtras();
        option = bundle.getInt("option");

        actualizarMensaje(option);
    }

    private void actualizarMensaje(int option){

        switch (option){
            case 0 :
                txt_mensaje.setText(R.string.mensaje1);
                break;
            case 1 :
                txt_mensaje.setText(R.string.mensaje2);
                break;
            case 2 :
                txt_mensaje.setText(R.string.mensaje3);
                break;
            case 3 :
                txt_mensaje.setText(R.string.mensaje4);
                break;
        }
    }
}