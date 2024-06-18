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
public class simpleinterest 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter dor principle");
        double  p=sc.nextDouble();
        System.out.println("enter for rate");
        float r=sc.nextFloat();
        int t=sc.nextInt();
        System.out.println("enter for time");
        Double simpleinterest=(p*r*t)/100;
        System.out.println("simple interest"+simpleinterest);
    }
    
}
