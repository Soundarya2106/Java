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
public class HexToBinary {
    public static int HexToDecimal(String s){
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal value:");
        String hd = sc.next();
        int dec = HexToDecimal(hd); 
        int bin[] = new int[100];
        int i=1;
        while(dec!=0){
            bin[i++]=dec%2;
            dec/=2;
        }
        System.out.println("The equivalent binary number of "+hd+" is ");
        for(int j=i-1;j>=0;j--){
            System.out.print(bin[j]);
        }
    }
}
