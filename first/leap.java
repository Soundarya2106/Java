/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// LEAP YEAR OR NOT
package com.mycompany.first;
import java.util.Scanner;
public class leap {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Any Year:");
        int year = sc.nextInt();
        if((year%4)==0){
            System.out.println(year+ " is a Leap Year");
        }
        else{
            System.out.println(year+ " is not a Leap Year");
        }
    }
    
}
