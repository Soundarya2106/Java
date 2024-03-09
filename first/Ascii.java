/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first;
import java.util.Scanner;
public class Ascii {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character:");
        char c = sc.next().charAt(0);
        System.out.println("Ascii of "+c+" is "+(int)c);
    }
}

