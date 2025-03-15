package Singleton;

public class Singleton {
    private static Singleton instance;

    private String dato;

    public Singleton() {
        dato = "soy una instancia";
    }
    public static Singleton optenerInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void monstarDato(){
        System.out.println(dato);
    }

    public void setDato(String nuevoDato) {
        this.dato = nuevoDato;
    }
}
