package com.aptech.cafe;;

public class CafeApp {

    public static void main(String[] args) {

        MenuItem[] menu = {
                new MenuItem("Espresso", 2.50),
                new MenuItem("Muffin", 3.25),
                new MenuItem("Sandwich", 5.75)
        };

        System.out.println("=== APTECH CAFE RECEIPT ===");

        double subtotal = 0;

        for (MenuItem item : menu) {
            System.out.println(item);
            subtotal += item.getPrice();
        }

        double tax = subtotal * MenuItem.TAX_RATE;
        double total = subtotal + tax;

        System.out.println("---------------------------------------------");
        System.out.printf("%-36s $%6.2f%n", "Subtotal", subtotal);
        System.out.printf("%-36s $%6.2f%n", "Tax (8%)", tax);
        System.out.printf("%-36s $%6.2f%n", "TOTAL", total);
        System.out.println(
                "Distinct items defined on menu: "
                        + MenuItem.getItemsOnMenu()
        );
    }
}
