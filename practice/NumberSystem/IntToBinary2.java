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
public class IntToBinary2 {
    public static void main(String[] args){
        int num, quot, i=0, j;
        int bin[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        num = sc.nextInt();
        quot = num;
        while(quot!=0){
            bin[i++]=quot%2;
            quot/=2;
        }
        System.out.println("The equivalent binary number of "+num+" is ");
        for(j=i-1;j>=0;j--){
            System.out.print(bin[j]);
        }
                
    }
}
