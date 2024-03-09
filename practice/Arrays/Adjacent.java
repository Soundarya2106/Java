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
public class Adjacent {
    public static void main(String[] args){
        int arr[]={11,12,13,14,15};
        System.out.println("Original Array: "+Arrays.toString(arr));
        int res = 0;
        for(int i=0; i<arr.length-3;i++){
            if(arr[i]+1==arr[i+1] && arr[i+1]+1==arr[i+2])
                res = 1;
        }
        if(res == 1){
            System.out.println("This is an increasing adjacent number array..!");
        }
        else{
            System.out.println("This is not an increasing adjacent number array..!");
        }
    }
}
