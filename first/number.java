/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//POSITIVE OR NEGATIVE OR ZERO
package com.mycompany.first;
import java.util.Scanner;
public class number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int num = sc.nextInt();
        if(num>0){
            System.out.println(num + " is a Postive Integer");
        }
        else if(num<0){
            System.out.println(num + " is a Negative Integer");
        }
        else{
            System.out.println("It is a Zero");
        }
    }
    
}
