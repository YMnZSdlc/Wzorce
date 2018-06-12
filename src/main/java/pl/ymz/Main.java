package pl.ymz;

import pl.ymz.facade.Facade;
import pl.ymz.singleton.Nvidia;

public class Main {
    public static void main(String[] args) {

//        facade();

        singletonExample1();
        singletonExample2();

    }

    private static void singletonExample2() {
        Nvidia card = Nvidia.getInstance();
        System.out.println(card.hashCode());
        System.out.println(card.toString());
    }

    private static void singletonExample1() {
        Nvidia card = Nvidia.getInstance();
        card.setName("GTX");
        card.setModel(1024);
        card.setMemory(6);
    }

    private static void facade() {
        Facade facade = new Facade();
        facade.vehicleGo();
        try {
            Thread.sleep(2000);

        }catch (InterruptedException exept){
            exept.printStackTrace();
        }
        facade.vehicleStop();
    }
}
