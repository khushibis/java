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
public class trim 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().trim().charAt(0); // gives me the value of the char which is present at the index 0
        System.out.println(a);
        String b=sc.next().trim();
        System.out.println(b);
        
    }
    
}
