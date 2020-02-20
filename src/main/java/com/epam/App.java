package com.epam;

/**
 * Hello world!
 *
 */

class Interests{
    double simpleInterest(double money, double interestRate, int time){
        /*
        money = Principal amount
        interestRate = rate of interest
        time = time period for which simple interest is to be calculated
         */
        double extraMoney = (money * interestRate * time) / 100;
        return money+extraMoney ;
    }

    double compoundInterest(double money, double interestRate, int time, int timePeriod){
        /*
        money = Principle amount
        interestRate = Rate of interest
        time = time period for which compound interest is to be calculated
        timePeriod = unit time period for interest
         */
        double amount = money * Math.pow(1 + (interestRate / timePeriod), timePeriod * time) ;
        return amount ;
    }
}

class HouseConstruction {

    double areaOfHouse(double length, double breadth) {
        return length * breadth;
    }

    double constructionCost(double length, double breadth, String material) {
        material = material.toLowerCase();
        switch(material) {
            case "standard material":
                return 1200 * areaOfHouse(length, breadth);
            case "above standard material":
                return 1500 * areaOfHouse(length, breadth);
            case "high standard material":
                return 1800 * areaOfHouse(length, breadth);
            case "high standard material and fully automated home":
                return 2500 * areaOfHouse(length, breadth);
            default:
                return 0.0;
        }
    }
}

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
