package cafeteria.com.app.android.cafe;

import android.support.annotation.NonNull;

public class Bebida {
    private String nombre;
    private String descripcion;
    private int idImagen;

    private Bebida(String nombre, String descripcion, int idImagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idImagen = idImagen;
    }

    static final Bebida[] bebidas =
            {
                    new Bebida("Café Late", "Leche, cafe pasado en agua", R.drawable.late),
                    new Bebida("Coca Cola 150cc", "Vaso de coca cola de 150cc", R.drawable.cocacola),
                    new Bebida("Chocolate Expreso", "Leche con chocolate y un toque de menta", R.drawable.chocolate)
            };

    String obtenerDescripcion() {
        return descripcion;
    }

    int obtenerIdImagen() {
        return idImagen;
    }

    String obtenerNombre() {
        return nombre;
    }

    @NonNull
    public String toString() {
        return this.nombre;
    }
}