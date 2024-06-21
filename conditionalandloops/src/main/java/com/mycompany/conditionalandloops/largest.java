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
public class largest
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter for number a :");
        int a=sc.nextInt();
        System.out.println("enter for number b:");
        int b=sc.nextInt();
        System.out.println("Enter for number c:");
        int c=sc.nextInt();
        int max=Math.max(c,Math.max(a, b));
        System.out.println("the largest number  "+max);
    }
    
}
