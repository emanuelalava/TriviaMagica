package ep.amst.triviamagica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String cerrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = getIntent();
        cerrar = i.getStringExtra("Cerrar");
        System.out.println(cerrar);
        if (cerrar != null){System.out.println("Saliendo");
            finish();
            System.exit(0);
        }
    }

    public void empezarjuego(View view){

        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

}

