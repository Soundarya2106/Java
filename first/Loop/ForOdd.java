/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first.Loop;
public class ForOdd {
    public static void main(String []args){
        System.out.println("Odd Numbers(1-100)");
        for(int i=1; i<=100; i++){
            if(i%2 != 0){
                System.out.print(i+" ");
            }
        }
    }
}
