/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.functionsandmethods;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class isarmstrong 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=100;i<1000;i++)
        {
            if(arm(i))
            {
                System.out.println(i+"  ");
            }
        }
        
    }
    static boolean arm(int n)
    {
        int temp= n;
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            n=n/10;
            sum=sum+(rem*rem*rem);    
        }
        if(sum== temp)
        {
            return true;
        }else
        {
            return false;
        }
    }
    
}
