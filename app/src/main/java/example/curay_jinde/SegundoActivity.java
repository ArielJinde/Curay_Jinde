package example.curay_jinde;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundoActivity extends AppCompatActivity {
    Button btn_siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        btn_siguiente = findViewById(R.id.button_siguiente);


    }

    public  void  onClickSiguente(View view)
    {
        Intent intent = new Intent(this,TercerActivity.class);
        this.startActivity(intent);
    }
}