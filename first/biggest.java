/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// BIGGEST OF 5 NUMBERS
package com.mycompany.first;
import java.util.Scanner;
public class biggest {
    public static void main(String[] args){
        int biggest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int n1=sc.nextInt();
        System.out.println("Enter Second Number:");
        int n2=sc.nextInt();
        System.out.println("Enter Third Number:");
        int n3=sc.nextInt();
        System.out.println("Enter Fourth Number:");
        int n4=sc.nextInt();
        System.out.println("Enter Fifth Number:");
        int n5=sc.nextInt();
        if(n1>n2 && n1>n3 && n1>n4 && n1>n5){
            biggest=n1;            
        }
        else if(n2>n1 && n2>n3 && n2>n4 && n2>n5){
            biggest=n2;
        }
        else if(n3>n1 && n3>n2 && n3>n4 && n3>n5){
            biggest=n3;
        }
        else if(n4>n1 && n4>n2 && n4>n3 && n4>n5){
            biggest=n4;
        }
        else{
            biggest=n5;
        }
        System.out.println("Biggest of 5 numbers:" + biggest);
    }    
}
