package pl.repeat.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        testGenerics1();
//        testGenerics2();
//        testGenerics3();
//        testGenerics4();
//        testGenerics5();
//        testGenerics6();
//        testGenerics7();
        testGenerics8();

    }

    private static void testGenerics8() {
//        List <? extends Number> listNumber = new ArrayList<Integer>();
//        listNumber.add((Number)32); //Skłądnia poprawna, ale nei da się dodać. Ciekawy wyjątek.
//        List<? extends Double> listDouble = new ArrayList<Double>();

        List<? super Integer> listIntiger = new ArrayList<Integer>();
        listIntiger.add(Integer.valueOf(32));
        listIntiger.add(44);
        List<? super Integer> listIntiger2 = new ArrayList<Number>();
        List<? super Integer> listIntiger3 = new ArrayList<Object>();
//        List<? super Integer> listIntiger4 = new ArrayList<Float>();//Błędnie

    }

    private static void testGenerics7() {
        String str = ReturnGenericMethod.returnMethod1("napis");
        int value = ReturnGenericMethod.returnMethod1(1998);

        ReturnGenericMethod.returnMethod2(new Circle());
        ReturnGenericMethod.returnMethod2(new Rectangle());
//        ReturnGenericMethod.returnMethod2(5); //nie zadziała. Błędne

        ReturnGenericMethod.returnMethod3("abc","def");
        ReturnGenericMethod.returnMethod3(5,'d');
    }

    private static void testGenerics6() {
        ShapeBox<Circle> shapeBox = new ShapeBox<>(new Circle());
        VoidGenerics.method1(shapeBox);

        ShapeBox<Rectangle> shapeBox1 = new ShapeBox<>(new Rectangle());
        VoidGenerics.method2(shapeBox1);

        VoidGenerics.method3(shapeBox);
        VoidGenerics.method3(shapeBox1);

        VoidGenerics.method4(shapeBox);
        VoidGenerics.method4(shapeBox1);

        VoidGenerics.method5("cokolwiek");
        VoidGenerics.method5(true);
        VoidGenerics.method5(1998);
        VoidGenerics.method5(shapeBox);
    }

    private static void testGenerics5() {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle());
        shapeList.add(new Rectangle());
        shapeList.add(new Rectangle());
        shapeList.add(new Rectangle());

        for (Shape shape : shapeList) {
            System.out.println(shape.getClass().getSimpleName());
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                circle.showInfo();
            }
        }


    }

    private static void testGenerics4() {
        Circle circle = new Circle();
        ShapeBox<Circle> circleTest = new ShapeBox<>(circle);

        Rectangle rectangle = new Rectangle();
        ShapeBox<Rectangle> rectangleTest = new ShapeBox<>(rectangle);

        System.out.println(circleTest.getShape().getClass().getSimpleName());
        System.out.println(rectangleTest.getShape().getClass().getSimpleName());

        ShapeBox<Shape> shapeTest = new ShapeBox<>(rectangle);
        ShapeBox<Shape> shape = new ShapeBox<>(circle);

        System.out.println();

//        Map<Integer, Circle> map = new HashMap<>();

    }

    private static void testGenerics3() {
        Circle circle = new Circle();
        CircleBox<Circle> circleTest = new CircleBox<>(circle);

        System.out.println(circleTest.getCircle().getClass().getSimpleName());
        System.out.println(circleTest.getClass().getSimpleName());

        Rectangle rectangle = new Rectangle();
        RectangleBox<Rectangle> rectangleTest = new RectangleBox<>();
        rectangleTest.setRectangle(rectangle);

        System.out.println(rectangleTest.getRectangle().getClass().getSimpleName());


    }

    private static void testGenerics2() {
        BiggerBox<String, Integer> box1 = new BiggerBox<>("test", 1);
        System.out.println(box1.getBoxNameG().getClass().getSimpleName());
        System.out.println(box1.getBoxNameT().getClass().getSimpleName());

        BiggerBox<String, String> box2 = new BiggerBox<>("T1", "T2");
        System.out.println(box2.getBoxNameT().getClass().getSimpleName());
        System.out.println(box2.getBoxNameG().getClass().getSimpleName());
    }

    private static void testGenerics1() {
        FruitBox<String> fruitBox = new FruitBox<>("Apple");
        System.out.println(fruitBox.getNameFruit().getClass().getSimpleName());

        FruitBox<Boolean> fruitB = new FruitBox<>(true);
        System.out.println(fruitB.getNameFruit().getClass().getSimpleName());

        System.out.println(fruitB.getClass().getSimpleName());
    }


}
