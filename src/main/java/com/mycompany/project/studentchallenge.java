/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Dell
 */
public class studentchallenge
{
    public static void main(String[]args)
    {
        String str1="programmer@gmail.com";
        int i=str1.indexOf("@");
        String str2=str1.substring(0,i);
         System.out.println(str2);
        String str3=str1.substring(i+1,str1.length());
        System.out.println(str3);
        
        
                
    }
    
}
