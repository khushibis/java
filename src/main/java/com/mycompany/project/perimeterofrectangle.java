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
public class perimeterofrectangle
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter for a");
        int a=sc.nextInt();
        System.out.println("enter for b");
        int b=sc.nextInt();
        System.out.println("enter for c");
        int c=sc.nextInt();
        System.out.println("enter for d");
        int d=sc.nextInt();
        int e=a+b+c+d;
        System.out.println("area of rectangle"+e);
    }
    
    
}
