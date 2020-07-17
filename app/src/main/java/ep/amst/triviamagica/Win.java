package ep.amst.triviamagica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Win extends AppCompatActivity {
    String cerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
        Intent i = getIntent();
        cerrar = i.getStringExtra("Cerrar");
        System.out.println(cerrar);
        if (cerrar != null){
            finish();
            System.exit(0);
        }
    }

    public void cerraraplicion(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }

}