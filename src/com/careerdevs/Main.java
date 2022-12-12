package com.careerdevs;

import com.careerdevs.intermediate.Browser;
import com.careerdevs.intermediate.Employee;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Hello World");
//        var textBox1 = new TextBox();
//        textBox1.setText("Box 1");
//        System.out.println(textBox1.text.toUpperCase());
//
//        var textBox2 = new TextBox();
//        textBox2.setText("Box 2");
//        System.out.println(textBox2.text);
//        var textBox2 = textBox1;
//        textBox2.setText("Hello World");
//        System.out.println(textBox1.text);



        var employee = new Employee(50_000,20);
//        employee.setBaseSalary (50_000);
//        employee.setHourlyRate(20);
        int  wage = employee.calculateWage();
        System.out.println(wage);

//       var browser = new Browser();


    }

}
