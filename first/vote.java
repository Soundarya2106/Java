/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//VOTE ELIGIBILITY
package com.mycompany.first;
import java.util.Scanner;
public class vote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You are Eligible for Voting..!");
        }
        else{
            System.out.println("You are not Eligible for Voting..!");
        }
    }
}
