package ep.amst.triviamagica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOver extends AppCompatActivity {
    String intentos;
    String texto= "Lo siento ha perdido con ";
    TextView txt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over2);
        Intent i = getIntent();
        intentos= i.getStringExtra("intentos");
        System.out.println(intentos);
        txt = findViewById(R.id.text);
        texto = texto+intentos+" intentos";
        txt.setText(texto);
        btn = findViewById(R.id.Salir);
    }

    public void cerraraplicion(View v){
        Intent i = new Intent(this,GameActivity.class);
        i.putExtra("Cerrar","TRUE");
        startActivity(i);
        android.os.Process.killProcess(android.os.Process.myPid());

        finish();
            System.exit(0);
    }
    public void volveralmenu(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}