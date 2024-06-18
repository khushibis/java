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
public class leapyear 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter for a year");
        int year=sc.nextInt();
        {
            if(year%4==0)
            {
                if(year%100==0)
                {
                    if(year%400==0)
                    {
                        System.out.println("it is a leap year");
                    }
                    else
                    {
                        System.out.println("it is not a leap year");
                    }
                }
                else
                {
                    System.out.println("its is a leap year");
                }
            }
           else
        {
            System.out.println("not a leap year");
        }    
         }   
    }  
 }
