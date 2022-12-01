package com.careerdevs.intro;

public class CleanCoding {
    public static void main(String[] args) {
        String message= greetUser("Edouard","Fils");

    }

    public static  String greetUser(String firstName,String lastName){
        return "Hello " + firstName +" "+ lastName;

    }
}
