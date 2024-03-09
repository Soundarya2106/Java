/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Strings;

/**
 *
 * @author ELCOT
 */
public class Adding {
    public static void main(String[] args){
        String str = "s";
        int len = str.length();
        if(len>=3)
            System.out.println(str.substring(0, 3));
        else if(len==1)
            System.out.println(str+"##");
        else
            System.out.println("###");
    }
}
