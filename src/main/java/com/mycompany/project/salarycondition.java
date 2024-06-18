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
public class salarycondition
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
   ;
        if (a>=10000)
        {
            a=a+1000;
         
        }
        else
        {
            a=a+5000;
         
        }
           System.out.println("total salary: " +a);
                
        
    }
    
}
