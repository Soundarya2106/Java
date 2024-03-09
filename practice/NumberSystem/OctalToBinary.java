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
public class OctalToBinary {
    public static void main(String[] args){
        int[] oct_values = {0, 1, 10, 11, 100, 101, 110, 111};
        int bin=0, oct, rem, i=1, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal number:");
        oct = sc.nextInt();
        temp = oct;
        while(oct!=0){
            rem=oct%10;
            bin=oct_values[rem]*i+bin;
            i*=1000;
            oct/=10;
        }
        System.out.println("The equivalent binary number of "+temp+" is "+bin);
    }
}
