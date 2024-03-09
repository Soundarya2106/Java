/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author ELCOT
 */
public class swap {
    public static void main(String[] args){
        int a = 10, b= 20;
        int temp;
        System.out.println("Before Swapping: a = "+a+", b = "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping: a = "+a+", b = "+b);
    }
}
