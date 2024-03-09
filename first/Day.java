/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ELCOT
 */
package com.mycompany.first;
import java.util.Scanner;
public class Day {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int day = sc.nextInt();
        switch(day){
            case 1 -> System.out.println("It's Sunday..!");
            case 2 -> System.out.println("It's Monday..!");
            case 3 -> System.out.println("It's Tuesday..!");
            case 4 -> System.out.println("It's Wednesday..!");
            case 5 -> System.out.println("It's Thursday..!");
            case 6 -> System.out.println("It's Friday..!");
            case 7 -> System.out.println("It's Saturday..!");
            default -> System.out.println("Invalid..!");      
        }
    }
}
