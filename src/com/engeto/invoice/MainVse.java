package com.engeto.invoice;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MainVse {

    private static final double DISCOUNT = 0.05;
    private static final BigDecimal TRANSPORT_PRICE=BigDecimal.valueOf(45);

    public static void main(String[] args) {
        String item = "Trekové boty Sedmimílovky";
        int quantity = 3;
        double weight = 0.45;
        BigDecimal pricePerPiece = BigDecimal.valueOf(1800);
        LocalDate dateOfIssue = LocalDate.of(2022,4,7);
        boolean isDiscounted = true;

        double totalWeight = quantity*weight;
        System.out.println("Celková hmotnost zásilky: "
                + totalWeight+" kg");

        BigDecimal totalPrice =
                computeTotalPrice(quantity, pricePerPiece, isDiscounted);
        System.out.println("Celková cena zásilky: "
                + totalPrice+" Kč");

        quantity = 5;
        pricePerPiece = BigDecimal.valueOf(2000);
        totalPrice = computeTotalPrice(
                quantity, pricePerPiece, isDiscounted);
        System.out.println("Celková cena zásilky: "+ totalPrice+" Kč");

        for (int i = 0; i < quantity; i++) {
            System.out.println(item);
        }

    }

    private static BigDecimal computeTotalPrice(
            int quantity, BigDecimal pricePerPiece,
            boolean isDiscounted
    ) {
        BigDecimal totalPrice =
                pricePerPiece.multiply(BigDecimal.valueOf(quantity));
        totalPrice = totalPrice.add(TRANSPORT_PRICE);
        if (isDiscounted) {
            totalPrice = totalPrice.multiply(
                    BigDecimal.valueOf(1-DISCOUNT));
        }
        return totalPrice;
    }
}