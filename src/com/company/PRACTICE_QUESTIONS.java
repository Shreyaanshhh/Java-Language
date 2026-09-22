package com.company;
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

class PRACTICE_QUESTIONS {
    static void main(String[] args){

//        QUESTION 1. FINDING THE BOARDS PERCENTAGE OF 5 SUBJECTS ??????????

        Scanner sc = new Scanner(System.in);
        System.out.println("Taking inputs from User");
        System.out.println("1). BOARD PERCENTAGE CALCULATE");
        System.out.println("TELL ME THE MARKS SCORED BY YOU IN YOUR ALL SUBJECTS");
        System.out.println("PHYSICS MARKS :");
        float physics = sc.nextFloat();
        System.out.println("CHEMISTRY MARKS :");
        float chemistry = sc.nextFloat();
        System.out.println("MATHS MARKS :");
        float maths = sc.nextFloat();
        System.out.println("ENGLISH MARKS :");
        float english = sc.nextFloat();
        System.out.println("COMPUTER SCIENCE MARKS :");
        float cs = sc.nextFloat();
        float percentage = ((physics+chemistry+maths+english+cs)/(500))*100;
        System.out.println("YOUR BOARD PERCENTAGE IS :");
        System.out.println(percentage);
        System.out.println("CONGRRATS AND HAVE A SUCCESSFULL CAREER ");

        // QUESTION 2 : ADD THREE NUMBERS .....?

        System.out.println("2). ADD THREE NUMBERS ");
        int a = 12;
        int b = 123;
        int c = 232;
        int sum = a+b+c;
        System.out.println("Sum of the numbers is :");
        System.out.println(sum);
//
//        // QUESTION 3 . JAVA PROGRAM TO ASK USER NAME AND GREET THEM WITH HAVE A NICE DAY ????

        System.out.println("3). ASK AND GREET USER :");

        System.out.println("What is your NAME Sir ?");
        String name = sc.next();
        System.out.println("Hello " + name + " Have a nice day babe !");

//        // QUESTION 4 . JAVA PROGRAM TO CONVERT KM IN TO MILES
//
        System.out.println("4). Enter the distance which you want to convert in Miles");
        float km = sc.nextFloat();
        float miles = km*0.621371f;
        System.out.println("So " + km + " Kilometer is equals to " + miles);

        // QUESTION 5 . WRITE A JAVA PROGRAM TO CHECK WHETHER A NUMBER ENTERED BY USER IS INTEGER OR NOT ??????

        System.out.print("5). Enter the Integer : ");
        boolean M = sc.hasNextInt();

        System.out.println(" It will be always : " + M );

    }

}
