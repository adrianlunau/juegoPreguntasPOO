public class Jugador {
    private String nombre;
    private double premioAcumulado;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String mostrarJugador(){
        String datos = this.nombre + " ............. " + this.premioAcumulado;
        return datos;
    }
}
