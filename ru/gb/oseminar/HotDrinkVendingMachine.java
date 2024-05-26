package ru.gb.oseminar;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private final List<Product> products;

    public HotDrinkVendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт с названием %s не найден.", name));
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (Product product : products) {
            if (product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getName().equalsIgnoreCase(name) &&
                    hotDrink.getTemperature() == temperature) {
                    return hotDrink;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт с названием %s, объемом %d и температурой %d не найден.", name, volume, temperature));
    }
}
