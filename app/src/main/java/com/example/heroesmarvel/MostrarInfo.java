package com.example.heroesmarvel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class MostrarInfo extends AppCompatActivity {

    TextView nombre, poder,estrellas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_info);

        nombre = (TextView) findViewById(R.id.txtvalornombre);
        poder = (TextView)  findViewById(R.id.txtvalorpoder);
        estrellas = (TextView) findViewById(R.id.txtvalorestrellas);

        //recuperando valores desde el bundle
        Bundle objEnviado = getIntent().getExtras();
        Heroe heroe2 = null;

       if(objEnviado!=null){
            heroe2 = (Heroe) objEnviado.getSerializable("objetoheroe");

            //mostrar valores
            nombre.setText(heroe2.getNombre());
            poder.setText(heroe2.getPoder());
            estrellas.setText(heroe2.getCantEstrellas()+"");
        }
    }
}