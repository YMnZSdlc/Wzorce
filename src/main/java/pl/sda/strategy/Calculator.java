package pl.sda.strategy;

public class Calculator {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calculate (double firstNumber, double secondNumber){
        if (strategy==null){
            System.out.println("Error");
            return 0;
        }
        return strategy.operation(firstNumber,secondNumber);
    }



}
