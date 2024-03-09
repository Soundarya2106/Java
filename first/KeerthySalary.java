/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ELCOT
 */
package com.mycompany.first;
import java.util.Scanner;
public class KeerthySalary {
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
                System.out.print("Enter name:");
                String name=sc.next();
		System.out.print("Enter the Years of Service :");
		int yos = sc.nextInt();
		System.out.print("Enter the Gender f/m :");
		char g = sc.next().charAt(0);
		System.out.print("Enter the Qualification (Graduate(0) , Post-Graduate(1)) :");
		int q = sc.nextInt();
                int salary =0;
		if(g=='m' && yos>=10 && q==1)
		{			
			salary = 75000;
		}
		else if( (g=='m' && yos>=10 && q==0))
		{			
			salary = 60000;
		}
		else if(g=='m' && yos<10 && q==0)
		{			
			salary = 25000;
		}
		else if(g=='f' && yos>=10 && q==1)
		{			
			salary = 72000;
		}
		else if(g=='f' && yos>=10 && q==0)
		{			
			salary = 500000;
		}
		else if((g=='f' && yos<10 && q==1)||(g=='m' && yos<10 && q==1))
		{			
			salary = 400000;
		}
		System.out.println("Salary : " + salary);
	}
    
}
