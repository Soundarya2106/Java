/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Strings;

/**
 *
 * @author ELCOT
 */
import java.util.Scanner;
public class TitleCase {
    public static void main(String[] args){
        String s = "the quick brown fox jumps over the lazy dog";
        Scanner line = new Scanner(s);
        String Titled_Case = "";
        while(line.hasNext()){
            String word = line.next();
            Titled_Case += Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
        }
        System.out.println(Titled_Case.trim());
    }
}
