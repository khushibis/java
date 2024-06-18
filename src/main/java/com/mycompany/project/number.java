/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Dell
 */
import java.util.*;
public class number 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter for number");
        int num=sc.nextInt();
        if(num<0)
        {
            System.out.println("negative number");
        }
        else if(num==0)
        {
            System.out.println("number is 0");
        }
        else
        {
            System.out.print("number is positive");
        }
        
        
    }
    
}
