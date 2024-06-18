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
public class palindrome 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rem=0;
        int temp=a;
       for(int i=0;temp>0;i++)
       {
           rem=temp%10;
           rem=rem+rem;
           temp=temp/10;           
       }
       if(rem==a)
       {
           System.out.println("it is a palindrome");
       }
       else
       {
           System.out.println("it is not a palindrome");
       }
       
    }
    
}
