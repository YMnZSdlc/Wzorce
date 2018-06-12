package pl.repeat.generics;

public class ShapeBox <T extends Shape> {

    private T shape;

    public ShapeBox(T shape) {
        this.shape = shape;
    }

    public T getShape() {
        return shape;
    }

    public void setShape(T shape) {
        this.shape = shape;
    }
}
