package com.careerdevs.intro;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class DataTypes {
    public static void main(String[] args) {
//        int age = 30 ;
//        age =35;
//        System.out.println(age);

//        2- Variables
//        int myAge = 30 ;
//        int herAge =myAge;
//        System.out.println(herAge);



//        3- Primitive Types
//         byte age = 30 ;
//         long viewsCount= 3_123_456_789L;
//         float price = 10.99F ;
//         char letter = 'A';
//          boolean isEligible = false;


//        4- Reference Types
//          byte age = 30 ;
//          Date  now =new Date();
//          System.out.println(now);

//        5- Primitive vs Reference Types

//        byte x=1;
//        byte y=x;
//        x=2;
//        System.out.println(y);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x=2;
        System.out.println(point2);


//        6- Strings

//        String message =new String("Hello World");
        String message = "  Hello World" + "!!";
//        message.endsWith("!!")
//        System.out.println( message);
//        System.out.println(message.endsWith("!!"));
//        System.out.println(message.startsWith("!!"));
//        System.out.println(message.length());
//        System.out.println(message.indexOf("i"));
//        System.out.println(message.replace("!","*"));
//        System.out.println(message.toLowerCase());
        System.out.println(message.trim());
        System.out.println( message);
//        7- Escape Sequences
//        8- Arrays
//        9- Multi-dimensional Arrays
//        10- Constants
//        11- Arithmetic Expressions
//        12- Order of Operations
//        13- Casting
//        14- The Math Class
//        15- Formatting Numbers
//        16- Reading Input
//        17- Project- Mortgage Calculator
//        18- Solution


    }
}
