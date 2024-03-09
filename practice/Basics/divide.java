/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/*
50/3
output:16
*/
import java.util.Scanner;
public class divide {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int n1 = sc.nextInt();
        System.out.print("Enter second number:");
        int n2 = sc.nextInt();
        int n3 = n1/n2;
        System.out.println(n3);
    }
}
