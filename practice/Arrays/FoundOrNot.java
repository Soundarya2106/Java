/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Arrays;

/**
 *
 * @author ELCOT
 */
import java.util.Arrays;
public class FoundOrNot {
    public static void main(String[] args){
        int arr[] = {80,50,10,50,40,30,90,20};
        boolean found1010 = false;
        boolean found2020 = false;
        System.out.println("Original array: "+Arrays.toString(arr));
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==10 && arr[i+1]==10){
                found1010 = true;
            }
            if(arr[i]==20 && arr[i+1]==20){
                found2020 = true;
            } 
        }
        if(found1010==true && found2020==true){
            System.out.println("Both 1010 and 2020 are present");
        }
        else if(found1010==false && found2020==false){
            System.out.println("Neither 1010 nor 2020 is present");
        }
        else{
            System.out.println("Either 1010 or 2020 is present");
        }
    }
}
