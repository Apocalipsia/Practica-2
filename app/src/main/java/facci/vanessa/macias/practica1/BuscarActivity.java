package facci.vanessa.macias.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BuscarActivity extends AppCompatActivity {

    TextView texto1;
    EditText texto2;
    Button buttonBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

        buttonBuscar = (Button) findViewById(R.id.buttonBuscar);
        texto1 = (TextView) findViewById(R.id.texto1);
        texto2 = (EditText) findViewById(R.id.texto2);

        buttonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
