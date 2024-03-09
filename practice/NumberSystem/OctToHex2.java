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
public class OctToHex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalNumber = sc.next();
        sc.close();

        // Convert each octal digit to binary
        StringBuilder binaryNumber = new StringBuilder();
        for (int i = 0; i < octalNumber.length(); i++) {
            char octalDigit = octalNumber.charAt(i);
            int decimalValue = Character.getNumericValue(octalDigit);
            String binaryValue = Integer.toBinaryString(decimalValue);
            // Pad with leading zeros to ensure each group has 3 digits
            while (binaryValue.length() < 3) {
                binaryValue = "0" + binaryValue;
            }
            binaryNumber.append(binaryValue);
        }

        // Group binary digits into groups of 4
        int binaryLength = binaryNumber.length();
        int padding = binaryLength % 4;
        if (padding > 0) {
            padding = 4 - padding;
            for (int i = 0; i < padding; i++) {
                binaryNumber.insert(0, '0');
            }
        }

        // Convert binary to hexadecimal
        StringBuilder hexadecimalNumber = new StringBuilder();
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            String binaryGroup = binaryNumber.substring(i, i + 4);
            int decimalValue = Integer.parseInt(binaryGroup, 2);
            String hexDigit = Integer.toHexString(decimalValue);
            hexadecimalNumber.append(hexDigit);
        }

        System.out.println("Hexadecimal representation: " + hexadecimalNumber.toString().toUpperCase());
    }
}
 