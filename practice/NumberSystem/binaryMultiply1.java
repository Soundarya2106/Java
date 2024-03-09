/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author ELCOT
 */
import java.util.Scanner;

public class binaryMultiply1 {
    static int binaryProduct(int b1, int b2) {
        int product = 0;
        int factor = 1;
        while (b2 > 0) {
            int bit = b2 % 10;
            if (bit == 1) {
                product = binaryAdd(product, b1 * factor);
            }
            b2 /= 10;
            factor *= 10;
        }
        return product;
    }

    static int binaryAdd(int a, int b) {
        int carry = 0;
        int result = 0;
        int factor = 1;

        while (a > 0 || b > 0 || carry > 0) {
            int bitA = a % 10;
            int bitB = b % 10;
            int sum = bitA + bitB + carry;
            result = (sum % 2) * factor + result;
            carry = sum / 2;
            a /= 10;
            b /= 10;
            factor *= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        long b1, b2, multiply;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first binary number:");
        b1 = sc.nextLong();
        System.out.print("Enter second binary number:");
        b2 = sc.nextLong();

        multiply = binaryProduct((int) b1, (int) b2);

        System.out.print("Product of two binary numbers: " + multiply);
    }
}

