import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject{
    private final List<IObserver> observers;
    private float temprature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(IObserver o){
        observers.add(o);
    }
    @Override
    public void removeObserver(IObserver o){
        observers.remove(o);
    }
    @Override
    public void notifyObservers(){
        for(IObserver o : observers){
            o.update(temprature, humidity, pressure);
        }
    }
    public void setMeasurements(float temprature,float humidity,float pressure){
        this.temprature=temprature;this.humidity=humidity;this.pressure=pressure;
        measureMentsChanged();
    }
    private void measureMentsChanged(){
        notifyObservers();
    }
}
