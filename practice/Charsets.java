/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author ELCOT
 */
import java.nio.charset.Charset;
public class Charsets {
    public static void main(String[] args){
        System.out.println("Available Character Sets:");
        for(String s: Charset.availableCharsets().keySet()){
            System.out.println(s);
        }
    }
}
