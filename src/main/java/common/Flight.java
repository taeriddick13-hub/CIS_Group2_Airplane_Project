package common;

import java.sql.Time;
// fields
public class Flight {
    private final int FlightId;
    private final String FlightNumber;
    private final String OriginalCity;
    private final String DestinationCity;
    private final Time DepartTime;
    private final Time ArriveTime;
    private final int MaxCapacity;
    private final int CurrentPassengers;
    private final int Price;

    public Flight(int FlightId, String FlightNumber, String OriginalCity, String DestinationCity, Time DepartTime, Time ArriveTime, int MaxCapacity, int CurrentPassengers, int Price) {
        this.FlightId = FlightId;
        this.FlightNumber = FlightNumber;
        this.OriginalCity = OriginalCity;
        this.DestinationCity = DestinationCity;
        this.DepartTime = DepartTime;
        this.ArriveTime = ArriveTime;
        this.MaxCapacity = MaxCapacity;
        this.CurrentPassengers = CurrentPassengers;
        this.Price = Price;

    }

    // Getters
    public int getFlightID() {
        return FlightId;
    }

    public String getFlightNumber() {
        return FlightNumber;
    }

    public String getOriginalCity() {
        return OriginalCity;
    }

    public String getDestinationCity() {
        return DestinationCity;
    }

    public Time getDepartTime() {
        return DepartTime;
    }

    public Time getArriveTime() {
        return ArriveTime;
    }

    public int getMaxCapacity() {
        return MaxCapacity;
    }

    public int getCurrentPassengers() {
        return CurrentPassengers;
    }

    public int getPrice() {
        return Price;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + FlightId +
                ", num='" + FlightNumber + '\'' +
                ", route='" + OriginalCity + " -> " + DestinationCity + '\'' +
                '}';

    }

}