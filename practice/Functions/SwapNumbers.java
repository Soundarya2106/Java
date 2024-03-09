package com.mycompany.practice.Functions;
import java.util.Scanner;
public class SwapNumbers {
    public static void SwapWithoutTemp(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("\nAfter Swapping:");
        System.out.printf("a = %d and b = %d", a,b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping:");
        System.out.printf("a = %d and b = %d", a,b);
        SwapWithoutTemp(a, b);
    }
}
