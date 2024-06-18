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
public class count_digit 
{
   public static void main(String[]args)
   {
       Scanner sc=new Scanner(System.in);
       {
           int a=sc.nextInt();
           int count=0;
     
           for(int i=0;a>0;i++)
           {
              
               a=a/10;  
               count++;
               
           }
           System.out.println(count);
        
           
       
        }
    
    
    
    }
}
