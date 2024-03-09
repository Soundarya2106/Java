/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Patterns;

/**
 *
 * @author ELCOT
 */import java.util.Scanner;

public class StairCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of coins:");
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int coins = 1;
        while (n > 0) {
            if (n >= coins) {
                printRow(row, coins);
                n -= coins;
                row++;
                coins++;
            } else {
                printRow(row, n);
                n = 0;
            }
        }
    }

    public static void printRow(int row, int coins) {
        for (int i = 1; i <= coins; i++) {
            System.out.print("* ");  // Use "print" instead of "println" to print asterisks on the same line
        }
        System.out.println();  // Add a newline after printing the row
    }
}
