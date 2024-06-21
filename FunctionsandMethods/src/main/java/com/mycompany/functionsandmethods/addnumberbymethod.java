/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.functionsandmethods;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class addnumberbymethod 
{
    public static void main(String[]args)
    {
        int ans=sum();
        System.out.println("sum of two numbers is :" + ans);
        
    }
    static int sum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter for number 1: ");
        int num1=sc.nextInt();
        System.out.println("Enter for num2 : ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        return sum;
    }
    
}
