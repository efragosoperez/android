package com.example.efragosoperez.login1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Usuario;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Usuario = (EditText) findViewById(R.id.UsuarioEtxt);
        boton = (Button) findViewById(R.id.botonBtn);
        boton.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Toast.makeText(getApplication(), "Bienvenido " + Usuario.getText().toString() + " " + "Upss! no existe DB", Toast.LENGTH_LONG).show();
                                     }


                                 }
        );
    }
}
