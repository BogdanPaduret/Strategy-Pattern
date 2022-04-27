package com.company;

public class Car extends Vehicle {
    private int seats;
    private double power;
    private Powertrain drive;

    public Car(String name, int seats, double power, Powertrain drive) {
        super(name);
        this.seats = seats;
        this.power = power;
        this.drive = drive;
    }

    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }

    public Powertrain getDrive() {
        return drive;
    }
    public void setDrive(Powertrain drive) {
        this.drive = drive;
    }
}
