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
public class arithmeticoperations 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("===");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MULT");
        System.out.println("DIV");
        int a =sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();
        String option=sc.nextLine();
        option=option.toUpperCase();
        switch(option)
        {
            case "ADD":
                System.out.println("sum is"+(a+b));
                break;
            case "SUB":
                System.out.println("sub is"+(a-b));
                break;
            case "MULT":
                System.out.println("mult is"+(a*b));
                break;
                
            case "DIV":
                System.out.println("div is"+(a/b));
                break;
                
        }
        
    }
    
}
