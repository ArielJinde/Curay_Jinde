package example.curay_jinde;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
        btn_siguiente = findViewById(R.id.button_siguiente);
        btn_cerrar = findViewById(R.id.button_cerrar);
        editText_nombre= findViewById(R.id.ingresar_nombre);
        editText_base= findViewById(R.id.ingresar_base);


        btn_cerrar.setEnabled(false);

    }

    public  void  onClickSiguente(View view)
    {
        String nombre = editTextNombre.getText().toString();
        String apellido = editTextApellido.getText().toString();

        if (!nombre.matches("") && !apellido.matches(""))
        {

        Intent intent = new Intent(this,TercerActivity.class);
        this.startActivity(intent);
        intent.putExtra("nombre",editText_nombre.getText().toString().toLowerCase(Locale.ROOT));
        intent.putExtra("base",editText_base.getText().toString().trim());



    }
    public  void  onClickCerrar(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        this.startActivity(intent);
    }
}