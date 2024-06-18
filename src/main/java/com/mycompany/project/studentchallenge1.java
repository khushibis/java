/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class studentchallenge1 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter for a");
        
        int a=sc.nextInt();
        System.out.println("enter for b");
        int b=sc.nextInt();
       
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        int g=a%b;
        System.out.println("add"+c);
        System.out.println("subtract"+d);
        System.out.println("multiply"+e);
        System.out.println("quotient"+f);
        System.out.println("m=remainder"+g);
    }
    
}
