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
public class TrailingZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while(num>=5){
            num = num / 5;
            count += num;
        }
        System.out.println("In the factorial of "+temp+" has "+count+" trailing zeros");
    }
}
