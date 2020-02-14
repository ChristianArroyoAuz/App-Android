package cafeteria.com.app.android.cafe;

import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.ListView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NivelSuperiorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel_superior);
        AdapterView.OnItemClickListener escuchaPorEventoClic = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> lista,
                                    View elemento,
                                    int posicion,
                                    long id) {
                if (posicion == 0) {
                    Intent intento = new Intent();
                    startActivity(intento);
                }
            }
        };
        ListView lista = findViewById(R.id.opciones);
        lista.setOnItemClickListener(escuchaPorEventoClic);
    }
}
