package Colas;
import java.util.LinkedList;
import java.util.Queue;

public class Colas {
public static void main(String[] args) {
    Queue<String> cola = new LinkedList<>();
    cola.offer("primero");
    cola.offer("segundo");
    cola.offer("tercero");
    cola.offer("cuarto");
    cola.offer("quinto");
    System.out.println("cola actual: " + cola);
    String elementoEliminado = cola.poll();
    System.out.println("el elemento eliminado es: " + elementoEliminado);
    System.out.println("cola actual: " + cola);
    System.out.println("Tamaño de la cola: " + cola.size());
    System.out.println("la cola esta vacia ?: " + cola.isEmpty());
}
}
