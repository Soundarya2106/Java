/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Strings;

/**
 *
 * @author ELCOT
 */
import java.util.Scanner;
public class StringRotate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String s = sc.next();
        System.out.print("enter a offset:");
        int offset = sc.nextInt();
        if(s==null || s.isEmpty()){
            System.out.println("Invalid!");
        }
        int len = s.length();
        offset %= len;
        while(offset<0){
            offset+=len;
        }
        String first = s.substring(0,offset);
        String second = s.substring(offset);
        String res = second + first;
        System.out.println("Rotated String: "+res);
    }
}
