package org.service;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DiscountService {
    public String getDiscount(int amount){
        String discountPercentage = "";
        if(amount > 500 && amount < 10000){
            discountPercentage = "10%";
        } else {
            discountPercentage = "15%";
        }
        return discountPercentage;
    }
}