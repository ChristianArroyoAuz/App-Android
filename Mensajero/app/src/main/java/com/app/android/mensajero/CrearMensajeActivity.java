package com.app.android.mensajero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class CrearMensajeActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_mensaje);
    }

    public void onEnviarMensaje(View view) {
        EditText msjView = findViewById(R.id.txtMensaje);
        String mensaje = msjView.getText().toString();
        //Intent intento = new Intent(this, RecibirMensajeActivity.class);
        //intento.putExtra(RecibirMensajeActivity.MSJ_EXTRA, mensaje);
        Intent intento = new Intent(Intent.ACTION_SEND);
        intento.setType("text/plain");
        intento.putExtra(Intent.EXTRA_TEXT, mensaje);
        startActivity(intento);
    }
}