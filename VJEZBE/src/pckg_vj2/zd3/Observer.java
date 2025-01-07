package pckg_vj2.zd3;

public interface Observer {
    void update(double temperature, double humidity, double pressure);
    void register(ObservableWS observableWS);
    void unregister(ObservableWS observableWS);
}
