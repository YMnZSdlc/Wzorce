package pl.sda.fasade;

public class Facade {

    private Lights light = new Lights();
    private Windows window = new Windows();
    private Alarm alarm = new Alarm();

    public void enterRoom() {
        light.lightsOn();
        window.openWindow();
        alarm.disarmAlarm();
    }

    public void exitRoom() {
        light.lightsOff();
        window.closeWindow();
        alarm.armAlarm();
    }
}
