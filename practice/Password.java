/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author ELCOT
 */
import java.io.Console;
public class Password {
    public static void main(String[] args){
        Console cons;
        if((cons = System.console())!=null){
            char[] password = null;
            try{
                password = cons.readPassword("Inpur your password:");
                System.out.println("Your password was: "+new String(password));
            }
            finally{
                if(password!=null){
                    java.util.Arrays.fill(password, ' ');
                }
            }
        }
        else{
            throw new RuntimeException("Can't get the password..!");
        }
    }
}
