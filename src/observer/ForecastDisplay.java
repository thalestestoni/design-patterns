package observer;

public class ForecastDisplay implements Observer {
    WeatherData data;

    public ForecastDisplay(WeatherData data) {
        this.data = data;
        data.Attach(this);
    }

    public void display() {
        System.out.println(">>> Forecast: ");
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
        if (changedSubject == data) {
            display();
        }
    }
}
