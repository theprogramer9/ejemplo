package Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.betzaira.ejemplo.R;

import java.util.ArrayList;

import com.example.betzaira.ejemplo.productosDTO;

public class AdapterItem_Producto extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<productosDTO> items;

    public AdapterItem_Producto(Activity activity, ArrayList<productosDTO> items) {
        this.activity = activity;
        this.items = items;
    }
    @Override
    public int getCount() {
        return items.size();
    }
    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.item_producto, null);
        }

        productosDTO dir = items.get(position);

        TextView title = (TextView) v.findViewById(R.id.cat_produto);
        title.setText(dir.getClave()+"");

        TextView description = (TextView) v.findViewById(R.id.txt_nombre);
        description.setText(dir.getNombre_producto());

        ImageView imagen = (ImageView) v.findViewById(R.id.imageView4);
        imagen.setImageDrawable(dir.getImagen());

        return v;
    }

}
