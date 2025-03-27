import java.util.ArrayList; // Importa ArrayList

public class Main {
    public static void main(String[] args) {
        //  lista de nombres
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar nombres a la lista
        nombres.add("Fabiana");
        nombres.add("Maria");
        nombres.add("Yeslid");

        // Mostrar los nombres
        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}

