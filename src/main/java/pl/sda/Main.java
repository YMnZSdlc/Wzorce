package pl.sda;


import pl.sda.builder.Pizza;
import pl.sda.factory.DocFactory;
import pl.sda.factory.Document;
import pl.sda.factory.DocumentType;
import pl.sda.fasade.Facade;
import pl.sda.observer.Person;
import pl.sda.observer.Weather;
import pl.sda.singleton.User;
import pl.sda.strategy.*;

import java.util.Scanner;

public class Main {

    public static void ma10in(String[] args) {
//        System.out.println(User.getInstance().hashCode());

//        fasade();
//        strategy();
//        singelton2();
//        singleton();
//        pizzaMaker();
//        factory();

        Weather weather = new Weather();

        Person person1 = new Person("Kuba", 15);
        Person person2 = new Person("Michał", 18);
        Person person3 = new Person("Maciej", 20);

        weather.addObserver(person1, person2, person3);
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj tenperature 'C: ");
            int actalTemp = in.nextInt();
            weather.setCurentTemperature(actalTemp);

        }


    }

    private static void factory() {
        DocFactory factory = new DocFactory();
        String txt = "Testy cos cos \n jeszcze cos";
        Document documentTxt = factory.createDoc(txt, DocumentType.TXT);
        documentTxt.saveFile();

        Document documentHtml = factory.createDoc(txt, DocumentType.HTML);
        documentHtml.saveFile();

    }

    private static void pizzaMaker() {
        Pizza pizza = new Pizza.PizzaBuilder()
                .setName("Hawajska")
                .setSize(43)
                .setPrice(32)
                .setToppings("ser", "pieczarki", "kurczak")
                .make();
        System.out.println(pizza.toString());
    }

    private static void singelton2() {
        User user = User.getInstance();
        user.setAge(22);
        user.setName("Kuba");
    }

    private static void singleton() {
        User user = User.getInstance();
        System.out.println(user.hashCode());
        System.out.println(user.toString());
    }

    private static void strategy() {
        Calculator calculator = new Calculator();

        calculator.setStrategy(new AddStrategy());
        System.out.println(calculator.calculate(2, 3));

        calculator.setStrategy(new SubStrategy());
        System.out.println(calculator.calculate(4, 2));

        calculator.setStrategy(new MultiStrategy());
        System.out.println(calculator.calculate(4, 6));

        calculator.setStrategy(new DivideStrategy());
        System.out.println(calculator.calculate(20, 5));
    }

    private static void fasade() {
        Facade fasade = new Facade();
        fasade.enterRoom();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fasade.exitRoom();
    }

}
