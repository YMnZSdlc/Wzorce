package pl.repeat.generics;

public class FruitBox<TYPE> {
    private TYPE nameFruit;

    public FruitBox(TYPE nameFruit) {
        this.nameFruit = nameFruit;
    }

    public TYPE getNameFruit() {
        return nameFruit;
    }

    public void setNameFruit(TYPE nameFruit) {
        this.nameFruit = nameFruit;
    }
}
