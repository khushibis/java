/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conditionalandloops;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class fibonaccciseries 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        int count=2;
        System.out.println("enter for num : ");
        int n=sc.nextInt();
        
        while(count<=n)
        {
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
       
        
        
    }
    
}
