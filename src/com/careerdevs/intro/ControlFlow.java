package com.careerdevs.intro;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        // Comparison Operators
//        int x=1;
//        int y =1;
//        System.out.println(x <= y);

        // Logical Operators

//        int  temperature =12;
//        boolean isWarm = temperature > 20 && temperature<30;
//        System.out.println(isWarm);

//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible  = (hasHighIncome ||  hasGoodCredit) && !hasCriminalRecord;
//       If Statement
//        int temp = 30;
//        if (temp > 30) {
//            System.out.println("It's a hot day ");
//            System.out.println("Drink water");
//        }
//        else if (temp > 20 )
//            System.out.println("Beautiful day");
//        else
//            System.out.println("Cold day");

//        int income = 120_000;
//        String className = income >100_000 ? "First" : "Economy ";
//        System.out.println(className);

        //       Switch Statement
//        String role = "admin";
//
//        switch (role){
//            case " admin ":
//                System.out.println("You're an admin");
//                break;
//            case " moderator ":
//                System.out.println("You're a moderator");
//                break;
//            default :
//                    System.out.println("You are a guest");
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Number :");
//        int number = scanner.nextInt();
//
//        if (number % 5 == 0 && number % 3 == 0)
//            System.out.println("FizzBuzz");
//        else if (number % 5 == 0)
//            System.out.println("Fizz");
//        else if (number % 3 == 0)
//            System.out.println("Buzz");
//        else
//            System.out.println(number);


//        For loops
//        for (int i = 5; i > 0; i--)
//            System.out.println("Hello World" +  i );


//        While loop

        Scanner scanner = new Scanner(System.in);
        String input  ="";
//        while (true){
//            System.out.println("Input : ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//            System.out.println(input);
//
//        }

//        do {
//            System.out.println("Input");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//
//        } while (!input.equals("quit"));

            String []  fruits ={"Apple","Mango", "Orange"};

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        for (String fruit : fruits)
            System.out.println(fruit);

    }
}
