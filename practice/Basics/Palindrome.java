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
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(num>0){
            int rem = num % 10;
            sum = (sum*10) + (rem);
            num/=10;
        }
        if(temp==sum){
            System.out.println(temp+" is a Palindrome");
        }
        else{
            System.out.println(temp+" is not a Palindrome");
        }
    }
}
