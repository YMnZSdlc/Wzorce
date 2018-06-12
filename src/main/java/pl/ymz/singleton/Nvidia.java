package pl.ymz.singleton;

public class Nvidia {
    private static Nvidia card;
    private String name;
    private int model;
    private int memory;

    public Nvidia() {

    }

    public static Nvidia getInstance(){
        if (card == null){
            card = new Nvidia();
        }
        return card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Nvidia{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", memory=" + memory +
                '}';
    }
}
