/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//CALCULATE SALARY
package com.mycompany.first;
import java.util.Scanner;
public class salary {
    public static void main(String[] args){
        String m = "Male";
        String f = "Female";
        String pg = "Post-Graduate";
        String ug = "Graduate";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name:");
        String name = sc.next();
        System.out.print("Enter your Gender(Type Male or Female):");
        String gender = sc.next();
        System.out.print("Enter your Years of Service:");
        int yos = sc.nextInt();
        System.out.print("Enter your Qualification(Type Post-Graduate or Graduate):");
        String quali = sc.next();
        if(gender.equals(m) && yos>=10 && quali.equals(pg)){
            System.out.println(name+", Your Salary is 75,000 Rupees");
        }
        else if(gender.equals(m) && yos>=10 && quali.equals(ug)){
            System.out.println(name+", Your Salary is 60,000 Rupees");
        }
        
        else if(gender.equals(m) && yos<10 && quali.equals(pg)){
            System.out.println(name+", Your Salary is 40,000 Rupees");
        }
        else if(gender.equals(m) && yos<10 && quali.equals(ug)){
            System.out.println(name+", Your Salary is 25,000 Rupees");
        }
        else if(gender.equals(f) && yos>=10 && quali.equals(pg)){
            System.out.println(name+", Your Salary is 72,000 Rupees");
        }
        else if(gender.equals(f) && yos>=10 && quali.equals(ug)){
            System.out.println(name+", Your Salary is 50,000 Rupees");
        }
        else if(gender.equals(f) && yos<10 && quali.equals(pg)){
            System.out.println(name+", Your Salary is 40,000 Rupees");
        }
        else{
            System.out.println(name+", Your Salary is 20,000 Rupees");
        }
    }
}
