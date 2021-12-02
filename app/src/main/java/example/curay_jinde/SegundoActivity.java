package example.curay_jinde;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class SegundoActivity extends AppCompatActivity {
    Button btn_siguiente;
    Button btn_cerrar;
    EditText editText_nombre;
    EditText editText_base;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        btn_siguiente = findViewById(R.id.button_siguiente2);
        btn_cerrar = findViewById(R.id.button_cerrar);
        editText_nombre= findViewById(R.id.ingresar_nombre);
        editText_base= findViewById(R.id.ingresar_base);


        btn_cerrar.setEnabled(false);

    }

    public  void  onClickSiguente(View view)
    {
        String nombre = editText_nombre.getText().toString();
        String base = editText_base.getText().toString().trim();

        if (!nombre.matches("") && !base.matches("")) {

            Intent intent = new Intent(this, TercerActivity.class);

            intent.putExtra("nombre", nombre.toUpperCase(Locale.ROOT));
            intent.putExtra("base", base);
            Toast.makeText(this, nombre,Toast.LENGTH_LONG).show();
            btn_cerrar.setEnabled(true);

            this.startActivity(intent);
        }else {
            Toast.makeText(this, "Nombre y base son necesarios",Toast.LENGTH_LONG).show();
        }


    }
    public  void  onClickCerrar(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        this.startActivity(intent);
    }
}