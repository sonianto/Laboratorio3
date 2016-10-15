package dam.isi.frsf.utn.edu.ar.laboratorio3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
Trabajo[] tr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = (ListView) findViewById(R.id.listView);
        tr=Trabajo.TRABAJOS_MOCK;
        Miadapter a = new Miadapter(tr,getApplicationContext() );
        lv.setAdapter(a);
        

        lv.setItemsCanFocus(true);



    }

    public boolean onOptionsItemSelected(MenuItem item){
        // Handle item selection
        try{
            Intent i = new Intent(this, workfromhome.class);

                    startActivity(i);


        }catch(Exception e){

        }
        return true;
    }







}
