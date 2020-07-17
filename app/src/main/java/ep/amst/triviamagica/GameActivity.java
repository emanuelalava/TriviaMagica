package ep.amst.triviamagica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class GameActivity extends AppCompatActivity {
    ArrayList<Pregunta> PREGUNTAS = new ArrayList<Pregunta>();
    ArrayList<Integer> ORDEN = new ArrayList<Integer>();
    String CURRENT_CORRECT_ANSWER;
    int CURRENT_ORDEN = 0;
    ImageView imageview;
    TextView questionView;
    Button b1;
    Button b2;
    Button b3;
    Button b4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        setupOrden();
        setupPreguntas();
        setUpControls();
        showQuestion();

    }

    public void onButtonClick(View v){
        Button btn = findViewById(v.getId());
        String respuesta = (String) btn.getText();
        if (respuesta.equals(CURRENT_CORRECT_ANSWER)){
            CURRENT_ORDEN= CURRENT_ORDEN+1;
            if (CURRENT_ORDEN>4){
            Intent i = new Intent(this,Win.class);
            startActivity(i);
            }else {
            showQuestion();
            }

        }
        else{
            Intent i = new Intent(this,GameOver.class);
            String intentos = CURRENT_ORDEN+1+"";
            i.putExtra("intentos",intentos);
            startActivity(i);

        }

    }

    void setUpControls(){
        imageview = findViewById(R.id.questionImage);
        questionView = findViewById(R.id.questionText);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
    }
    void setupOrden(){
        while (ORDEN.size()<5){
            Random rand = new Random();
            int n = rand.nextInt(5);
            if (!ORDEN.contains(n)){
                ORDEN.add(n);
            }
        }
    }

    void setupPreguntas(){
        String p1 = "¿Cómo se llama el personaje principal de frozen?";
        ArrayList<String> r1 = new ArrayList<String>();
        r1.add("Elsa");
        r1.add("Betty");
        r1.add("Anita");
        r1.add("Olaf");
        String rc1 = "Elsa";
        Pregunta q1 = new Pregunta(p1,r1,rc1,R.drawable.frozen);

        String p2 = "¿Como se llama el personaje principal de Spider-Man?";
        ArrayList<String> r2 = new ArrayList<String>();
        r2.add("Tony");
        r2.add("Rogers");
        r2.add("Peter");
        r2.add("Gandalf");
        String rc2 = "Peter";
        Pregunta q2 = new Pregunta(p2,r2,rc2,R.drawable.spiderman);

        String p3 = "¿En qué año se estreno Baby Driver?";
        ArrayList<String> r3 = new ArrayList<String>();
        r3.add("1999");
        r3.add("2017");
        r3.add("2018");
        r3.add("1996");
        String rc3 = "2017";
        Pregunta q3 = new Pregunta(p3,r3,rc3,R.drawable.babydriver);

        String p4 = "¿Quien dirigió la pelicula Alita:Battle Angel?";
        ArrayList<String> r4 = new ArrayList<String>();
        r4.add("Quentin Tarantino");
        r4.add("Robert Rodriguez");
        r4.add("Steven Spilberg");
        r4.add("Martin Scorsese");
        String rc4 = "Robert Rodriguez";
        Pregunta q4 = new Pregunta(p4,r4,rc4,R.drawable.alita);

        String p5 = "¿En que año se estrenó Titánic?";
        ArrayList<String> r5 = new ArrayList<String>();
        r5.add("1998");
        r5.add("1996");
        r5.add("1995");
        r5.add("1997");
        String rc5 = "1997";
        Pregunta q5 = new Pregunta(p5,r5,rc5,R.drawable.titanic);

        PREGUNTAS.add(q1);
        PREGUNTAS.add(q2);
        PREGUNTAS.add(q3);
        PREGUNTAS.add(q4);
        PREGUNTAS.add(q5);
    }

    void showQuestion(){


        int orden = ORDEN.get(CURRENT_ORDEN);


        Pregunta pregunta = PREGUNTAS.get(orden);
        imageview.setImageDrawable(getDrawable(pregunta.getImageId()));
        questionView.setText(pregunta.getPREGUNTA());
        b1.setText(pregunta.getRESPUESTAS().get(0));
        b2.setText(pregunta.getRESPUESTAS().get(1));
        b3.setText(pregunta.getRESPUESTAS().get(2));
        b4.setText(pregunta.getRESPUESTAS().get(3));
        CURRENT_CORRECT_ANSWER = pregunta.getRESPUESTA_CORRECTA();

    }


}