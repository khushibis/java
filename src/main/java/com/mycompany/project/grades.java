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
public class grades
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks");
        int marks=sc.nextInt();
        {
            if(marks>=100)
            {
                System.out.println("GRADE A");
            }
            else if(80<=marks&&marks<=90)
            {
                System.out.println("grade B");
            }
            else if(70<=marks && marks<=80)
            {
                System.out.println("grade C");
            }
            else if(60<=marks&& marks<=70)
            {
                System.out.println("grade e");
            }
            else
            {
                System.out.println("average" );
            }
        }
    }
      
}
