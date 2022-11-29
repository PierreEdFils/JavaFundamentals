package com.careerdevs.intro;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
//        int name = 30 ;
//        name =35;
//        System.out.println(name);

//        2- Variables
//        int myAge = 30 ;
//        int herAge =myAge;
//        System.out.println(herAge);



//        3- Primitive Types
//         byte name = 30 ;
//         long viewsCount= 3_123_456_789L;
//         float price = 10.99F ;
//         char letter = 'A';
//          boolean isEligible = false;


//        4- Reference Types
//          byte name = 30 ;
//          Date  now =new Date();
//          System.out.println(now);

//        5- Primitive vs Reference Types

//        byte x=1;
//        byte y=x;
//        x=2;
//        System.out.println(y);

//        Point point1 = new Point(1,1);
//        Point point2 = point1;
//        point1.x=2;
//        System.out.println(point2);


//        6- Strings

////        String message =new String("Hello World");
//        String message = "  Hello World" + "!!";
//        message.endsWith("!!")
//        System.out.println( message);
//        System.out.println(message.endsWith("!!"));
//        System.out.println(message.startsWith("!!"));
//        System.out.println(message.length());
//        System.out.println(message.indexOf("i"));
//        System.out.println(message.replace("!","*"));
//        System.out.println(message.toLowerCase());
//        System.out.println(message.trim());
//        System.out.println( message);
//        7- Escape Sequences

//        System.out.println("Hello \"Ed\"");
//        c: \Windows\...
//        System.out.println("c: \\ Windows\\...");
//        System.out.println("c: \n Windows\\...");

//        System.out.println("c: \t Windows\\...");

//        8- Arrays
//        int [] numbers =  new int[5];
//        numbers [0] = 1;
//        numbers [1] = 2;
//        int [] numbers ={ 2, 3, 5, 1, 4 };
//        Arrays.sort (numbers);
//        System.out.println(numbers);
//        System.out.println(numbers.length);

//        System.out.println(Arrays.toString(numbers));

//        9- Multi-dimensional Arrays
//            int [] [] numbers = new int [2][3];
//        int [] [] numbers = {{1,2,3},{4,5,6 }};
//            numbers [0][0] =1;
//        System.out.println(Arrays.deepToString(numbers));
//        10- Constants
//         final float pi =3.14F;
//        pi =1;

//        11- Arithmetic Expressions
//           double  result = ( double)10 / ( double) 3 ;
//            System.out.println(result);
//             int x=1;
//             int y = x++;
//                 x+=2;
//        System.out.println(x);
//        System.out.println(y);

//        12- Order of Operations

//        int x = (10 +3 )*2;
//        System.out.println(x);
//        13- Casting

//        double  x =1.1;
//        int y = (int) x +2;
//
//        String x = "1";
//        int y = Integer.parseInt(x)+2;
//        System.out.println(y);
//        14- The Math Class
//
//        double result = Math.round (Math.random()*100);
//        System.out.println(result);

//        15- Formatting Numbers
//        NumberFormat percent =  NumberFormat.getPercentInstance();
//        String result =percent.format(0.1);
//        System.out.println(result);


//        16- Reading Input
//        Scanner  scanner= new Scanner(System.in);
//        System.out.print("Name : ");
//        String name = scanner.nextLine();
//        System.out.println("You are "+ name);
//        17- Project- Mortgage Calculator

//        Scanner  scanner= new Scanner(System.in);
//        System.out.print("Principal  : ");
//        int principal = scanner.nextInt();
//        System.out.print("Annual Interest rate : ");

//        18- Solution


       String message = greetUser("Pierre", "Fils");



    }
    public  static String greetUser(String firstName,String lastName){
       return "Hello "  + firstName + "" + lastName ;
    }
}
