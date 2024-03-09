package com.mycompany.practice.Functions;
import java.util.Scanner;
public class PrimeOrNot {
    public static void Prime(int n){
        int i, count=0;
        for(i=2;i<n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("PRIME NUMBER");
        }
        else{
            System.out.println("NOT A PRIME NUMBER");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        Prime(n);
    }
}
