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
public class prime 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean ans=prime(num);
        System.out.println(ans);
     
    }
    static boolean prime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        int c=2;
        while(c*c<=num)
        {
            if(num%2==0)
            {
                return false;
            }
            c++;   
        }
        return c*c>num;
    }
    
}
