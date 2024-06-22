/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.functionsandmethods;

/**
 *
 * @author Dell
 */
import java.util.Arrays;

public class varArgs 
{
    public static void main(String[]args)
    {
        fun(2, 3, 4, 5, 6, 7, 8,98,9);
    }
    static void fun(int ...v) // basically it is arrays of the integer
    {
        System.out.println(Arrays.toString(v));
        
    }
    
}
