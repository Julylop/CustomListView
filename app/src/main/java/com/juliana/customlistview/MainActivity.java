package com.juliana.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listaPersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[]nombres={
                "Melisa",
                "Pedro",
        };

        int [] fotosPerfil={
                R.drawable.persona,
                R.drawable.persona2,

        };

        String[]telefonos={
                "87818274",
                "983989839",
        };

        ListAdapter personas = new ListAdapter(MainActivity.this,nombres,telefonos,fotosPerfil);
        listaPersonas=(ListView) findViewById(R.id.litaUsuarios);
        listaPersonas.setAdapter(personas);

    }
}