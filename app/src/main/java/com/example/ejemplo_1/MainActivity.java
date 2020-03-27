package com.example.ejemplo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button boton;
    public Button botonSiguinte;
    public EditText editTextNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate",Toast.LENGTH_LONG).show();

        boton=(Button)findViewById(R.id.buttonPrincipal);
        botonSiguinte=(Button)findViewById(R.id.buttonSiguiente);
        editTextNombre=(EditText)findViewById(R.id.editTextNombre);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hola mundo "+editTextNombre.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
        botonSiguinte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SegundoActivity.class);
                intent.putExtra("nombre", editTextNombre.getText().toString() );
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"onResume",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        getDelegate().onDestroy();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show();

    }
}
