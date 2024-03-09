/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Strings;

/**
 *
 * @author ELCOT
 */
public class FirstAndLast {
    public static void main(String[] args){
        String str1 = "";
        String str2 = "Soundarya";
        int len1 = str1.length();
        int len2 = str2.length();
        String res = "";
        res += (len1>=1)?str1.charAt(0):"#";
        res += (len2>=1)?str2.charAt(len2-1):"#";
        System.out.println(res);
    }
}
