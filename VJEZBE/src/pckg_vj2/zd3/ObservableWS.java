package pckg_vj2.zd3;

public interface ObservableWS {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}