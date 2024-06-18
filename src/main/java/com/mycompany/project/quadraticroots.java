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
public class quadraticroots
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a;int b;int c;
        double r1;double r2;
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
         r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
         {
             System.out.println("the roots are:"+r1+" "+r2);
         }
         
    }
    
}
