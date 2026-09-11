package Session2.assignment02;

public class RetailBillingEngine {
    public static void main(String[] args) {

        String item1 = "Mechanical Keyboard";
        double price1 = 85.50;
        int quantity1 = 2;

        String item2 = "USB-C Multiport Hub";
        double price2 = 34.99;
        int quantity2 = 1;

        String item3 = "128GB Flash Drive";
        double price3 = 18.75;
        int quantity3 = 3;

        double subtotal1 = price1 * quantity1;
        double subtotal2 = price2 * quantity2;
        double subtotal3 = price3 * quantity3;

        double grossSubtotal = subtotal1 + subtotal2 + subtotal3;
        double discountRate = grossSubtotal > 150.00 ? 0.08 : 0.0;
        double discountAmount = grossSubtotal * discountRate;
        double taxableAmount = grossSubtotal - discountAmount;
        double salesTax = taxableAmount * 0.075;
        double total = taxableAmount + salesTax;
        int totalCents = (int) (total * 100);
        int loyaltyPoints = (int) (total / 10);


        System.out.println("+========================================================================+");
        System.out.println("|                     APTECH TECH & HARDWARE STORE                       |");
        System.out.println("|                          CASH SALE INVOICE                             |");
        System.out.println("+========================================================================+");
        System.out.printf("%-25s %12s %5s %20s%n",
                "ITEM DESCRIPTION", "UNIT PRICE", "QTY", "LINE TOTAL");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-25s $%10.2f %8d $%12.2f%n",
                item1, price1, quantity1, subtotal1);
        System.out.printf("%-25s $%10.2f %8d $%12.2f%n",
                item2, price2, quantity2, subtotal2);
        System.out.printf("%-25s $%10.2f %8d $%12.2f%n",
                item3, price3, quantity3, subtotal3);

        System.out.println("--------------------------------------------------------------------------");

        System.out.printf("%-55s $%12.2f%n", "Gross Subtotal", grossSubtotal);
        System.out.printf("%-55s $%12.2f%n",
                "Promotional Discount (8%)", -discountAmount);

        System.out.printf("%-55s $%12.2f%n",
                "Taxable Amount", taxableAmount);

        System.out.printf("%-55s $%12.2f%n",
                "VAT / Sales Tax (7.5%)", salesTax);

        System.out.println("==========================================================================");

        System.out.printf("%-55s $%12.2f%n", "FINAL AMOUNT DUE", totalCents / 100.0);

        System.out.println("==========================================================================");

        System.out.printf("Total Amount in Cents (Explicit Cast to int): %d cents%n", totalCents);
        System.out.printf("Loyalty Points Earned (1 point per whole $10): %d points%n", loyaltyPoints);
        System.out.println("Thank you for shopping at Aptech Tech Store!");

    }
}
