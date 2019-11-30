package facci.vanessa.macias.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PasarParametroActivity extends AppCompatActivity {

    EditText texto11;
    Button buttonPasarParametro2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasar_parametro);

        buttonPasarParametro2 = (Button) findViewById(R.id.buttonPasarParametro2);
        texto11 = (EditText) findViewById(R.id.texto11);

        buttonPasarParametro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PasarParametroActivity.this, RecibirParametroActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("dato", texto11.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
