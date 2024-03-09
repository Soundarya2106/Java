/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Basics;

/**
 *
 * @author ELCOT
 */
public class divisible {
    public static void main(String[] args){
        System.out.println("divided by 3:");
        for(int i=1;i<=100;i++){
            if(i%3==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\ndivided by 5:");
        for(int i=1;i<=100;i++){
            if(i%5==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\ndivided by 3 and 5:");
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.print(i+" ");
            }
        }
    }
}
