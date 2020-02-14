package com.app.android.asesordecervezas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class Encontrar_Cerveza_Activity extends AppCompatActivity
{
    private ExpertoEnCerveza experto = new ExpertoEnCerveza();

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encontrar__cerveza);
    }

    public void onClickEncontarCerveza(View view)
    {
        TextView tipos = findViewById(R.id.etiqueta_EncontrarCerveza);
        Spinner color = findViewById(R.id.spinner_ColorCervezas);
        String tipoCerveza = String.valueOf(color.getSelectedItem());
        //tipos.setText(tipoCerveza);
        List<String> listaCervezas = experto.obtenerTipos(tipoCerveza);
        StringBuilder tipoConFormato = new StringBuilder();
        for (String tipo : listaCervezas)
        {
            tipoConFormato.append(tipo).append('\n');
        }
        tipos.setText(tipoConFormato);
    }
}