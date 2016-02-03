package com.app.mariabeas.keepsafe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Maria on 03/02/2016.
 */
public class InformacionActivity extends AppCompatActivity {
    ImageView logo;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informacion);
        logo=(ImageView)findViewById(R.id.logo);
        TextView info=(TextView)(findViewById(R.id.txtInfo));
    }
}
