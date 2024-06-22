/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.functionsandmethods;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class shadowing 
{
    static int z=90;    //global variable
    public static void main(String[]args)
    {
        System.out.println(z);
        int z=40;    //local variable
        System.out.println(z);
        num();
    }
    static void num()
    {
        System.out.println(z);
    }
    
}
