/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Dell
 */

/**

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================*/
import java.util.Scanner;
public class hackerrankque1
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<3;i++)
       {
           String s =sc.next();
           int x=sc.nextInt();
           System.out.printf("%-15s%03d%n",s,x); //here %s means the string and the %d means the integer
                                                              //and 3 means here that the value of integer should be 3 and ifnot 3 rhen add 0 before the integer value
                                                              //the 15s means the string value should be atmost 15
       }
     
    }
    
}
