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

        //Question 3
        float r = 7.25f;
        double area = (r * r) * Math.PI;
        System.out.println("The area of the circle is: "+area);

        //Question 4
        float set = 5.00f;
        double squareRoot = Math.sqrt(set);
        System.out.println("The quare root of the set "+set +" is "+squareRoot);

        //Question 5
        int x1 = 5, x2 = 85, y1 = 10, y2 = 50;
        double distance = Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println("The distance is " + distance);

        //Question 6
        float number = -3.8f;
        System.out.println("The absloute value of the number "+ number + " is "+Math.abs(number));


        //Question 7
        int random =(int) (Math.random() * 2);
        System.out.println("The random number is :" + random);

        //Question 8
        int days = 24;
        int hoursInDays = days * 24;
        int minutesInDays = hoursInDays * 60;
        System.out.println("There are " + minutesInDays + " in " + days +" days.");





    }
}
