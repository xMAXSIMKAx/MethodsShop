package methodsShop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ExpertStore\n---------------------------\n" +
                "Enter your purchase amount to receive discounts: ");
        double purchaseAmount = scanner.nextDouble();

        double discount = calculateDiscount(purchaseAmount);

        double totalAmount = calculateTotalAmount(purchaseAmount, discount);

        displayInfo(purchaseAmount, discount, totalAmount);

    }

    public static double calculateDiscount(double purchasesAmount) {
        if (purchasesAmount <= 5000) {
            return purchasesAmount * 0.05;
        } else if (purchasesAmount <= 10000) {
            return purchasesAmount * 0.10;
        } else {
            return purchasesAmount * 0.15;
        }

    }

    public static double calculateTotalAmount(double purchasesAmount, double discount) {
        return purchasesAmount - discount;
    }

    public static void displayInfo(double purchasesAmount, double discount, double totalAmount) {
        System.out.println("Total purchase amount: " + formatCurrency(purchasesAmount));
        System.out.println("Discount amount: " + formatCurrency(discount));
        System.out.println("Amount due: " + formatCurrency(totalAmount));
    }

    public static String formatCurrency(double amount) {
        return String.format("%.2f", amount);
    }

}