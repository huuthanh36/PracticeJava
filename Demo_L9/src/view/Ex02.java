/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Arrays;

/**
 *
 * @author PC
 */
public class Ex02 {
    public static void main(String[] args) {
        String[] elements = {"abc123", "aa", "1234asdv"};
        
        int[] result = getLargestValidNumber(elements);
        sort(result);
        for(int i = 0; i <result.length; i++){
            System.out.print(result[i]);
            if(i < result.length - 1){
                System.out.print(" ");
            }
        }
    }
    
    private static int[] getLargestValidNumber(String[] elements){
        
        int[] maxNum = new int[elements.length];
        
        for(int i = 0; i < elements.length; i++){
            int max = getValidMaxNumber(elements[i]);
            maxNum[i] = max;
        }
        return maxNum;
    }
    private static int getValidMaxNumber(String input){
        String[] inputs = input.split("[a-z]+");
        if(inputs.length == 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for(String in : inputs){
            if(!in.isEmpty()){
                int num = Integer.parseInt(in);
                max = Math.max(num, max);
            }
        }
        return max  ;
    }
    private static void sort(int[] array){
        Arrays.sort(array);
    }
}
