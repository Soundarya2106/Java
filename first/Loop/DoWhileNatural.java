/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first.Loop;
public class DoWhileNatural {
    public static void main(String[] args){
        System.out.println("Natural Numbers(1-100)");
        int i=1;
        do{
            System.out.print(i+" ");
            i++;
            if(i==51){
                System.out.println();
            }
        }while(i<=100);
    }
}
