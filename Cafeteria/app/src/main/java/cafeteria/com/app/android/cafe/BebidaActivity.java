package cafeteria.com.app.android.cafe;

import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

public class BebidaActivity extends AppCompatActivity {
    public static final String EXTRA_BEBIDA = "bebidaNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebida);
        int tipoBebida = (Integer) getIntent().getExtras().get(EXTRA_BEBIDA);
        Bebida bebida = Bebida.bebidas[tipoBebida];
        ImageView foto = findViewById(R.id.foto);
        foto.setImageResource(bebida.obtenerIdImagen());
        foto.setContentDescription(bebida.obtenerNombre());
        TextView nombre = findViewById(R.id.nombre);
        nombre.setText(bebida.obtenerNombre());
        TextView descripcion = findViewById(R.id.descripcion);
        descripcion.setText(bebida.obtenerDescripcion());
    }
}