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
public class website 
{
   public static void main(String[]args) 
   {
       Scanner sc= new Scanner(System.in);
       String str1=sc.nextLine();
       if(str1.startsWith("http"))
       {
           System.out.println("hyper text transfeer protocol");
       }
       else if(str1.startsWith("ftp"))
       {
           System.out.println("file transfer protocol");
       }
       else if(str1.contains("com"))
       {
           System.out.println("commerical");
       }
       else if(str1.contains("org"))
       {
           System.out.println("organisation");
       }
   }
}
