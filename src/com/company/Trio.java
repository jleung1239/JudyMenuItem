package com.company;

public class Trio implements MenuItem{
    Sandwich sandwich;
    Salad salad;
    Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink){
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName(){
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }

    public double getPrice() {
        double price1 = sandwich.getPrice();
        double price2 = salad.getPrice();
        double price3 = drink.getPrice();

        double a = 0;
        double b = 0;

        if (price1 > price2) {
            if (price1 > price3) {
                a = price1;
                if (price2 > price3) {
                    b = price2;
                } else {
                    b = price3;
                }

            } else if (price3 > price1) {
                a = price2;
                b = price3;

            }


        }
        else if ((price2 > price1) && (price2 > price3)){
            a = price2;
            if (price3 > price1) {
               b = price3;
            }
            else {
                b = price1;
            }
        }
        else if ((price3 > price1) && (price3 > price2)) {
            a = price3;
            if (price1 > price2){
                b = price1;
            }
            else
            {
                b = price2;
            }
        }
        return a + b;
    }
}
