/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conditionalandloops;

/**
 *
 * @author Dell
 */
/** do{
}while (condition)
*/

import java.util.Scanner;
public class dowhile 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=0;
        do
        {
            System.out.println(i);
            i+=1;
            
        }while(i<=num );
    }
}
