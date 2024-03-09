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
public class BinaryToHex {
    public static void main(String[] args){
        int temp, bin, dec=0, rem,rem2,i=1;
        char hexa[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hex ="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente a binary number:");
        bin = sc.nextInt();
        temp=bin;
        
        //BINARY TO DECIMAL
        while(bin!=0){
            rem=bin%10;
            dec=dec+rem*i;
            i*=2;
            bin/=10;
        }
        
        //DECIMAL TO HEXADECIMAL
        while(dec>0){
            rem2=dec%16;
            hex=hexa[rem2]+hex;
            dec/=16;
        }
        System.out.println("The equivalent hexadecimal valur of "+temp+" is "+hex);
    }
}
