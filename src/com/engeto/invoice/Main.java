package com.engeto.invoice;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        String item = "Trekové boty sedmimílovky";
        int quantity = 3;
        double weight = 0.45;
        BigDecimal pricePerPiece = BigDecimal.valueOf(1800);
        LocalDate datumFaktury = LocalDate.of(2022, 4, 7);
        datumFaktury = LocalDate.now();

        //Dodělat časový interval slevy !!! if-now + kombinace datumů

        boolean isDiscounted = true;
        double totalWeight = quantity*weight;
        String discountProcenta = "10%";
        double discount = 0.9;

        System.out.println(item);
        System.out.println("Celková hmotnost zásilky: "+ totalWeight+" kg");
        BigDecimal totalPrice = pricePerPiece.multiply(BigDecimal.valueOf(quantity));
        //totalPrice = totalPrice.add(BigDecimal.valueOf(45));
        System.out.println("Celková cena zásilky: "+ totalPrice+" Kč");

        BigDecimal totalPriceDiscount = totalPrice.multiply(BigDecimal.valueOf(discount));
        if (isDiscounted) {
            System.out.println("Sleva ANO, cena po slevě " + discountProcenta + ": " + totalPriceDiscount+" Kč ");
            System.out.println("Datum faktury:" + datumFaktury);
        }

        }

}
