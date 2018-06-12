package pl.sda.strategy;

public class AddStrategy implements Strategy {

    @Override
    public double operation(double firstN, double secondN) {
        return firstN + secondN;
    }
}
