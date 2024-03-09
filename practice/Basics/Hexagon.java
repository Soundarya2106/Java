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
public class Hexagon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length:");
        double s = sc.nextDouble();
        double area = (6 * Math.pow(s, 2))/(4 * Math.tan((Math.PI/6)));
        System.out.println("The area of the hexagon is: "+area);
    }
}
