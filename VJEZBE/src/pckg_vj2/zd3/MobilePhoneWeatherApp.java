package pckg_vj2.zd3;

public class MobilePhoneWeatherApp implements Observer, Display {
    private String name;
    private double temperature;
    private double humidity;
    private double pressure;

    public MobilePhoneWeatherApp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.printf("[%s] Temperatura: %.1f°C, Vlažnost: %.1f%%, Tlak: %.1f hPa%n",
                name, temperature, humidity, pressure);
    }

    @Override
    public void register(ObservableWS observableWS) {
        observableWS.addObserver(this);
    }

    @Override
    public void unregister(ObservableWS observableWS) {
        observableWS.removeObserver(this);
    }
}
