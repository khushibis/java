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
public class tovote 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a<18)
        {
            System.out.println("the person can be eligible");
        }
        else
        {
            System.out.println("the person is not eligible");
        }
    }
    
}
