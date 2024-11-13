package pckg_weather_station_1;

public class MobilePhoneWeatherApp implements Observer, Display{

    private double temperature;
    private double humidity;
    private double pressure;
    private WeatherStation weatherStation;

    public void setWeatherStation(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }
    @Override
    public void display() {
        System.out.println("Displaying: ");
        System.out.println("Temperature: " + temperature + "C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Pressure: " + pressure + "hPa");
    }

    @Override
    public void update() {
        this.temperature = weatherStation.getTemperature();
        this.humidity = weatherStation.getHumidity();
        this.pressure = weatherStation.getPressure();
        System.out.println("All is updated!");
        System.out.println(Integer.toHexString(this.hashCode())+"@" + getClass().getSimpleName());
        display();
    }
}
