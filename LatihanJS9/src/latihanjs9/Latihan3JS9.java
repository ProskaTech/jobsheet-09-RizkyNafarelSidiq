/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanjs9;

/**
 *
 * // Created Rizky Nafarel Sidiq 21343071
 */
public class Latihan3JS9 {
    public static void main(String[] args) {
        String str1, str2;
        str1 = "free the bound periodicals.";
        str2 = str1;
        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);
        System.out.println("Same object? " + (str1 == str2));
        
        str2 = new String(str1);
        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);
        System.out.println("Same object? " + (str1 == str2));
        
        System.out.println("Same object? " + str1.equals(str2));
    }
    
}
