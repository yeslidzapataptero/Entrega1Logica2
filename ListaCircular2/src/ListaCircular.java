public class ListaCircular {
    Nodo cabeza;  // El primer nodo de la lista

    // Constructor para inicializar la lista circular
    public ListaCircular() {
        cabeza = null;  // Al principio, la lista está vacía
    }

    // Método para agregar un nuevo nodo a la lista circular
    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);  // Crear un nuevo nodo con el valor dado

        if (cabeza == null) {
            // Si la lista está vacía, el nuevo nodo será el único nodo
            cabeza = nuevoNodo;
            cabeza.siguiente = cabeza;  // El siguiente nodo de cabeza apunta a sí mismo
        } else {
            Nodo temp = cabeza;
            // Recorremos la lista hasta el último nodo
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            // Insertamos el nuevo nodo al final y lo apuntamos hacia cabeza
            temp.siguiente = nuevoNodo;
            nuevoNodo.siguiente = cabeza;  // El nuevo nodo apunta de nuevo a cabeza
        }
    }

    // Método para imprimir los elementos de la lista circular
    public void imprimir() {
        if (cabeza != null) {
            Nodo temp = cabeza;
            do {
                System.out.print(temp.valor + " ");  // Imprimir el valor del nodo
                temp = temp.siguiente;  // Moverse al siguiente nodo
            } while (temp != cabeza);  // Continuar hasta volver al nodo cabeza
            System.out.println();  // Para hacer un salto de línea después de imprimir
        }
    }
}
