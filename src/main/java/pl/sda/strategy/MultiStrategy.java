package pl.sda.strategy;

public class MultiStrategy implements Strategy{


    @Override
    public double operation(double firstN, double secondN) {
        return firstN * secondN;
    }
}
