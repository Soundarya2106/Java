/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Basics;
import java.util.Scanner;
public class PowerOfFour {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if(isPowerOfFour(num)){
            System.out.println(num+" is a power of 4");
        }else{
            System.out.println(num+" is not a power of 4");
        }
    }
    public static boolean isPowerOfFour(int num){
        if(num<=0){
            return false;
        }
        while(num>1){
            if(num%4!=0){
                return false;
            }
            num/=4;
        }
        return num==1;
    }
}
