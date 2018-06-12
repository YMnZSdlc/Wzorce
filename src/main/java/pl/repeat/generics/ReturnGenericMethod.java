package pl.repeat.generics;

public class ReturnGenericMethod {

    static <T> T returnMethod1(T anyVariable){
        return anyVariable;
    }

    static <E extends Shape> E returnMethod2 (E something){
        return something;
    }


    static <W> W returnMethod3(W first, W second) {
        System.out.println(first.getClass().getSimpleName());
        System.out.println(second.getClass().getSimpleName());
        return first;
    }
}
