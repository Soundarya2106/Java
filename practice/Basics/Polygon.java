/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Basics;

/**
 *
 * @author ELCOT
 */
import java.util.Scanner;
public class Polygon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sides on the Polygon:");
        double n = sc.nextDouble();
        System.out.print("Enter the length:");
        double s = sc.nextDouble();
        double area = (n * (Math.pow(s, 2)))/(4 * Math.tan((Math.PI/n)));
        System.out.println("The area of the Polygon:"+area);
    }
}
