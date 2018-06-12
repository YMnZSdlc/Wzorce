package pl.repeat.generics;

public class CircleBox <T extends Circle> {
    private T circle;

    public CircleBox(T circle) {
        this.circle = circle;
    }

    public T getCircle() {
        return circle;
    }
}
