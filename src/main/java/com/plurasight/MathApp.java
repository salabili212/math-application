package com.plurasight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1
        double bobSalary = 30.42,garySalary = 45.32,highestSalary;
        highestSalary = Math.max(bobSalary , garySalary);
        System.out.println("The highestSalary is :$"+ highestSalary);


        //Question 2
        double carPrice = 40000.00, truckPrice = 60000.00;
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is $"+smallestPrice);


    }
}
