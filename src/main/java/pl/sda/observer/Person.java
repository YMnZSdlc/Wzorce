package pl.sda.observer;

public class Person {
    private String name;
    private int tempMax;

    public Person(String name, int tempMax) {
        this.name = name;
        this.tempMax = tempMax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public void update(int curentTemperature) {
        System.out.printf("%s says cureent temperature is %s\tHis max temperature is %s\n",
                name, curentTemperature, tempMax);
    }
}
