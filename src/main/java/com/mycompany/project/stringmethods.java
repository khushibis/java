/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Dell
 */
public class stringmethods 
{
    public static void main(String[]args)
    {
    String str="   Welcome    ";
    String str1=str.toLowerCase();
    String str2=str.toUpperCase();
    System.out.println(str1);
    System.out.println(str2);
    str = str.trim();
    System.out.println(str);
    String str4 = str.substring(3);
    System.out.println(str4);
    String str5=str.substring(2,6);
    System.out.println(str5);
    String str6 =str.replace('e','d');
    System.out.println(str6);
    String str7="www.abcd.org";
    System.out.println(str7.startsWith("www"));
    System.out.println(str7.endsWith("org"));
    System.out.println(str7.charAt(4));
    System.out.println(str7.indexOf('c',7));
    
    
    
    }
    
}
