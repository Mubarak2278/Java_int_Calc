package com.Mubarak;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {



        int number1;
        int number2;
        int number3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number");
        number1= scanner.nextInt();

        System.out.println("Input the second number");
        number2= scanner.nextInt();

        System.out.println("input the third number");
        number3 = scanner.nextInt();

        System.out.println("The product of the three number is = "+ number1 * number2 * number3);
    }

    }

