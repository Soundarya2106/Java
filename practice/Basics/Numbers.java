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
public class Numbers {
    public static void print_word(int num){
        int x, y, z;
        String arr[] = {"ZERO", "ONE" , "TWO" , "THREE" , "FOUR" , "FIVE" , "SIX" , "SEVEN" , "EIGHT" , "NINE"};
        if(num < 10){
            System.out.println(arr[num]);
        }
        else if(num<100){
            x = num / 10;
            y = num % 10;
            System.out.println(arr[x]+" "+arr[y]);
        }
        else{
            x = num / 100;
            y = (num - x * 100)/10;
            z = num - x * 100 - y * 10;
            System.out.println(arr[x]+" "+arr[y]+" "+arr[z]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;
        while(num!=0){
            int rem = num % 10;
            sum = sum + rem;
            num/=10;
        }
        System.out.println("the sum of digits is: "+sum);
        print_word(sum);
    }
}
