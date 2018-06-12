package pl.repeat.generics;

class RectangleBox <T extends Rectangle> {

    private T rectangle;

    T getRectangle() {
        return rectangle;
    }

    void setRectangle(T rectangle) {
        this.rectangle = rectangle;
    }
}
