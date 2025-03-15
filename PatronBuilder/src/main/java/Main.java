import patronbuilder.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizzaCompleta = new Pizza.pizzaBuilder()
                .conMasa("delgada")
                .conSalsa("tomate")
                .conQueso("mozarella")
                .conPeperoni()
                .conAceitunas()
                .construir();
        Pizza pizzaVegana = new Pizza.pizzaBuilder()
                .conMasa("integral")
                .conSalsa("tomate")
                .conQueso("vegano")
                .conAceitunas()
                .construir();

        Pizza pizzaDobleQueso = new Pizza.pizzaBuilder()
                .conMasa("integral")
                .conQueso("doble")
                .construir();

        Pizza pizzaDoblePeperoni = new Pizza.pizzaBuilder()
                .conMasa("integral")
                .conSalsa("tomate triple")
                .conQueso("doble")
                .conPeperoni()
                .construir();

        System.out.println("pizza Completa");
        pizzaCompleta.mostarPizza();

        System.out.println("pizza Vegana");
        pizzaVegana.mostarPizza();

        System.out.println("pizza Doble Queso");
        pizzaDobleQueso.mostarPizza();

        System.out.println("pizza Doble Peperoni");
        pizzaDoblePeperoni.mostarPizza();
    }

}
