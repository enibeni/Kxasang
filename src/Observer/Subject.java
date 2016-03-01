package Observer;

/**
 * Created by s.morozov on 29.02.2016.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
