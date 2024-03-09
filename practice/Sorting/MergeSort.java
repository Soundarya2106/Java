/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice.Sorting;

/**
 *
 * @author ELCOT
 */
import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args){
        int arr1[] = {2,4,6,8,10};
        int arr2[] = {3,6,9,12,15};
        System.out.println("The First Array is:"+Arrays.toString(arr1));
        System.out.println("The Second Array is:"+Arrays.toString(arr2));
        int res[];
        res = Mergesort(arr1, arr2);
        System.out.println("The Merge Sorted Array is:"+Arrays.toString(res));
    }
    public static int[] Mergesort(int arr1[], int arr2[]){
        int len1 = arr1.length;
        int len2 = arr2.length;
        int i=0, j=0, k=0;
        int res[]= new int[len1+len2];
        while(i<len1 && j<len2){
            if(arr1[i]<arr2[j]){
                res[k]=arr1[i];
                i++;
            }
            else{
                res[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<len1){
            res[k]=arr1[i];
            i++;
            k++;
        }
        while(j<len2){
            res[k]=arr2[j];
            j++;
            k++;
        }
        return res;
    }
}
