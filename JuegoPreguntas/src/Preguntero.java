import java.util.ArrayList;
import java.util.Scanner;

public class Preguntero {
    private ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();
    private Scanner scanner = new Scanner(System.in);

    public void crearPregunta(){
        System.out.println("Ingrese un numero del 1 al 5 para asignar un nivel");
        int nivel = scanner.nextInt();
        System.out.println("Ingrese la pregunta y luego presione enter");
        String saltoDeLinea = scanner.nextLine();
        String nuevaPreg = scanner.nextLine();
        System.out.println("Ingrese las 4 opciones seguido de enter");
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        String C = scanner.nextLine();
        String D = scanner.nextLine();
        System.out.println("Escriba la respuesta correcta");
        String correcta = scanner.nextLine();
        System.out.println("Respuesta guardada con exito");

        Pregunta nuevaPregunta = new Pregunta(nivel, nuevaPreg);
        nuevaPregunta.setearRespCorrecta(correcta);


        this.preguntas.add(nuevaPregunta);
        nuevaPregunta.setId(preguntas.size());


    }

    public void agregarPregunta(Pregunta p){
        preguntas.add(p);
    }
    
    public void quitarPregunta(int id){
        for (Pregunta pregunta : preguntas) {
            if (pregunta.getId() == id){
                preguntas.remove(pregunta);
            }
        }
    }

    public Pregunta lanzarPregunta(int nivel){
        ArrayList<Pregunta> filtradas = new ArrayList<Pregunta>();
        for (Pregunta pregunta : preguntas) {
            if (pregunta.getNivel() == nivel){
                filtradas.add(pregunta);
            }
        }
        int indiceAleatorio = (int)Math.random()*filtradas.size();

        return filtradas.get(indiceAleatorio);
    }

    public void listarPreguntas(){
        System.out.println("Preguntas nivel 1");
        for (Pregunta pregunta : preguntas) {
            if (pregunta.getNivel()==1){
                System.out.println(pregunta.getPregunta());
            }

        }
        System.out.println("Preguntas nivel 2");
        for (Pregunta pregunta : preguntas) {
            if (pregunta.getNivel()==2){
                System.out.println(pregunta.getPregunta());
            }

        }
        System.out.println("Preguntas nivel 3");
        for (Pregunta pregunta : preguntas) {
            if (pregunta.getNivel()==3){
                System.out.println(pregunta.getPregunta());
            }

        }
        System.out.println("Preguntas nivel 4");
        for (Pregunta pregunta : preguntas) {
            if (pregunta.getNivel()==4){
                System.out.println(pregunta.getPregunta());
            }

        }
        System.out.println("Preguntas nivel 5");
        for (Pregunta pregunta : preguntas) {
            if (pregunta.getNivel()==5){
                System.out.println(pregunta.getPregunta());
            }

        }
    }


}
