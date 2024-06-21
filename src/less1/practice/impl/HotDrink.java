package less1.practice.impl;

import less1.practice.Product;

import java.time.LocalDate;

public class HotDrink extends Product {

    protected int temperature;
    protected double volume;

    public int getTemperature() {
        return temperature;
    }

    public double getVolume() {
        return volume;
    }

    public HotDrink(String name, double price, LocalDate releaseDate, int temperature, double volume) {
        super(name, price, releaseDate);
        this.temperature = temperature;
        this.volume = volume;


    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "temperature=" + temperature +
                ", volume=" + volume +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
