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
public class areaoftriangle
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int breadth;int height;
        breadth = sc.nextInt();
        System.out.println("enter for breadth");
        height = sc.nextInt();
        System.out.println("enter for height");
        int area= (int) (0.5*height*breadth);
        {
            System.out.println("area"+area);
        }
        
    }
    
}

