/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author ELCOT
 */
import java.util.Scanner;
public class binaryAddition2 {
    public static void main(String[] args){
        long b1, b2;
        int i=0, rem=0;
        int[] sum = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first binary number:");
        b1 = sc.nextLong();
        System.out.print("Enter second binary number:");
        b2 = sc.nextLong();
        while(b1!=0 || b2!=0){
            sum[i++] = (int)((b1%10 + b2%10 + rem)%2);
            rem = (int)((b1%10 + b2%10 + rem)/2);
            b1/=10;
            b2/=10;
        }
        if(rem!=0){
            sum[i++]=rem;
        }
        --i;
        System.out.println("Sum of two binary numbers:");
        while(i>=0){
            System.out.print(sum[i--]);
        }
    }
}
