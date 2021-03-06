package example.curay_jinde;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TercerActivity extends AppCompatActivity {
    Button btn_cerrar;
    TextView nombre;
    TextView base;


    EditText apellido;
    EditText exponente;
    EditText numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);

        btn_cerrar = findViewById(R.id.button_cerrar);
        nombre = findViewById(R.id.resutul_nombre);
        apellido= findViewById(R.id.resutul_apellido);

        base = findViewById(R.id.resutul_base);
        exponente = findViewById(R.id.resutul_exponet);
        numero = findViewById(R.id.resutul_numero);





        Bundle datosExtras = getIntent().getExtras();
        String nombreP = datosExtras.getString("nombre");
        String baseP = datosExtras.getString("base");

        nombre.setText(nombreP);
        base.setText(baseP);

    }
    public  void  onClickCerrar(View view)
    {
        Intent intent = new Intent(this,SegundoActivity.class);
        finish();
    }
}