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
public class areaoftraingle1 
{
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a;int b;int c;double s;double area;
        {
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            {
                s=(a+b+c)/2;
                area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
                {
                    System.out.println(area);
                }
            }
            
        }
    }
}
