/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Dell
 */
public class binary 
{
    public static void main(String[]args)
    {
        int b=101111;
        String str=String.valueOf(b);
        System.out.println(str.matches("[01]+"));
        String c="234A";
        System.out.println(str.matches("[0-9A-F]+"));
        String d="01/03/2024";
        System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9][0-9][0-9][0-9]"));
        String e="  java  ";
        System.out.println(e.matches("\\S"));
        String f="a!b#C%";
        System.out.println(f.replaceAll("[^a-zA-Z0-9]",""));
        String g="         j      a a v a a a a          ";
        System.out.println(g.replaceAll("\\s", "").trim());
         String h=" abc efg hij klm ";
         String words[]=h.split("\\s");
         System.out.println(words.length);
        
        
    }
}
