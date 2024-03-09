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
public class LeftShift {
    public static void main(String[] args){
        int arr[] = { 43, 44, 45, 46, 47, 48 };
        System.out.println("Original Array: "+Arrays.toString(arr));
        int first = 0;
        if(arr.length>=1)
            first = arr[0];
        for(int i=1; i<arr.length; i++)
            arr[i-1]=arr[i];
        arr[arr.length-1]=first;
        System.out.println("Left Shifted Array: "+Arrays.toString(arr));
    }
}
