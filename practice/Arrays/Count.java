/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Arrays;

/**
 *
 * @author ELCOT
 */
public class Count {
    public static void main(String[] args){
        int arr[]={5,7,2,6,9,3,6,4,10,43,8,45,72,90,65,93,59};
        int even=0, odd=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even numbers = "+even);
        System.out.println("Odd numbers = "+odd);
    }
}
