package com.mycompany.first;
import java.util.Scanner;
public class Formatting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sub[] = {"Tamil", "English", "Maths", "Science", "Social"};
        String num[] = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        String mark[] = new String[5];
        System.out.print("Enter Name:");
        String name = sc.next();
        for(int i=0; i<sub.length;i++){
            System.out.print("Enter "+sub[i]+" Marks:");
            mark[i] = sc.next();
        }        
        System.out.print("Enter Date Of Birth(DD/MM/YYYY):");
        String dob = sc.next();
        System.out.print("Enter Register Number:");
        int reg = sc.nextInt();
        System.out.print("Enter TMR code:");
        String tmr = sc.next();
        System.out.print("Enter School Name:");
        String scl = sc.next();
        int total=0;
        for(int i=0; i<mark.length; i++){
            total+=Integer.parseInt(mark[i]);
        }
        String t = Integer.toString(total);
        if (t.length() >= 3) {
                t = "  "+num[Integer.parseInt(t.substring(0, 1))] + " " +
                 num[Integer.parseInt(t.substring(1, 2))] + " " +
                 num[Integer.parseInt(t.substring(2))];
}
        System.out.println();
        System.out.println("===============================================");
        System.out.println("NAME : "+name.toUpperCase());
        
        String h1 = "SUBJECTS";
        String h2 = "MARKS";
        System.out.println("===============================================");
        System.out.printf("%-15s %-7s %5s",h1,"|",h2);
        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        for(int i=0; i<sub.length; i++){
            System.out.printf("%-15s %-7s %-5s %3s %3s %n", sub[i], "|", mark[i], num[Integer.parseInt(mark[i].substring(0, 1))],num[Integer.parseInt(mark[i].substring(1))]);
        }
        System.out.println("-----------------------------------------------");
        System.out.printf("%-15s %-7s %3s %7s","TOTAL","|",total,t);
        System.out.println();
        System.out.println("===============================================");
        System.out.printf("%-8s %4s %10s %4s %10s","DOB","|","REGISTER NO.","|","TMR CODE");
        System.out.println();
        System.out.printf("%-8s %2s %7s %9s %7s",dob,"|",reg,"|",tmr);
        System.out.println("\n===============================================");
        System.out.printf("%30s","NAME OF SCHOOL");
        System.out.println();
        System.out.printf("%25.5s",scl);
        System.out.println("\n===============================================");
    }
}


