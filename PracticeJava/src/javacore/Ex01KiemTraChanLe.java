/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex01KiemTraChanLe {
    public static void main(String[] args) {
        
        //Đề bài : Kiểm tra tính chẵn lẻ của 1 số n được nhập từ bàn phím
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Nhập n : ");
        n = sc.nextInt();
        
        if(n%2==0){
            System.out.println(n+" là số chẵn");
        }else{
            System.out.println(n+" là số lẻ");
        }
    }
}
