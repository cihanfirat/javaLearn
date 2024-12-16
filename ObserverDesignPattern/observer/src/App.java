public class App {
    public static void main(String[] args) throws Exception {
        WeatherData weatherData = new WeatherData();

        IObserver currentDisplay = new CurrentConditionDisplay();
        IObserver statisticsDisplay = new StatisticsDisplay();

        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(statisticsDisplay);

        weatherData.setMeasurements(25.0f, 65.0f, 1013.0f);
        weatherData.setMeasurements(22.0f, 70.0f, 1012.0f);
    }
}
