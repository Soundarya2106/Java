package com.mycompany.first;
import java.util.Scanner;
public class Month {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int month = sc.nextInt();
        switch(month){
            case 1 -> System.out.println("It's January..!");
            case 2 -> System.out.println("It's February..!");
            case 3 -> System.out.println("It's March..!");
            case 4 -> System.out.println("It's April..!");
            case 5 -> System.out.println("It's May..!");
            case 6 -> System.out.println("It's June..!");
            case 7 -> System.out.println("It's July..!");
            case 8 -> System.out.println("It's August..!");
            case 9 -> System.out.println("It's September..!");
            case 10 -> System.out.println("It's October..!");
            case 11 -> System.out.println("It's November..!");
            case 12 -> System.out.println("It's December..!");
            default -> System.out.println("Invalid..!");
        }
    }
}
