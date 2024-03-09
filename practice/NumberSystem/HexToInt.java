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
public class HexToInt {
    public static void main(String[] args){
        int val =0;
        String hex = "0123456789ABCDEF";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal Value:");
        String hd = sc.next();
        hd = hd.toUpperCase();
        for(int i=0; i<hd.length();i++){
            char c = hd.charAt(i);
            int d = hex.indexOf(c);
            val=16*val+d;
        }
        System.out.println("The equivalent decimal number of "+hd+" is "+val);
    }
}
