package less1.practice.impl;

import java.time.LocalDate;

public class TeaDrink extends HotDrink{
    public TeaDrink(String name, double price, LocalDate releaseDate, int temperature, double volume) {
        super(name, price, releaseDate, temperature, volume);
    }
}
