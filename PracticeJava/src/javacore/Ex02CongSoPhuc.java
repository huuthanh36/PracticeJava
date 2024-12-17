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
public class Ex02CongSoPhuc {
    public static void main(String[] args) {
        // Đề bài : Cộng 2 số phức trong java
        //Công thức : z + z' = (a+a') + (b+b')i
        
        Scanner sc = new Scanner(System.in);
        int thuc1, ao1, thuc2, ao2;
        
        System.out.println("Nhập số phức 1 : ");
        System.out.println("Nhập phần thực : ");
        thuc1 = sc.nextInt();
        System.out.println("Nhập phần ảo :");
        ao1 = sc.nextInt();
        System.out.println("Nhập số phức 2 : ");
        System.out.println("Nhập phần thực : ");
        thuc2 = sc.nextInt();
        System.out.println("Nhập phần ảo :");
        ao2 = sc.nextInt();
        
        System.out.println("Số phức 1 : z = "+thuc1+" + "+ao1+"i");
        System.out.println("Số phức 2 : z' = "+thuc2+" + "+ao2+"i");
        
        System.out.println("z + z' = "+(thuc1 + thuc2)+" + "+(ao1 + ao2)+"i");
    }
}
