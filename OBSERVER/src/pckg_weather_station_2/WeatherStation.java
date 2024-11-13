package pckg_weather_station_2;

public class WeatherStation implements ObservableWS{

    private double temperature;
    private double humidity;
    private double pressure;
    private boolean isChanged;

    public WeatherStation(double t, double h, double p) {
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        this.isChanged = false;
    }

    public void listAllObservers(){

    }
    @Override
    public void add(Observer observer) {

    }

    @Override
    public void remove(Observer observer) {

    }

    @Override
    public void notifyAllObservers() {

    }

    public void stateChanged(float t, float h, float p){
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        this.isChanged = true;
    }

    private void setStateData(float t, float h, float p){
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
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
}
