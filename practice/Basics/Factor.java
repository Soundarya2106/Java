/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Basics;

/**
 *
 * @author ELCOT
 */
public class Factor {
    public static void main(String[] args){
        int num = 25;
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\nTotal no. of factor of "+num+" is "+count);
    }
}
