/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Basics;
import java.util.Scanner;
public class SingleDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int temp = num;
        if(num>0){
            int n = (num==0?0:(num%9==0?0:num%9));
            System.out.println("The single digit sum of "+temp+" is "+n);
        }
    }
}
