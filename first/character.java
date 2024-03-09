/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//DATA TYPES 
package com.mycompany.first;
public class character {
    public static void main(String[] args){
        char ch='S';
        boolean bl=true;
        byte lb= Byte.MAX_VALUE;
        short ls=Short.MAX_VALUE;
        int li=Integer.MAX_VALUE;
        long ll= Long.MAX_VALUE;
        float lf=Float.MAX_VALUE;
        double ld=Double.MAX_VALUE;
        System.out.println("All Data Type and its Maximum values:");
        System.out.println("the largest short value is "+ls);
        System.out.println("the largest integer value is "+li);
        System.out.println("the largest byte value is "+lb);
        System.out.println("the largest long value is "+ll);
        System.out.println("the largest double value is "+ld);
        System.out.println("the largest float value is "+lf);
        if(Character.isUpperCase(ch)){
            System.out.println("The Character "+ ch+" is in upper case");
        }
        else{
            System.out.println("The Character "+ ch+" is in lower case");
        }
        System.out.println("The value of Boolean is "+ bl);
    }
}


