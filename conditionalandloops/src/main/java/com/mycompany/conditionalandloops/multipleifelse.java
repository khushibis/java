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
public class multipleifelse 
{
    public static void main(String[]args)
    {
        System.out.println("enter for salary:");
        Scanner sc= new Scanner(System.in);
        int salary=sc.nextInt();
        if(salary>10000)
        {
            salary+=1000;
        }
        else if(salary==10000)
                {
                    salary+=1500;
                }
        else
        {
            salary+=5000;
        }
        System.out.println("bonus salary:"+salary);
    }
    
}
