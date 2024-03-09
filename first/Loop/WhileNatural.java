/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first.Loop;
public class WhileNatural {
    public static void main(String[] args){
        System.out.println("Natural Number(1-100)");
        int i=1;
        while(i<=100){
            System.out.print(i+" ");
            i++;
            if(i==51){
                System.out.println();
            }
        }
    }
}
