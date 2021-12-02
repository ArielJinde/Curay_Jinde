package example.curay_jinde;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button  btn_siguiente;
Button btn_mostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_siguiente = findViewById(R.id.button_siguiente);
       btn_mostrar = findViewById(R.id.button_Resultado);
        btn_mostrar.setEnabled(false);  //Asigna valor true.

    }

    public  void  onClickSiguente(View view)
    {
        Intent  intent = new Intent(this,SegundoActivity.class);
        this.startActivity(intent);
    }
}