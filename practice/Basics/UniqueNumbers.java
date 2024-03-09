/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Basics;

/**
 *
 * @author ELCOT
 */
public class UniqueNumbers {
    public static void main(String[] args){
        int total=0;
        for(int i=0;i<=4;i++){
            for(int j=0;j<=4;j++){
                for(int k=0;k<=4;k++){
                    if(k!=i && k!=j && i!=j){
                        System.out.println(i+""+j+""+k);
                        total++;
                    }
                }
            }
        }
        System.out.println("Total number of Unique numbers using 1,2,3 and 4:"+total);
    }
}
