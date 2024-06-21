/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conditionalandloops;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class areas 
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter for length");
        int length=sc.nextInt();
        System.out.println("enter for breadth");
        int breadth=sc.nextInt();
        int area= (int)(0.5*length*breadth);
        System.out.println("area of traingle: " +area);
        System.out.println("enter for the radius: ");
        float radius=sc.nextInt();
        double circle=(double)(3.14*radius*2);
        System.out.println("area of circle: " + circle);
        System.out.println("enter for the height : ");
        int height=sc.nextInt();
        double rectangle=length*breadth*height;
        System.out.println("area of rectangle : "+rectangle);
        
        
        
    }
    
}
