import java.util.Stack;
public class pilasEjemplo {
    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();
            pila.push(10);
        System.out.println("agregando 10");
            pila.push(20);
        System.out.println("agregando 20");
            pila.push(30);
        System.out.println("agregando 30");
                System.out.println("El tamaño de la pia es: " + pila.size());
                System.out.println("el tope de los elementos es " + pila.peek());
                System.out.println("el elemento elminado es  " + pila.pop());
                System.out.println("los elementos es " + pila);
    }
}
