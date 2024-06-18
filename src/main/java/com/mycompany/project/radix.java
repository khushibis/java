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
public class radix 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        {
            if(s.matches("[01]+"))
            {
                System.out.println("it is binary radix 2");
            }
            else if(s.matches("[0-7+]"))
            {
                System.out.println("it is octal radix 8");
            }
            else if(s.matches("[A-Z][0-9]+"))
            {
                System.out.println("it is hexadecimal radix =16 ");
            }
            else
            {
                System.out.println("invalid number ");
            }
        }
        
    }
}
