/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Basics;

/**
 *
 * @author ELCOT
 */
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if(String.valueOf(num).length()<2){
            System.out.println("Enter number upto 2 digits..!");
            System.out.print("\nEnter a number:");
            num = sc.nextInt();
        }
        int temp = num;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum = sum + rem;
            num/=10;
        }
        System.out.println("Sum of "+temp+" is "+sum);
    }
}
