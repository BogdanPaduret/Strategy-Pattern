package com.company;

public class Plane extends Vehicle{

    private TakeOffBehaviour takeoff;
    private double weight;
    private int wingSets;

    public Plane(String name, TakeOffBehaviour takeoff, double weight, int wingSets) {
        super(name);
        this.takeoff = takeoff;
        this.weight = weight;
        this.wingSets = wingSets;
    }

    public TakeOffBehaviour getTakeoff() {
        return takeoff;
    }
    public void setTakeoff(TakeOffBehaviour takeoff) {
        this.takeoff = takeoff;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getWingSets() {
        return wingSets;
    }
    public void setWingSets(int wingSets) {
        this.wingSets = wingSets;
    }
}
