import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Controlador {
    private Jugador jugador;
    private Ronda rondaActual;
    private Pregunta preguntaActual;
    private String respuesta;


    public Controlador(Jugador jugador, Preguntero preguntero) {
        this.jugador = jugador;
        this.rondaActual = new Ronda(preguntero);
    }

    public void pedirPregunta(){
        preguntaActual = this.rondaActual.preguntar();

    }

    public void MostrarPregunta(){
        System.out.println(preguntaActual.getPregunta());
    }
    public void MostrarOpciones(){
        preguntaActual.MostrarOpciones();
    }

    public String responder(){
        System.out.println("Ingrese la letra correspondiente a la respuesta correcta");
        Scanner scanner = new Scanner(System.in);
        this.respuesta = scanner.nextLine();

        return respuesta.toUpperCase(Locale.ROOT);
    }

    public boolean verificarRespuesta(){
        if (preguntaActual.getRespuestaCorrecta().equals(this.respuesta)){
            return true;
        }
        return false;
    }

    public void avanzarRonda(){
        this.rondaActual.subirNivel();
    }


}
