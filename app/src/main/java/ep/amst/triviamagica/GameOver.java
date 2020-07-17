package ep.amst.triviamagica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameOver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over2);
    }

    public void cerraraplicion(View view){
        finish();
    }
    public void volveralmenu(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}