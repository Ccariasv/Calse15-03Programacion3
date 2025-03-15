import Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singletonA = Singleton.optenerInstance();
        singletonA.monstarDato();
        singletonA.setDato("umg");
        singletonA.monstarDato();

        Singleton singletonB = Singleton.optenerInstance();
        singletonB.setDato("2umg");
        singletonB.monstarDato();
    }
}
