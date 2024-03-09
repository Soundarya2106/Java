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

public class SqRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find square root:");
        double num = sc.nextDouble(); // Use double for input
        double res = sqrt(num); // Change function name to lowercase
        System.out.println("Square root of " + num + " = " + res);
    }

    public static double sqrt(double num) {
        if (num == 0 || num == 1) {
            return num;
        }

        double a = 0;
        double b = num;
        double epsilon = 1e-15; // Small value to check for accuracy

        while (Math.abs(a - b) > epsilon) {
            double mid = (a + b) / 2;
            if (mid * mid > num) {
                b = mid;
            } else {
                a = mid;
            }
        }
        return a;
    }
}
