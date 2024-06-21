package less1.practice;

import less1.practice.impl.*;
import less1.practice.impl.Package;

import java.time.LocalDate;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        Product bootle1 = new BottleOfWatter("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bootle2 = new BottleOfWatter("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, Package.GLASS.getMaterial(), 0.5F);

        VendingMachine vm = new WaterVendingMachine();
        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bootle1, bootle1, bootle1, bootle2, bootle2, bootle2));

        System.out.println(vm.getProducts());

        vm.getProduct("Родники");

        System.out.println(vm.getProducts());

        HotDrink teablack = new TeaDrink("чай черный", 15.30, LocalDate.of(2024, 6, 10),
                80, 0.3);
        HotDrink cappuccino = new CofeeDrink("капучино", 120, LocalDate.of(2024, 6, 11),
                95, 0.4);

        HotDrinkVendingMachine vmhot = new HotDrinkVendingMachine();

        vmhot.addProducts(List.of(teablack, teablack, teablack, cappuccino, cappuccino,cappuccino));

        System.out.println(vmhot.getProducts());

       vmhot.getProduct("капучино", 95, 0.4);

        System.out.println(vmhot.getProducts());


    }



}
