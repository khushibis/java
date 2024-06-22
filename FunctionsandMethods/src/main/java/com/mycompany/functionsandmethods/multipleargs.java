/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.functionsandmethods;

/**
 *
 * @author Dell
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class multipleargs 
{
    public static void main(String[]args)
    {
       func(2,3,"khushi","radhu","disha");
       
    }
    static void func(int a,int b, String...v)
    {
   
        List<String> combinedArgs = new ArrayList<>();
        combinedArgs.add(String.valueOf(a));
        combinedArgs.add(String.valueOf(b));
        combinedArgs.addAll(Arrays.asList(v));

        System.out.println("Combined Arguments: " + combinedArgs);
        
    }
    
        
    
}
