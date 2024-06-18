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
public class daybasedonnumber
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter for a day");
        int day=sc.nextInt();
        if(day==1)
        {
            System.out.println("it is monday");
        }
        else if(day==2)
        {
            System.out.println("it is tuesday");
            
        }
        else if(day==3)
        {
            System.out.println("it is wednesday");
        }
        else if(day==4)
        {
            System.out.println("ist is thursday");
        }
        else if(day==5)
        {
            System.out.println("it is friday");
        }
        else if(day==6)
        {
            System.out.println("it is saturdsy");
        }
        else if(day==7)
        {
            System.out.println("it is sunday");
        }
        else
        {
            System.out.println("it is invaled number");
        }
    }
    
}
