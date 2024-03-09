/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author ELCOT
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
public class Calender {
    public static void main(String[] args){
        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss.SSS");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMD")));
        System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
    }
}
