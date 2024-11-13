package pckg_weather_station_2;

public class MobilePhoneWeatherApp implements Observer,Display{

    private float[] values2Display;

    @Override
    public void display() {
        System.out.println("Mobile Phone Weather App");
        System.out.println("Temperature: " + values2Display[0]);
        System.out.println("Humidity: " + values2Display[1]);
        System.out.println("Pressure: " + values2Display[2]);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        values2Display = new float[]{(float)temperature, (float)humidity, (float)pressure};
        display();
    }

    @Override
    public void register(ObservableWS observableWS) {
        observableWS.add(this);
    }

    @Override
    public void unregister(ObservableWS observableWS) {
        observableWS.remove(this);
    }
}
