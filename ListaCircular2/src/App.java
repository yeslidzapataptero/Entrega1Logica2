public class App {
    public static void main(String[] args) {
        // Crear una nueva lista circular
        ListaCircular lista = new ListaCircular();

        // Agregar algunos elementos a la lista
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);

        // Imprimir los elementos de la lista circular
        System.out.println("Elementos de la lista circular:");
        lista.imprimir();  // Imprime los elementos de la lista
    }
}
