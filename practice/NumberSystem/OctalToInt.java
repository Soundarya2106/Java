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
public class OctalToInt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int temp,oct, dec=0, rem, i=1;
        System.out.print("Enter an octal number:");
        oct = sc.nextInt();
        temp = oct;
        while(oct!=0){
            rem = oct % 10;
            dec = dec + rem*i;
            i*=8;
            oct/=10;
        }
        System.out.print("The equivalent decimal number of "+temp+" is "+dec);
    }
}
