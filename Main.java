package org.example.hw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Поиск горячих напитков");
        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Coffee", new BigDecimal(3), 0.3, 90),
                new HotDrinks("Tea", new BigDecimal(1), 0.5, 80),
                new HotDrinks("Milk", new BigDecimal(3), 1.0, 50)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по названию: " + vmHotDrinks.getProduct("Tea"));
        System.out.println("Поиск по цене <=: " + vmHotDrinks.getProduct(new BigDecimal(2.0)));
        System.out.println("Поиск по температуре <=: " + vmHotDrinks.getProduct(70));
    }
}