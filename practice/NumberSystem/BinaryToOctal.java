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
public class BinaryToOctal {
    public static void main(String[] args){
        int temp, bin, dec=0, rem, i=1, j=0;
        int oct[] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number:");
        bin = sc.nextInt();
        temp=bin;
        
        //BINARY TO DECIMAL
        while(bin!=0){
            rem = bin%10;
            dec = dec + rem * i;
            i*=2;
            bin/=10;
        }
        i=1;
        
        //DECIMAL TO OCTAL
        while(dec>0){
            oct[j++]=dec%8;
            dec/=8;
        }
        
        System.out.println("The equivalent octal value of "+temp+" is ");
        for(j=i-1;j>=0;j--){
            System.out.print(oct[j]);
        }
    }
}
