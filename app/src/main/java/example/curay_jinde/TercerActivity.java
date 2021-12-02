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
        exponente = findViewById(R.id.resutul_exponete);





        Bundle datosExtras = getIntent().getExtras();
        String nombrePersona = datosExtras.getString("nombre");

    }
    public  void  onClickSiguente(View view)
    {
        Intent intent = new Intent(this,SegundoActivity.class);
        this.startActivity(intent);
    }
}