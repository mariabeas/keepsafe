package com.app.mariabeas.keepsafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by Maria on 02/02/2016.
 */
public class RegistroActivity extends AppCompatActivity {
    ImageView logo;
    ImageView avatar;
    EditText edtUsuario;
    EditText edtPass;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        //ELEMENTOS DE LA INTERFAZ
        logo=(ImageView)findViewById(R.id.logo);
        avatar=(ImageView)findViewById(R.id.avatar);
        edtUsuario=(EditText)findViewById(R.id.edtUsuario);
        edtPass=(EditText)findViewById(R.id.edtPass);
        Button btnAceptar=(Button)findViewById(R.id.btnAceptar);

        MiListener listener=new MiListener();
        btnAceptar.setOnClickListener(listener);
    }
    //clase privada para implementar la funcionalidad de los botones de la activity
    private class MiListener implements View.OnClickListener{
        public void onClick(View v) {
            if(v.getId()==R.id.btnAgenda) {
                //PARA PASAR DE UNA PANTALLA A OTRA
                Intent intentactivity = new Intent(RegistroActivity.this, MenuActivity.class);
                startActivity(intentactivity);
            }

        }
    }
}
