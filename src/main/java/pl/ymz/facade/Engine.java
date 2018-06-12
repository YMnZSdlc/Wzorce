package pl.ymz.facade;

public class Engine {
    protected void engineOn() {
        System.out.println("Silnik został uruchomiony");
    }

    protected void engineOff() {
        System.out.println("Silnik został wyłączony");
    }
}
