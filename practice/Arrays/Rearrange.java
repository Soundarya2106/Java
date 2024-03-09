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
public class Rearrange {
    public static void main(String[] args){
        int arr[] = {43, 67, 45, 90, 42, 74, 8, 5, 19};
        int n = arr.length;
        System.out.println("Original Array:"+ Arrays.toString(arr));
        RearrangeEO(arr, n);
        System.out.println("Re-arranged Array:"+ Arrays.toString(arr));
    }
    public static void RearrangeEO(int arr[], int n){
        int j = -1, temp;
        
        //QUICK SORT METHOD
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
