package com.example.quetalfuetudiaa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity  extends Activity {

    private Button btn_enviar;
    private RadioGroup rg_respuestas;

    @Override
    protected  void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_enviar = (Button)findViewById(R.id.btn_enviar);
        rg_respuestas = (RadioGroup)findViewById(R.id.rg_respuestas);

        btn_enviar.setOnClickListener(enviarListener);

    }

    private View.OnClickListener enviarListener = new View.OnClickListener(){

        @Override
        public void onClick(View view){

            int radioButtonID = rg_respuestas.getCheckedRadioButtonId();
            View radioButton = rg_respuestas.findViewById(radioButtonID);

            int idx = rg_respuestas.indexOfChild(radioButton);

            Intent intent = new Intent(MainActivity.this,MensajeActivity.class);
            Bundle b = new Bundle();
            b.putInt("option",idx);
            intent.putExtras(b);

            startActivity(intent);
        }

    };

}
