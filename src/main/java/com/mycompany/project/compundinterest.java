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
public class compundinterest
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter for priniciple");
        double p=sc.nextDouble();
        System.out.println("enter for time");
        int t=sc.nextInt();
        System.out.println("enter for rate");
        float r=sc.nextFloat();
        double ci=p * Math.pow((1+r/100), t);
        System.out.println(ci);
        
        
    }
    
}
