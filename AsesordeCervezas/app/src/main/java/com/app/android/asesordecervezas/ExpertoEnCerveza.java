package com.app.android.asesordecervezas;

import java.util.ArrayList;
import java.util.List;

public class ExpertoEnCerveza
{
    List<String> obtenerTipos(String color)
    {
        List<String> tipos = new ArrayList<String>();
        if(color.equals("Rubia"))
        {
            tipos.add("Pilserner");
            tipos.add("Corona");
        }
        else
        {
            tipos.add("Dorada");
            tipos.add("Rojiza Fuerte");
        }
        return tipos;
    }
}