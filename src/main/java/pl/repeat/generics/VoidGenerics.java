package pl.repeat.generics;

class VoidGenerics {

    static void method1(ShapeBox<Circle> circleShapeBox) {

    }

    static void method2(ShapeBox<Rectangle> rectangleShapeBox) {

    }

    static void method3(ShapeBox<? extends Shape> shapeShapeBox) {

    }

    static void method4 (ShapeBox<?> shapeBox){

    }

    static <A> void method5 (A anyElement){

    }
}
