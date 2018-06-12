package pl.sda.strategy;

public class DivideStrategy implements Strategy {
    @Override
    public double operation(double firstN, double secondN) {
        if (secondN==0){
            System.out.println("Nie dziel przez zero");
            return 0;
        }
        return firstN/secondN;
    }
}
