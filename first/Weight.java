package com.mycompany.first;
/*
In boxing the weight class of a boxer is decided as per the following conditions. Write a program that receives boxer name, age and weight as input and prints out
the boxer’s weight class.
Boxer Class 		Weight in Pounds
Flyweight	            < 115
Bantamweight	           115 - 121
Featherweight	           122 - 153
Middleweight	      	   154 – 189
Heavyweight 	            >= 190
*/
import java.util.Scanner;
public class Weight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.next();
        System.out.print("Enter your Age:");
        int age = sc.nextInt();
        System.out.print("Enter your Weight:");
        float weight = sc.nextFloat();
        if(weight<115){
            System.out.println("'"+name+"'"+" at the age of "+age+", You are FlyWeight!");
        }
        else if(weight>115 && weight<=121){
            System.out.println("'"+name+"'"+" at the age of "+age+", You are BantamWeight!");
        }
        else if(weight>=122 && weight<=153){
            System.out.println("'"+name+"'"+" at the age of "+age+", You are FeatherWeight!");
        }
        else if(weight>=154 && weight<=189){
            System.out.println("'"+name+"'"+" at the age of "+age+", You are MiddleWeight!");
        }
        else{
            System.out.println("'"+name+"'"+" at the age of "+age+", You are HeavyWeight!");
        }
    }
}
