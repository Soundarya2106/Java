/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

import java.util.Date;

/**
 *
 * @author ELCOT
 */
public class Time {
    public static void main(String[] args){
        System.out.format("Date and time: %tc%n\n", System.currentTimeMillis());
        
        //ANOTHER WAY
        Date d = new Date();
        System.out.println("Date and time: "+d);
    }
}
