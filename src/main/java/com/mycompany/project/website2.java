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
public class website2 
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        String str1=sc.nextLine();
        String protocol=str1.substring(0,str1.indexOf(":"));
        if(protocol.equals("http"))
        {
            System.out.println("hypertextmarkup language");
        }
        else
        {
            System.out.println("file transfer protocol");
        }
        String ext=str1.substring((str1.lastIndexOf(".")+1));
        if(ext.equals("com"))
        {
            System.out.println("commerical");
        }
        else if(ext.equals("org"))
        {
            System.out.println("organisation");
        }
        else
        {
            System.out.println("networks");
        }
    }
    
}
