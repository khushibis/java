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
public class greatestnum
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter for a");
        int a=sc.nextInt();
        System.out.println("enter for b");
        int b=sc.nextInt();
        System.out.println("enter for c");
        int c=sc.nextInt();
        if(a>c && a>b)
        {
            System.out.println("a is greatest");
        }
        else if(b>c && b>a)
        {
           System.out.println("b is greatest");
        }
        else
        {
            System.out.println("c is the greatest");
        }
        
    }
    
}
