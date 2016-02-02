package com.app.mariabeas.keepsafe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by Maria on 02/02/2016.
 */
public class DatosActivity extends AppCompatActivity {
    ImageView logo;
    ImageView avatar;
    EditText edtUser;
    EditText edtNombre;
    EditText edtApellido;
    EditText edtFecha;
    EditText edtSexo;
    EditText edtSangre;
    EditText edtNum;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datos);

        //ELEMENTOS DE LA INTERFAZ
        Button btnCambiar=(Button)findViewById(R.id.btnCambiar);
        Button btnFoto=(Button)findViewById(R.id.btnFoto);
        logo=(ImageView)findViewById(R.id.logo);
        avatar=(ImageView)findViewById(R.id.avatar);
        edtUser=(EditText)findViewById(R.id.edtUser);
        edtNombre=(EditText)findViewById(R.id.edtNombre);
        edtApellido=(EditText)findViewById(R.id.edtApellido);
        edtFecha=(EditText)findViewById(R.id.edtFecha);
        edtSexo=(EditText)findViewById(R.id.edtSexo);
        edtSangre=(EditText)findViewById(R.id.edtSangre);
        edtNum=(EditText)findViewById(R.id.edtNum);
    }
}
