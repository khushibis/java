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
public class addnumbers 
{
    public static void main(String[]args)
    {
     sum();     //calling the function
    }
    static void sum() //creating the method
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter for number 1: ");
        int num1=sc.nextInt();
        System.out.println("Enter for num2 : ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("sum of  two numbers: "+sum);
            
            
            
    }
    
}