package patronbuilder;

public class Pizza {
    private String masa;
    private String salsa;
    private String queso;
    private boolean aceitunas;
    private boolean peperoni;

    private Pizza() {

    }

    public void mostarPizza() {
        System.out.println("Pizza con :");
        System.out.println("- Masa: " + masa);
        System.out.println("- Salsa: " + salsa);
        System.out.println("- Queso: " + queso);
        System.out.println("- Aceitunas: " + (aceitunas ? "si" : "no"));
        System.out.println("- Peperoni: " + (peperoni ? "si" : "no"));
    }

    // clase Builder
    public static class pizzaBuilder{
        private Pizza pizza;

        public pizzaBuilder()
        {
            pizza = new Pizza();
        }

        public pizzaBuilder conMasa(String masa){
            pizza.masa = masa;
            return this;
        }

        public pizzaBuilder conSalsa(String salsa){
            pizza.salsa = salsa;
            return this;
        }
        public pizzaBuilder conQueso(String queso){
            pizza.queso = queso;
            return this;
        }
        public pizzaBuilder conAceitunas(){
            pizza.aceitunas = true;
            return this;
        }
        public pizzaBuilder conPeperoni(){
            pizza.aceitunas = true;
            return this;
        }

        public Pizza construir(){
            return pizza;
        }
    }
}
