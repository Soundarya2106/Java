/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Arrays;

/**
 *
 * @author ELCOT
 */
public class EachOtherOrNot {
    public static void main(String[] args){
        int arr[] = {5, 7, 6, 2, 4 ,9, 5};
        int num = 5;
        boolean test = false;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==num && arr[i+1]==num){
                System.out.println("They are Next to Each Other..!");
                test = true;
            }
            if(i<=arr.length-3 && arr[i]==num && arr[i+2]==num){
                System.out.println("They are seperated by one element..!");
                test = true;
            }
        }
        if(test==false)
                System.out.println("They neither each other nor seperated by one element");
    }
}
