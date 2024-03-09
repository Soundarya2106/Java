/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Basics;

/**
 *
 * @author ELCOT
 */
public class Reapeat {
    public static void main(String[] args){
        int n = 9;
        while(n>1){
            if(n%2==0){
                n/=2;
            }
            else{
                n=(3*n+1);
            }
        }
        System.out.println("the value of n is "+n);
    }
}
