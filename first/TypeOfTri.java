/*If the three sides of a triangle are entered through the keyboard, 
write a program to check whether the triangle is isosceles, equilateral, scalene or right angled triangle.
 */
package com.mycompany.first;
import java.util.Scanner;
public class TypeOfTri {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side:");
        int a = sc.nextInt();
        System.out.print("Enter second side:");
        int b = sc.nextInt();
        System.out.print("Enter third side:");
        int c = sc.nextInt();
        if(a==b && a==c && b==c){
            System.out.println("Equilateral Triangle!");
        }
        else if(a==b || a==c || b==c){
            System.out.println("Isosceles Triangle!");
        }
        else if((a*a)+(b*b)==(c*c)){
            System.out.println("Right angled Triangle!");
        }
        else{
            System.out.println("Scalene Triangle!");
        }
    }
}
