package com.app.android.mensajero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class RecibirMensajeActivity extends AppCompatActivity {
    public static final String MSJ_EXTRA = "mensaje";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_mensaje);

        Intent intento = getIntent();
        String msj = intento.getStringExtra(MSJ_EXTRA);
        TextView msjView = findViewById(R.id.txtRecibirMensaje);
        msjView.setText(msj);
    }
}