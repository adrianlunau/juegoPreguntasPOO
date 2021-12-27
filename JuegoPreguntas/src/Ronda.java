public class Ronda {

    private int nivel;
    private double premio;
    private Pregunta preguntaActual;
    private Preguntero preguntero;

    public Ronda(Preguntero preguntero) {
        this.preguntero = preguntero;
        this.nivel = 1;

    }

    public Pregunta preguntar(){
        preguntaActual = preguntero.lanzarPregunta(this.nivel);
        return preguntaActual;
    }

    public void subirNivel(){
        this.nivel += 1;
    }
}
