/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author ELCOT
 */
public class binaryMultiply2 {
    public static void main(String[] args){
        String b1="110", b2="101";
        int num1 = Integer.parseInt(b1,2);
        int num2 = Integer.parseInt(b2, 2);
        int product = num1 * num2;
        String result = Integer.toBinaryString(product);
        System.out.println("Product of two binary numbers: "+result);
    }
}
