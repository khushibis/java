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
public class switchcase 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(n)
        {
            case 1: System.out.println("one");
            break;
            case 2:System.out.println("two");
            break;
            case 3:System.out.println("three");
            break;
            case 4: System.out.println("four");
            break;
            default:System.out.println("invaleid no");
                
        }
    }
    
}
