package ru.netology;

public class Ticket implements Comparable<Ticket> {

    private int id;
    private int price;
    private String airportFrom;
    private String airportTo;
    private int flightTime;

    //конструкторы
    public Ticket() {

    }

    public Ticket(int id, int price, String airportFrom, String airportTo, int flightTime) {
        this.id = id;
        this.price = price;
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
        this.flightTime = flightTime;
    }

    //getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAirportFrom() {
        return airportFrom;
    }

    public void setAirportFrom(String airportFrom) {
        this.airportFrom = airportFrom;
    }

    public String getAirportTo() {
        return airportTo;
    }

    public void setAirportTo(String airportTo) {
        this.airportTo = airportTo;
    }

    public int getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(int flightTime) {
        this.flightTime = flightTime;
    }

    @Override
    public int compareTo(Ticket o) {
        return this.getPrice() - o.getPrice();
    }
}
