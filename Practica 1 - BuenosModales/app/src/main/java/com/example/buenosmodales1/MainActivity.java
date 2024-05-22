package com.example.buenosmodales1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button btn_gracias;
    private Button btn_estornudar;

    @Override
    protected  void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_gracias = (Button)findViewById(R.id.gracias);
        btn_estornudar = (Button)findViewById(R.id.estornudar);

        btn_gracias.setOnClickListener(graciasListener);
        btn_estornudar.setOnClickListener(estornudarListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    private View.OnClickListener graciasListener = new View.OnClickListener(){

        @Override
        public void onClick(View view){
            Toast.makeText(MainActivity.this,"De nada!!",
                    Toast.LENGTH_LONG).show();
        }

    };

    private View.OnClickListener estornudarListener = new View.OnClickListener(){

        @Override
        public void onClick(View view){
            Toast.makeText(MainActivity.this,"Salud!!",
                    Toast.LENGTH_LONG).show();
        }

    };

}
