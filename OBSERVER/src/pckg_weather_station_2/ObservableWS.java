package pckg_weather_station_2;

public interface ObservableWS {

    void add(Observer observer);
    void remove(Observer observer);
    void notifyAllObservers();
}
