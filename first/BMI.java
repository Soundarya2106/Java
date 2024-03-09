/*The Body Mass Index (BMI) is defined as ratio of the weight of a person (in kilograms) 
to the square of the height (in meters). Write a program that receives weight and height, calculates the BMI,
and reports the BMI category as per the following conditions:

BMI Category 		BMI
Starvation		< 15
Anorexic		15.1 to 17.5
Underweight		17.6 to 18.5
Ideal			18.6 to 24.9
Overweight		25 to 25.9
Obese			30 to 30.9
Morbidly Obese 		>= 40
*/
package com.mycompany.first;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name:");
        String name = sc.next();
        System.out.print("Enter your Age:");
        int age = sc.nextInt();
        System.out.print("Enter your Weight:");
        float weight = sc.nextFloat();
        System.out.print("Enter your Height:");
        float height = sc.nextFloat();
        float h2 = height / 100;
        float BMI = weight / (h2 * h2);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("BMI : "+BMI);
        if(BMI<15){
            System.out.println("Starvation!");
        }
        else if(BMI>=15.1 && BMI<=17.5){
            System.out.println("Anorexic!");
        }
        else if(BMI>=17.6 && BMI<=18.5){
            System.out.println("UnderWeight!");
        }
        else if(BMI>=18.6 && BMI<=24.9){
            System.out.println("Ideal!");
        }
        else if(BMI>=25 && BMI<=29.9){
            System.out.println("OverWeight!");
        }
        else if(BMI>=30 && BMI<=39.9){
            System.out.println("Obese!");
        }
        else{
            System.out.println("Morbidly Obese!");
        }
    }
}
