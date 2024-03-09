/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

//PERIMETER AND AREA OF CIRCLE
//ALREADY GIVEN RADIUS = 7.5

public class circle {
    private static final double rad = 7.5;  //defining constant
    public static void main(String[] args){
       double perimeter = 2 * Math.PI * rad;
       double area = Math.PI * rad * rad;
       System.out.println("Perimeter of a Circle = "+ perimeter);
       System.out.println("Area of a Circle = "+ area);
    }    
}
