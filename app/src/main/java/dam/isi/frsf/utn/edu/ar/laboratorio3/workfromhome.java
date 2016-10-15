package dam.isi.frsf.utn.edu.ar.laboratorio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;

public class workfromhome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workfromhome);
        Spinner sp = (Spinner) findViewById(R.id.spinner);
        Categoria[] catego=Categoria.CATEGORIAS_MOCK;

        //Creamos la lista
        ArrayList lista= new ArrayList();
        for (int i=0;i<catego.length;i++){
            lista.add(catego[i].getDescripcion());
        }

        ArrayAdapter spinner_adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, lista);
        sp.setAdapter(spinner_adapter);
        Button agregar=(Button) findViewById(R.id.bguardar);
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner sp = (Spinner) findViewById(R.id.spinner);
                RadioGroup rg = (RadioGroup) findViewById(R.id.radiogr);

                 if( rg.getCheckedRadioButtonId()==-1 ){
                     Toast.makeText(getApplicationContext(), "debe elegir una opcion",Toast.LENGTH_SHORT).show();
                 }
                }

        });


    }


}
