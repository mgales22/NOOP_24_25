package pckg_vj2.zd3;

import java.util.ArrayList;
import java.util.HashMap;

public class WeatherStation implements ObservableWS {
    private ArrayList<Observer> observers;
    private HashMap<String, Observer> mobileObservers;
    private Observer viewPanelObserver;
    private String selectedObserver;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
        mobileObservers = new HashMap<>();
    }

    public void setSelectedObserver(String name) {
        this.selectedObserver = name;
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        if (observer instanceof ViewPanel) {
            viewPanelObserver = observer;
        } else if (observer instanceof MobilePhoneWeatherApp) {
            MobilePhoneWeatherApp app = (MobilePhoneWeatherApp) observer;
            mobileObservers.put(app.getName(), observer);
        }
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        if (observer instanceof MobilePhoneWeatherApp) {
            MobilePhoneWeatherApp app = (MobilePhoneWeatherApp) observer;
            mobileObservers.remove(app.getName());
        } else if (observer instanceof ViewPanel) {
            viewPanelObserver = null;
        }
    }

    public Observer getObserverByName(String name) {
        return mobileObservers.get(name);
    }

    @Override
    public void notifyObservers() {
        if (viewPanelObserver != null) {
            viewPanelObserver.update(temperature, humidity, pressure);
        }

        if (selectedObserver != null && !selectedObserver.isEmpty()) {
            Observer selectedMobileObserver = mobileObservers.get(selectedObserver);
            if (selectedMobileObserver != null) {
                selectedMobileObserver.update(temperature, humidity, pressure);
            }
        }
    }
}