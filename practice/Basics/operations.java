/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author ELCOT
 */
public class operations {
    public static void main(String[] args){
    int a = -5+8*6;   //precedence = * -> +
    int b = (55+9)%9; //precedence = () -> + -> %
    int c = 20+-3*5/8; //precedence = * -> / -> +
    int d = 5+15/3*2-8%3; //BODMAS
    System.out.println("-5+8*6 = "+a);
    System.out.println("(55+9)%9 = "+b);
    System.out.println("20+-3*5/8 = "+c);
    System.out.println("5+15/3*2-8%3 = "+d);
}
}