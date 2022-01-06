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

        /*.........Write a java program to print multiplication table...........*/
        System.out.print("please enter a table which you want to print: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       /* int i=1;
        while(i<=10){
            System.out.println(number + " * " + i + " = " + number*i);
            i++;
        }*/
        for (int j = 1; j <= 10; j++) {
            System.out.println(number + " * " + j + " = " + number*j);
        }
    }

}
