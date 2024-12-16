import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements IObserver{
    private final List<Float> temperatureHistory = new ArrayList<>();
    @Override
    public void update(float temperature,float humidity,float pressure){
        temperatureHistory.add(temperature);
        display();
    }
    public void display(){
        float averageTemperature = temperatureHistory.stream().reduce(0f, Float::sum) / temperatureHistory.size();
        System.out.println("Average temperature: " + averageTemperature + "°C.");
    }
}
