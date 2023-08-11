package org.service;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DiscountService {
    public String getDiscount(int amount){
        String discountPercentage = "";
        if(amount > 5000 && amount < 10000){
            discountPercentage = "10%";
        } else if(amount > 10000) {
            discountPercentage = "15%";
        } else {
            discountPercentage = "NA";
        }
        return discountPercentage;
    }
}