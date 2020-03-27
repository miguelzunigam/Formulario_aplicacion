package com.example.ejemplo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SegundoActivity extends AppCompatActivity {

    public Button boton_Anterior;
//    public Bundle bundle_datos;
    public TextView textViewNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        textViewNombre=(TextView)findViewById(R.id.textViewNombres);
        Bundle bundle_datos=getIntent().getExtras();
        if(bundle_datos!=null){
            String nombre=bundle_datos.getString("nombre");
            Toast.makeText(this,"No vacio"+nombre,Toast.LENGTH_SHORT).show();
//            textViewNombre.setText("nada");
            textViewNombre.setText(nombre);
        }else{
            Toast.makeText(this,"Sin datos",Toast.LENGTH_SHORT).show();
        }

        boton_Anterior=(Button)findViewById(R.id.buttonAnterior);
        boton_Anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SegundoActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
