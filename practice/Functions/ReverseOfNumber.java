package com.mycompany.practice.Functions;
import java.util.Scanner;
public class ReverseOfNumber {
    public static int REV(int n){
        long RevNumber = 0;
        while(n>0){
            RevNumber = (RevNumber*10)+(n%10);
            n = n/10;
        }
        return (int) RevNumber;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int result = REV(n);
        System.out.println("Reverse of the number "+ n +"is"+result);
    }    
}
