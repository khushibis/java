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
public class countparticulardigit 
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        char target=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==target)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
