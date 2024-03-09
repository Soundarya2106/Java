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
public class ReverseOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        char s[] = sc.nextLine().toCharArray();
        System.out.println("Reverse of a String:");
        for(int i = s.length-1; i>=0; i--){
            System.out.print(s[i]);
        }
    }
}
