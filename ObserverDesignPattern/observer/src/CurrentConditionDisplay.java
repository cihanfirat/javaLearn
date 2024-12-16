public class CurrentConditionDisplay implements IObserver{
    private float temprature;
    private float humidity;
    @Override
    public void update(float temprature,float humidity,float pressure){
        this.temprature=temprature;this.humidity=humidity;
        display();
    }
    public void display(){
        System.out.println(
            "Current conditions: " + temprature + 
            " C and " + humidity + " % humidity");
    }
}
