package cafeteria.com.app.android.cafe;

import android.widget.ArrayAdapter;
import android.app.ListActivity;
import android.widget.ListView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategoriaBebidaActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_bebida);
        ListView listaBebidas = getListView();
        ArrayAdapter<Bebida> adaptador = new ArrayAdapter<Bebida>
                (this, android.R.layout.simple_list_item_1, Bebida.bebidas);
        listaBebidas.setAdapter(adaptador);
    }

    @Override
    public void onListItemClick(ListView lista, View elemento, int posicion, long id) {
        Intent intento = new Intent(CategoriaBebidaActivity.this, BebidaActivity.class);
        intento.putExtra(BebidaActivity.EXTRA_BEBIDA, (int) id);
        startActivity(intento);
    }
}