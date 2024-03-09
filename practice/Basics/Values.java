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
public class Values {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first range:");
        int x = sc.nextInt();
        System.out.print("Enter second range:");
        int y = sc.nextInt();
        System.out.print("Enter divider number:");
        int z = sc.nextInt();
        int count=0;
        for(int i=x; i<=y; i++){
            if(i%z==0){
                count++;
            }
        }
        System.out.println("The number of divisibles between "+x+" and "+y+" is "+count);
    }
}
