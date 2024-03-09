/*Get month and date of birth as input and prints the corresponding zodiac sign based on the following condition:
Sun Sign 	From - To
Capricorn	December 22 - January 19
Aquarius	January 20 - February 17
Pisces		February 18 - March 19
Aries		March 20 - April 19
Taurus		April 20 - May 20
Gemini		May 21 - June 20
Cancer		June 21 - July 22
Leo	        July 23 - August 22
Virgo		August 23 - September 22
Libra		September 23 - October 22
Scorpio		October 23 - November 21
Sagittarius 	November 22 - December 21
*/
package com.mycompany.first;
import java.util.Scanner;
public class Zodiac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date of Birth(1-31):");
        int date = sc.nextInt();
        System.out.print("Enter Month of Birth(1-12):");
        int month = sc.nextInt();
        
        //CHECKING DATE AND MONTH IS VALID OR NOT
        if(month>=1 && month<=12 && date>=1 && date<=31){
        if(month==12 && date>=22 || month==1 && date<=19){
            System.out.println("Your Zodiac sign is Capricorn!");
        }
        else if(month==1 && date>=20 || month==2 && date<=17){
            System.out.println("Your Zodiac sign is Aquarius!");
        }
        else if(month==2 && date>=18 || month==3 && date<=19){
            if(month==2 && date>29){
                System.out.println("Invalid Month Or Date");
            }
            else{
            System.out.println("Your Zodiac sign is Pisces!");
            }
        }
        else if(month==3 && date>=20 || month==4 && date<=19){
            System.out.println("Your Zodiac sign is Aries!");
        }
        else if(month==4 && date>=20 || month==5 && date<=20){
            System.out.println("Your Zodiac sign is Tauras!");
        }
        else if(month==5 && date>=21 || month==6 && date<=20){
            System.out.println("Your Zodiac sign is Gemini!");
        }
        else if(month==6 && date>=21 || month==7 && date<=22){
            System.out.println("Your Zodiac sign is Cancer!");
        }
        else if(month==7 && date>=23 || month==8 && date<=22){
            System.out.println("Your Zodiac sign is Leo!");
        }
        else if(month==8 && date>=23 || month==9 && date<=22){
            System.out.println("Your Zodiac sign is Virgo!");
        }
        else if(month==9 && date>=23 || month==10 && date<=22){
            System.out.println("Your Zodiac sign is Libra!");
        }
        else if(month==10 && date>=23 || month==11 && date<=21){
            System.out.println("Your Zodiac sign is Scorpio!");
        }
        else{
            System.out.println("your Zodiac sign is Sagittarius");
        }
        }
        else{
            System.out.println("Invalid Date or Month!");
        }
    }
}
