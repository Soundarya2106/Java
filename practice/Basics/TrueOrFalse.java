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
public class TrueOrFalse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first integer:");
        int n1 = sc.nextInt();
        System.out.print("Enter a second integer:");
        int n2 = sc.nextInt();
        System.out.print("Enter a first integer:");
        int n3 = sc.nextInt();
        boolean b = true;
        if(n3==(n1+n2)){
            System.out.println("The result is "+b);
        }
        else{
            System.out.println("The result is "+(!b));
        }
    }
}
