/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first;
import java.util.Scanner;
public class IfCondition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an ASCII value:");
        int a = sc.nextInt();
        if(a>=65 && a<=90){
            System.out.println("It is a Captial Letter..!");
            System.out.println(a+" : "+(char)a);
        }
        else if(a>=97 && a<=122){
            System.out.println("It is a Small Letter..!");
            System.out.println(a+" : "+(char)a);
        }
        else if(a>=48 && a<=57){
            System.out.println("It is a Number..!");
            System.out.println(a+" : "+(char)a);
        }
        else if((a>=0 && a<=47) || (a>=58 && a<=64) || (a>=91 && a<=96) || (a>=123 && a<=127)){
            System.out.println("It is a Special character..!");
            System.out.println(a+" : "+(char)a);
        }
        else{
            System.out.println("Invalid..!");
        }
    }
}
