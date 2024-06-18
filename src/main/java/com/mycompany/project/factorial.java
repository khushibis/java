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
public class factorial 
{
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in); 
    int n=sc.nextInt();
    int fact=1;
    int i;
    {
    for(i=1;i<=n;i++)
    {
      fact=fact*i;  
    }
    System.out.println(fact);
    }
    }
    
}
