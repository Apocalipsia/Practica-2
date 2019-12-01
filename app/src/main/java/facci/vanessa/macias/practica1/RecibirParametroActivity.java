package facci.vanessa.macias.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecibirParametroActivity extends AppCompatActivity {

    TextView texto12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_parametro);

        texto12 = (TextView) findViewById(R.id.texto12);

        Bundle bundle = this.getIntent().getExtras();
        texto12.setText(bundle.getString("dato"));
    }
}
