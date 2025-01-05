/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author PC
 */
public class Ex03 {
    public static void main(String[] args) {
        String input = "Welcome to JAVA10 class";
        
        String[] words = input.strip().split("\\s+");
        
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(reverse(word)).append(" ");
        }
        
        System.out.println("--> sb = "+sb);
    }
    
    private static StringBuilder reverse(String ip){
        return new StringBuilder(ip).reverse();
    }
}
