/*
Grade of steel is graded accprding to the following conditions:
           (i)Hardness must be greater than 50
           (ii)Carbon content must be less then 0.7
           (iii)Tensile strength must be greater than 5600
The grades are as follows:
    1)Grade is 10 if all three conditions are met.
    2)Grade is 9 if (i) and (ii) conditons are met.
    2)Grade is 8 if (ii) and (iii) conditons are met.
    2)Grade is 7 if (i) and (iii) conditons are met.
    2)Grade is 6 if any one of the condition is met.
    2)Grade is 5 if any conditons are not met.
*/
package com.mycompany.first;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hardness:");
        int hardness = sc.nextInt();
        System.out.print("Enter Carbon Content:");
        float carbon = sc.nextFloat();
        System.out.print("Enter Tensile:");
        int tensile = sc.nextInt();
        if(hardness>50 && carbon<0.7 && tensile>5600){
            System.out.println("Grade of your steel is 10");
        }
        else if(hardness>50 && carbon<0.7){
            System.out.println("Grade of your steel is 9");
        }
        else if(carbon<0.7 && tensile>5600){
            System.out.println("Grade of your steel is 8");
        }
        else if(hardness>50 && tensile>5600){
            System.out.println("Grade of your steel is 7");
        }
        else if(hardness>50 || carbon<0.7 || tensile>5600){
            System.out.println("Grade of your steel is 6");
        }
        else{
            System.out.println("Grade of your steel is 5");
        }
    }
}
