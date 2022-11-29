package com.careerdevs.intro;

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
        String role = "admin";

        switch (role){
            case " admin ":
                System.out.println("You're an admin");
                break;
            case " moderator ":
                System.out.println("You're a moderator");
                break;
            default :
                    System.out.println("You are a guest");
        }



    }
}
