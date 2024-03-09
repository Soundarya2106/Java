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
public class Distance {
    private static final double rad = 6371.01;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the latitude of Coordinate-1:");
        double x1 = sc.nextDouble();
        System.out.print("Enter the longitude of Coordinate-1:");
        double y1 = sc.nextDouble();
        System.out.print("Enter the latitude of Coordinate-2:");
        double x2 = sc.nextDouble();
        System.out.print("Enter the longitude of Coordinate-2:");
        double y2 = sc.nextDouble();
        
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);
        
        double distance = rad *( Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)));
        System.out.println("The distamce between those points is: "+distance);
    }
}
