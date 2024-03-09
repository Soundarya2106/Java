/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

//ADD TWO BINARY NUMBERS
public class binaryAddition1 {
    public static void main(String[] args){
    String x = "10011", y = "11100";
    int num1 = Integer.parseInt(x, 2);
    int num2 = Integer.parseInt(y, 2);
    int sum = num1+num2;
    String res = Integer.toBinaryString(sum);
    System.out.println("First binary number: "+ x);
    System.out.println("Second binary number: "+ y);
    System.out.println("Sum of Two Binary Numbers: "+res);
}
}