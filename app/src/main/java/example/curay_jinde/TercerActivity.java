package example.curay_jinde;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TercerActivity extends AppCompatActivity {
    Button btn_cerrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);

        btn_cerrar = findViewById(R.id.button_cerrar);

        Bundle datosExtras = getIntent().getExtras();
        String nombrePersona = datosExtras.getString("nombre");
    }
    public  void  onClickSiguente(View view)
    {
        Intent intent = new Intent(this,SegundoActivity.class);
        this.startActivity(intent);
    }
}