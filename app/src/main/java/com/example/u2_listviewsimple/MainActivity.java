package com.example.u2_listviewsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView lvProvincias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProvincias = (ListView)findViewById(R.id.lvPrueba);

        String[] provincias = {"Cádiz","Málaga","Sevilla","Huelva","Córdoba","Jaén","Almería","Cádiz","Málaga","Sevilla","Huelva","Córdoba","Jaén","Almería","Cádiz","Málaga","Sevilla","Huelva","Córdoba","Jaén","Almería"};

        ArrayAdapter<String> adaptadorProvincias = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,provincias);

        lvProvincias.setAdapter(adaptadorProvincias);

        lvProvincias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String provinciaClicada = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "Provincia seleccionada: "+provinciaClicada, Toast.LENGTH_LONG).show();
            }
        });

        lvProvincias.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String provinciaClicada = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "Provincia click largo: "+provinciaClicada, Toast.LENGTH_LONG).show();

                return true;
            }
        });
        }
}
