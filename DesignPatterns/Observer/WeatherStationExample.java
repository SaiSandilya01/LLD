package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

// 1. The Observer Interface
interface Observer {
    void update(float temperature);
}

// 2. The Subject (WeatherStation)
class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    // Method to subscribe
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Method to unsubscribe
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Your logic: Notify all subscribers by looping through the list
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        System.out.println("WeatherStation: Temperature changed to " + temperature);
        notifyObservers();
    }
}

// 3. Concrete Observers
class PhoneDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Phone Display: Showing temperature " + temperature);
    }
}

class WebDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Web Display: Updating web portal with " + temperature);
    }
}

// 4. The Client
public class WeatherStationExample {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        // Displays "subscribe" at runtime
        Observer phone = new PhoneDisplay();
        Observer web = new WebDisplay();

        station.addObserver(phone);
        station.addObserver(web);

        // All subscribers get the update automatically
        station.setTemperature(25.5f);
        station.setTemperature(30.0f);
    }
}
