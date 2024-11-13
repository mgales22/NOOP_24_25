package pckg_weather_station_1;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ObservableWS{

    private double temperature;
    private double humidity;
    private double pressure;
    private final List<Observer> observers;

    public WeatherStation(double t, double h, double p) {
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        this.observers = new ArrayList<>();
    }
    @Override
    public void add(Observer observer) {
        if(observers.contains(observer)) {
            System.out.println("Observer already exists");
        }else{
            observers.add(observer);
            System.out.println("New observer added to a list: " + observer);
        }
    }

    @Override
    public void remove(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
            System.out.println("Observer removed from a list: " + observer);
        }else{
            System.out.println("Observer does not exist");
        }
    }

    @Override
    public void notifyAllObservers() {

        if(observers.isEmpty()){
            System.out.println("No observers to notify");
        }else{
            for(Observer observer : observers){
                observer.update();
            }
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setStateWeatherData(double p, double t, double h){
        this.pressure = p;
        this.temperature = t;
        this.humidity = h;
        System.out.println("Weather data changed...");
        notifyAllObservers();
    }
}
