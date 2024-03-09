package com.mycompany.practice.Arrays;
import java.util.Scanner;
public class TwoDArraySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[3][3];
        System.out.println("Enter the array elements:");
        for(int i=0; i<3;i++){
            for(int j=0; j<3; j++){
                mat[i][j] = sc.nextInt();
                if(j==2){
                    System.out.println();
                }
            }
        }
        System.out.print("Enter to element to search:");
        int target = sc.nextInt();
        boolean found = Search(mat, target);
        if(found){
            System.out.println(target+" is found..!");
        }
        else{
            System.out.println(target+" is not found!");
        }
    }
    public static boolean Search(int mat[][], int target){
        if(mat==null || mat.length == 0 || mat[0].length == 0){
            return false;
        }
        int m = mat.length;
        int n = mat[0].length;
        
        int row = 0;
        int col = n-1;
        
        while(row<m && col>=0){
            int value = mat[row][col];
            if(value == target){
                return true;
            }
            else if(value < target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
}
