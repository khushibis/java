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
public class alphabets 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='a'&& ch<='z')
        {
            System.out.println("lowercase");
        }
        else
        {
            System.out.println("uppercase");
        }
        
        
                
    }
    
}
