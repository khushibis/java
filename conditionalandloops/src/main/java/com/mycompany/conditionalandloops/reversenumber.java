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
public class reversenumber
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int rem =0;
        int temp;
        while(a>0)
        {
            temp=a%10;
            rem=rem*10+temp;
            a=a/10;
            
        }
        System.out.println(rem);
    }
    
}
