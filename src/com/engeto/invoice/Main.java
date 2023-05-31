package com.engeto.invoice;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        String item = "Trekové boty sedmimílovky";
        int quantity = 3;
        double weight = 0.45;
        BigDecimal pricePerPiece = BigDecimal.valueOf(1800);
        //LocalDate dateOfIssue = LocalDate.of(2022,4,7);
        LocalDate datumFaktury = LocalDate.of(2022, 4, 7);
        boolean isDiscounted = true;
        double totalWeight = quantity*weight;

        System.out.println("Celková hmotnost zásilky= "+ totalWeight+" kg");
        BigDecimal totalPrice = pricePerPiece.multiply(BigDecimal.valueOf(quantity));
        totalPrice = totalPrice.add(BigDecimal.valueOf(45));
        System.out.println("Celková cena zásilky: "+ totalPrice+" Kč");

        if (isDiscounted) {
            System.out.println("Sleva ANO: "+ totalPrice+" Kč");
        }

        }

}
