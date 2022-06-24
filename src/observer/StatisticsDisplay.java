package observer;

public class StatisticsDisplay implements Observer {
    WeatherData data;

    public StatisticsDisplay(WeatherData data) {
        this.data = data;
        data.Attach(this);
    }

    public void display() {
        System.out.println(">>> Statistics: ");
        System.out.println("Temperature: " + data.getTemperature());
        System.out.println("Humidity: " + data.getHumidity());
        System.out.println("Pressure: " + data.getPressure());
    }

    public WeatherData getData() {
        return data;
    }

    public void setData(WeatherData data) {
        this.data = data;
    }


    @Override
    public void update(Subject changedSubject) {
        display();
    }
}
