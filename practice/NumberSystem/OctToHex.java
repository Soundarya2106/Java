/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

//DONE FOR 8 bit Binary OCTAL NUMBERS

public class OctToHex {
    public static void main(String[] args){
        int oct=25, bin=0, i=1, rem;
        int temp=oct;
        int dec[]=new int[5];
        int oct_values[]={0,1,10,11,100,101,110,111};
        //FINFING OCTAL VALUE
        while(oct!=0){
            rem=oct%10;
            bin=oct_values[rem]*i+bin;
            i*=1000;
            oct/=10;
        }
        int length = String.valueOf(bin).length();
        
        //MAKING 8 BITS
        String bin2 = String.format("%08d", bin);
        System.out.println(bin2);
        String substr1 = bin2.substring(0, 4);
        String substr2 = bin2.substring(4, 8);
        int n = Integer.parseInt(substr1);
        int m = Integer.parseInt(substr2);
        
       
        //FINDING DECIMAL FOR EACH SUB STRING
        int arr[]={n,m};
        for(int j=0; j<arr.length;j++){
            int k=1;
            int rem2;
            while(arr[j]!=0){
                rem2=arr[j]%10;
                dec[j]=dec[j]+rem2*k;
                k*=2;
                arr[j]/=10;
            }
        }
        System.out.println("the equivalant hexadecimal value of "+temp+" is "+dec[0]+dec[1]);
    }
}
