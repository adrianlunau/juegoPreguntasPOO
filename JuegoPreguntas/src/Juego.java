import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    private String nombre;
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private Jugador jugadorActual;
    private Preguntero preguntero;
    private Scanner scanner = new Scanner(System.in);

    public Juego() {
        this.nombre = "Juego de preguntas";
        this.preguntero = new Preguntero();
    }

    public void nuevoJugador(String nombre){
        this.jugadorActual = new Jugador(nombre);
    }

    public void mostrarHistorico(){
        for (Jugador jugador : this.jugadores) {
            System.out.println(jugador.mostrarJugador());
        }
    }

    public void configurarJuego(){
        System.out.println("Ingrese 1 para LISTAR PREGUNTAS, 2 para CREAR UNA PREGUNTA o 3 para VOLVER");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                this.preguntero.listarPreguntas();
                System.out.println("Presione 1 y enter para volver");
                int algo = scanner.nextInt();
                if (algo == 1){
                    this.mostrarMenu();
                }
            case 2:
                this.preguntero.crearPregunta();

            case 3:
                this.mostrarMenu();
            default:
                this.mostrarMenu();
        }
    }

    public void iniciarJuego(){

    }

    public void mostrarMenu(){


        System.out.println("------------    " + this.nombre + "    ------------");
        System.out.println("Ingrese 1 para INICAR EL JUEGO, 2 para CONFIGURAR o 3 para ver HISTORICO");

        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                this.iniciarJuego();
                break;
            case 2:
                this.configurarJuego();
                break;
            case 3:
                this.mostrarHistorico();
                break;
            default:
                System.out.println("El numero ingresado no es valido");
        }

    }
}
