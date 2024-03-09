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
public class Count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        int letters=0, spaces=0, num=0, spl=0;
        for(int i=0; i<c.length;i++){
            if(Character.isLetter(c[i])){
                letters++;
            }
            else if(Character.isDigit(c[i])){
                num++;
            }
            else if(Character.isSpaceChar(c[i])){
                spaces++;
            }
            else{
                spl++;
            }
        }
        System.out.println("Letters = "+ letters);
        System.out.println("Numbers = "+ num);
        System.out.println("Special Characters = "+ spl);
        System.out.println("Spaces = "+ spaces);
    }
}
