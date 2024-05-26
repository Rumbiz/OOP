package ru.gb.oseminar;
import ru.gb.oseminar.*;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new HotDrink("Черный чай", 2.5, 90));
        products.add(new HotDrink("Зеленый чай", 3.0, 85));
        products.add(new HotDrink("Кофе", 4.0, 95));

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine(products);

        HotDrink hotDrink1 = vendingMachine.getProduct("Черный чай", 0, 90);
        System.out.println(hotDrink1);

        HotDrink hotDrink2 = vendingMachine.getProduct("Кофе", 0, 95);
        System.out.println(hotDrink2);
    }
}
