package com.mycompany.first;

import java.util.Scanner;

public class SwitchChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Letter:");
        char day = sc.next().charAt(0);
        switch(day){
            case 'S' -> System.out.println("It's Sunday..!");
            case 'M' -> System.out.println("It's Monday..!");
            case 'T' -> System.out.println("It's Tuesday..!");
            case 'W' -> System.out.println("It's Wednesday..!");
            case 't' -> System.out.println("It's Thursday..!");
            case 'F' -> System.out.println("It's Friday..!");
            case 's' -> System.out.println("It's Saturday..!");
            default -> System.out.println("Invalid..!");      
        }
    }
}
