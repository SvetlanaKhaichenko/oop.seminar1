package less1.practice.impl;

import less1.practice.Product;

import java.time.LocalDate;

public class BottleOfWatter extends Product {

    private float volume;
    private String pack;
    private boolean isSpark;

    public BottleOfWatter(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.isSpark = false;
        this.volume = 0;
        this.pack = Package.PLASTIC.getMaterial();
    }

    public BottleOfWatter(String name, double price, LocalDate releaseDate, boolean isSpark, String pack,  float volume) {
        super(name, price, releaseDate);
        this.isSpark = isSpark;
        this.volume = volume;
        this.pack = pack;
    }

    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    @Override
    public String toString() {
        return "BottleOfWatter{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "volume=" + volume +
                ", pack='" + pack + '\'' +
                ", isSpark=" + isSpark +
                '}';
    }
}
