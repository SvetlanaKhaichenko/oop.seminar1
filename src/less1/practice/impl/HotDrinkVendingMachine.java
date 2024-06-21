package less1.practice.impl;

import less1.practice.Product;
import less1.practice.VendingMachine;

public class HotDrinkVendingMachine extends VendingMachine {

    public HotDrink getProduct(String name, int temperature, double volume){
        for (Product product: getProducts()){
            if (product.getName().equals(name) && product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getVolume()==volume && hotDrink.getTemperature()==temperature) {
                    getProducts().remove(product);
                    return hotDrink;
                }
            }
        }
        System.out.println("No such HotDrink " + name +" "+ temperature + " " + volume);
        ;
        return null;
    }
}







