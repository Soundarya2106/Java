/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Basics;

/**
 *
 * @author ELCOT
 */
public class SumOfPrimes {
    public static void main(String[] args){
        int limit = 100;
        int sum = 0;
        for(int i=0; i<=limit; i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        System.out.println("The sum of all prime till 100 is "+sum);
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; Math.sqrt(num)>=i;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}