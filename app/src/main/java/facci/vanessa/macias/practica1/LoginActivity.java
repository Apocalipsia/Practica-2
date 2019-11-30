package facci.vanessa.macias.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView texto7, texto9;
    EditText texto8, texto10;
    Button buttonAutenticar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonAutenticar = (Button) findViewById(R.id.buttonAutenticar);
        texto7 = (TextView) findViewById(R.id.texto7);
        texto8 = (EditText) findViewById(R.id.texto8);
        texto9 = (TextView) findViewById(R.id.texto9);
        texto10 = (EditText) findViewById(R.id.texto10);

        buttonAutenticar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
