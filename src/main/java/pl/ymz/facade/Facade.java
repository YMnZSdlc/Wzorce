package pl.ymz.facade;

public class Facade {

    private HeandBrake heandBrake = new HeandBrake();
    private Engine engine = new Engine();

    public void vehicleGo() {
        heandBrake.heandBrakeOff();
        engine.engineOn();
    }

    public void vehicleStop() {
        engine.engineOff();
        heandBrake.heandBrakeOn();
    }
}
