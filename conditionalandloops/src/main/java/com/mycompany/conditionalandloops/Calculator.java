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
public class Calculator 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int sol=0;
        while(true)
        {
            System.out.println("Enter for the operator: ");
             char op=sc.next().trim().charAt(0);
             if(op=='+'||op=='-'||op=='*'||op=='%'|| op=='/')
             {
                 System.out.println("enter for the a : ");
                 int a=sc.nextInt();
                 System.out.println("Enter for the b: ");
                 int b=sc.nextInt();
                 if(op=='+')
                 {
                    sol=a+b; 
                  }
                 else if(op=='-' && a>b)
                 {
                     sol=a-b;
                 }
                 else if(op=='-'&& a<b)
                 {
                    sol=b-a;
                 }
                 else if(op=='*')
                 {
                      sol=a*b;
                 }
                 else if(op=='%')
                 {
                     sol=a%b;
                 }
                 else if (op=='/')
                 {
                    sol=a/b;
                 }
                 else
                 {
                     System.out.println("invalid syntax");
                 }   
                 System.out.println("the answer is : "+sol);
             }
             
            
        }
      
        
        
    }
    
}
