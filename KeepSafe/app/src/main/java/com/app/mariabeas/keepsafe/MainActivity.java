package com.app.mariabeas.keepsafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView logo;
    EditText edtUser;
    EditText edtPassword;
    CheckBox box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ELEMENTOS DE LA INTERFAZ
        Button btnInicio=(Button)findViewById(R.id.btnInicio);
        box=(CheckBox)findViewById(R.id.checkBox);
        edtUser=(EditText)findViewById(R.id.edtUser);
        edtPassword=(EditText)findViewById(R.id.edtPassword);
        logo=(ImageView)findViewById(R.id.logo);

        MiListener listener=new MiListener();
        btnInicio.setOnClickListener(listener);


    }


    private class MiListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            String usuario=((EditText)findViewById(R.id.edtUser)).getText().toString();
           // String password=((EditText)findViewById(R.id.edtPassword).)
           /* if(usuario.equals("admin")){
                Intent nuevoIntent=new Intent(MainActivity.this,MenuActivity.class);
                startActivity(nuevoIntent);

            }else{
                Toast.makeText(getApplicationContext(), "Usuario incorrecto", Toast.LENGTH_SHORT).show();
            }*/
            if(v.getId()==R.id.btnInicio) {
                //PARA PASAR DE UNA PANTALLA A OTRA
                Intent intentactivity = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intentactivity);
            }


            }
    }
}
