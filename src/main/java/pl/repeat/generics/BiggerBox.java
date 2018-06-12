package pl.repeat.generics;

public class BiggerBox <T,G> {
    private T boxNameT;
    private G boxNameG;

    public BiggerBox(T boxNameT, G boxNameG) {
        this.boxNameT = boxNameT;
        this.boxNameG = boxNameG;
    }

    public T getBoxNameT() {
        return boxNameT;
    }

    public G getBoxNameG() {
        return boxNameG;
    }
}
