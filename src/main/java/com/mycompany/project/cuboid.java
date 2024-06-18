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
public class cuboid
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int length;int breadth;int height;
        double volume;double area;
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();
        volume=length*breadth*height;
        area=2*(length*breadth+breadth*height+height*length);
        {
            System.out.println("volume"+volume);
            System.out.println("area"+area);
            
        }
        
    }
    
}
