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
public class IntToHex {
    public static void main(String[] args){
        int temp, num, rem;
        String hex ="";
        char hexa[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a decimal number:");
        num = sc.nextInt();
        temp = num;
        while(num>0){
            rem = num % 16;
            hex = hexa[rem] + hex;
            num/=16;
        }
        System.out.println("The equiavalent hexamdecimal value of "+temp+" is: "+ hex);
    }
}
