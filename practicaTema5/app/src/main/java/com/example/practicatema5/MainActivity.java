package com.example.practicatema5;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridView lista;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.gridview);

            List<String> data = Arrays.asList("España", "Francia", "Letonia", "Alemania", "Belgica", "Italia", "portugal", "Holanda", "Lituania", "Polonia");


           lista = findViewById(R.id.lista);
           texto = findViewById(R.id.texto);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, data);
        lista.setAdapter(adapter);
        }

    public void onStart(){
        super.onStart();

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String elemento =(String) parent.getItemAtPosition(position);
                texto.setText(elemento);
            }
        });


    }
}