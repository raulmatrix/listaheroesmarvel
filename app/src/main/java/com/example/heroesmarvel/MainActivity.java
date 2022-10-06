package com.example.heroesmarvel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nombHeroe,poderHeroe,cantEs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void crearHeroe(View v){
        /*relacion de los edittext para obtener valor*/
        nombHeroe = (EditText) findViewById(R.id.txtName);
        poderHeroe = (EditText) findViewById(R.id.txtPower);
        cantEs = (EditText) findViewById(R.id.txtStar);
        //conversion de valores para insertar en el objeto
        String nombre = nombHeroe.getText().toString();
        String poder = poderHeroe.getText().toString();
        int estrellas = Integer.parseInt(cantEs.getText().toString());

        Heroe heroe = new Heroe(nombre,poder,estrellas);

        Intent it = new Intent(getApplicationContext(),MostrarInfo.class);

        Bundle bun = new Bundle();
        bun.putSerializable("objetoheroe",heroe);

        it.putExtras(bun);
        startActivity(it);



    }

}