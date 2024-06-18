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
public class multplicationtable 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter for number");
        int n=sc.nextInt();
        
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println(n+"*"+ i +"="+i*n);
     
        }
        
        
    }
    
}
