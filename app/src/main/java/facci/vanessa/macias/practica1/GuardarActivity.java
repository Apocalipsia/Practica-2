package facci.vanessa.macias.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GuardarActivity extends AppCompatActivity {

    TextView texto3, texto5;
    EditText texto4, texto6;
    Button buttonEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardar);

        buttonEnviar = (Button) findViewById(R.id.buttonEnviar);
        texto3 = (TextView) findViewById(R.id.texto3);
        texto4 = (EditText) findViewById(R.id.texto4);
        texto5 = (TextView) findViewById(R.id.texto5);
        texto6 = (EditText) findViewById(R.id.texto6);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
