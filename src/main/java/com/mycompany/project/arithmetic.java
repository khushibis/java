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
public class arithmetic 
{
    public static  void main (String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int a;int b;int sum;int diff;int mult;int div;
        a=sc.nextInt();
        System.out.println("enter for a");
        
        b=sc.nextInt();
        System.out.println("enter for b");
        sum =a+b;
        diff=a-b;
        mult=a*b;
        div=a/b;
        {
            System.out.println("sum"+sum);
            System.out.println(diff + "diff");
            System.out.println("multiply"+mult);
            System.out.println("div"+div);
        }
            
        
    }
    
}
