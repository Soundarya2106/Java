/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Basics;

/**
 *
 * @author ELCOT
 */
public class FizzBuzz {
    public static void main(String[] args){
        for(int i=1; i<=100; i++){
            if(i%3==0 && i%5==0){
                System.out.printf("\n%d: FizzBuzz",i);
            }
            else if(i%3==0){
                System.out.printf("\n%d: Fizz", i);
            }
            else if(i%5==0){
                System.out.printf("\n%d: Buzz", i);
            }
            else{
                System.out.printf("\n%d", i);
            }
        }
    }
}