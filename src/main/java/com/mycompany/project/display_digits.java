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
public class display_digits 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r;
        while(a>0)
        {
            r=a%10;
            a=a/10;
            System.out.println(r);
        }
        
      
    }
            
    
}
