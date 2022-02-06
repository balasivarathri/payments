package com.company.payments;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*--------------------Write a java program to print even numbers between 1 to 100 by using for loop-----------------*/
        /* 1st method */
       /* for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }*/
        /*2nd method */
        /*for (int i = 1; i <= 100; i+=2) {
            System.out.print(i + " ");
        }*/

        /*--------------------Write a java program to print odd numbers between 1 to 100 by using for loop-----------------*/
        /* 1st method */
        /*for (int i = 100; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }*/
        /*2nd method */
        /*for (int i = 99; i >= 1; i-=2) {
            System.out.print(i + " ");
        }*/

        /*--------------------Write a java program to print even numbers between 1 to 100 by using while loop-----------------*/
        /*int i = 1;
        while (i < 100) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }*/

        /*--------------------Write a java program to reverse a string by using for loop-----------------*/
       /* Scanner s = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = s.nextLine().toCharArray();
        System.out.print("The Reverse of given string is: ");
        for(int i=letters.length-1;i>=0;i--){
            System.out.print(letters[i]);
        }*/

        /*--------------------Write a java program to reverse a string by using while loop-----------------*/
        /*Scanner s1 = new Scanner(System.in);
        System.out.print("Input a string: ");
        String reverse = s1.nextLine();
        int i = reverse.length()-1;
        System.out.print("The Reverse of given string is: ");
        while (i>=0){
            System.out.print(reverse.charAt(i));
            i--;
        }*/

        /*.........Write a java program to reverse a string by using String Buffer...........*/
        /*String n = s.nextLine();
        StringBuffer sbf = new StringBuffer(n);
        sbf.reverse();
        System.out.print("Reverse string is: "+sbf);*/

        //.........Write a java program to print multiplication table...........

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        int number = sc.nextInt();
       /* for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }*/
        //By using while loop
        int j=1;
        while(j<=10){
            System.out.println(number + " X " + j + " = " + number * j);
            j++;
        }
        System.out.println("done");

        /*.........Write a java program to calculate all maths operations by using if else ...........*/
/*        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter numbers for calculation: ");
        double d1 = sc.nextDouble();
        char op = sc.next().charAt(0);
        //System.out.println("Please enter second number: ");
        double d2 = sc.nextDouble();

        if(op == '+'){
            System.out.println("Addition of two number are: " + (int)(d1+d2));
        }
        else if(op == '-'){
            System.out.println("Subsctraction of two number are: " + (int)(d1-d2));
        }
        else if(op == '/'){
            System.out.println("Division of two number are: " + (d1/d2));
        }
        else if(op == '*'){
            System.out.println("Multiplication of two number are: " + (int)(d1*d2));
        }
        else{
            System.out.println("no calculation required");
        }*/
    }

}
