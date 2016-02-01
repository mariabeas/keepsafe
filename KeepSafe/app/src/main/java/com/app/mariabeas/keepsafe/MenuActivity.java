package com.app.mariabeas.keepsafe;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Maria on 01/02/2016.
 */
public class MenuActivity extends AppCompatActivity {


    ImageView logo;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        //ELEMENTOS DE LA INTERFAZ
        logo=(ImageView)findViewById(R.id.logo);
        Button btnDatos=(Button)findViewById(R.id.btnDatos);
        Button btnAgenda=(Button)findViewById(R.id.btnAgenda);
        Button btnSMS=(Button)findViewById(R.id.btnSMS);
        Button btnUbicacion=(Button)findViewById(R.id.btnUbicacion);
        Button btnInfo=(Button)findViewById(R.id.btnInfo);
    }

}
