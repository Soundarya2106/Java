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
public class SecToHMS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Seconds:");
        int sec = sc.nextInt();
        int s = sec%60;
        int h = sec/60;
        int m = h%60;
        h/=60;
        System.out.print(h+":"+m+":"+s);
    }
}
