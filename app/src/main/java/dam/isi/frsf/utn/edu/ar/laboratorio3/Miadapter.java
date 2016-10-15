package dam.isi.frsf.utn.edu.ar.laboratorio3;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sonia on 13/10/2016.
 */
public class Miadapter extends BaseAdapter {
    Trabajo[] trabajos;
    Context context;
    LayoutInflater layoutInflater;

    public Miadapter(Trabajo[] trabajos, Context context) {
        super();
        this.trabajos = trabajos;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return trabajos.length;
    }

    @Override
    public Object getItem(int i) {
        return trabajos[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView= layoutInflater.inflate(R.layout.row, null);
convertView.setClickable(true);
        convertView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(context,
                        "Clicked on Row: " + ((TextView)view.findViewById(R.id.descripcion)).getText(),
                        Toast.LENGTH_LONG).show();


                //Asociamos los menús contextuales a los controles

                return true;
            }
        });
        TextView txt=(TextView)convertView.findViewById(R.id.descripcion);

        txt.setText((CharSequence) trabajos[position].getDescripcion());
        TextView txt2=(TextView)convertView.findViewById(R.id.fechahora);
        txt2.setText(trabajos[position].getHorasPresupuestadas().toString()+trabajos[position].getFechaEntrega().toString());
        CheckBox cb =(CheckBox) convertView.findViewById(R.id.checkBox);
        cb.setChecked(trabajos[position].getRequiereIngles());
       cb.setClickable(false);

        return convertView;


    }
   /* public AlertDialog createSimpleDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder();

        builder.setTitle("Titulo")
                .setMessage("El Mensaje para el usuario")
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                listener.onPossitiveButtonClick();
                            }
                        })
                .setNegativeButton("CANCELAR",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                listener.onNegativeButtonClick();
                            }
                        });

        return builder.create();
    }
*/

    public void OnItemClickListener(){

    }
}