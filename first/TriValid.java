/*
If the three sides of a triangle are entered through the keyboard, 
write a program to check whether the triangle is valid or not. 
The triangle is valid if the sum of two sides is greater than the largest of the three sides.
*/
package com.mycompany.first;
import java.util.Scanner;
public class TriValid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side:");
        int a = sc.nextInt();
        System.out.print("Enter second side:");
        int b = sc.nextInt();
        System.out.print("Enter third side:");
        int c = sc.nextInt();
        if((a+b)>c || (b+c)>a || (a+c)>b){
            System.out.println("Triangle is valid..!");
        }
        else{
            System.out.println("Triangle is not valid..!");
        }
    }
}
