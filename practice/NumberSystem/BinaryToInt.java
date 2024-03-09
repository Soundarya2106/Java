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
public class BinaryToInt {
    public static void main(String[] args){
        long temp, bin, num=0, i=1,rem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number:");
        bin = sc.nextLong();
        temp = bin;
        while(bin!=0){
            rem=bin%10;
            num=num+rem*i;
            i*=2;
            bin/=10;
        }
        System.out.println("The equivalent decimal number of "+temp+" is "+num);
    }
}
