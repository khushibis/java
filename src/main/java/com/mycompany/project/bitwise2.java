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
public class bitwise2 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=-0b1010;
        int b;
        b= a>>>1;
        int c=~a;
        {
            System.out.println(String.format("%s",Integer.toBinaryString(a)));
            System.out.println(String.format("%s",Integer.toBinaryString(b)));
            System.out.println(String.format("%32s",Integer.toBinaryString(b)));
            System.out.println(String.format("%s",Integer.toBinaryString(c)));
            System.out.println(c);
             
            
            
            
          
        }
        
    }
    
}

