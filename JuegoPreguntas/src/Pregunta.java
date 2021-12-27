import java.util.ArrayList;

public class Pregunta {
    private int id;
    private int nivel;
    private String pregunta;
    private ArrayList<String> respuestas = new ArrayList<String>();
    private String respuestaCorrecta;

    public Pregunta(int nivel, String pregunta) {
        this.nivel = nivel;
        this.pregunta = pregunta;
    }

    public void agregarRespuesta(String resp){
        this.respuestas.add(resp);
    }

    public void quitarRespuesta(String resp){
        this.respuestas.remove(resp);
    }

    public void setearRespCorrecta(String correcta){
        this.respuestaCorrecta = correcta;
    }

    public boolean esCorrecta(String resp){
        if (this.respuestaCorrecta.equals(resp)){
            return true;
        }
        return false;
    }

    public void MostrarOpciones(){

        System.out.println("A- "+ respuestas.get(0));
        System.out.println("B- "+ respuestas.get(1));
        System.out.println("C- "+ respuestas.get(2));
        System.out.println("D- "+ respuestas.get(3));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public ArrayList<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<String> respuestas) {
        this.respuestas = respuestas;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
}
