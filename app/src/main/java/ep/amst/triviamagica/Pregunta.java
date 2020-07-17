package ep.amst.triviamagica;

import java.util.ArrayList;

public class Pregunta {
    String PREGUNTA;
    ArrayList<String> RESPUESTAS;
    String RESPUESTA_CORRECTA;

    public Pregunta(String PREGUNTA, ArrayList<String> RESPUESTAS, String RESPUESTA_CORRECTA) {
        this.PREGUNTA = PREGUNTA;
        this.RESPUESTAS = RESPUESTAS;
        this.RESPUESTA_CORRECTA = RESPUESTA_CORRECTA;
    }

    public Boolean isCorrect(String respuesta){
        return this.RESPUESTA_CORRECTA.equals(respuesta);
    }

    public String getPREGUNTA() {
        return PREGUNTA;
    }

    public void setPREGUNTA(String PREGUNTA) {
        this.PREGUNTA = PREGUNTA;
    }

    public ArrayList<String> getRESPUESTAS() {
        return RESPUESTAS;
    }

    public void setRESPUESTAS(ArrayList<String> RESPUESTAS) {
        this.RESPUESTAS = RESPUESTAS;
    }

    public String getRESPUESTA_CORRECTA() {
        return RESPUESTA_CORRECTA;
    }

    public void setRESPUESTA_CORRECTA(String RESPUESTA_CORRECTA) {
        this.RESPUESTA_CORRECTA = RESPUESTA_CORRECTA;
    }
}
