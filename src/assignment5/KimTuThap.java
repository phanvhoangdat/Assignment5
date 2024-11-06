/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5;

import java.util.Scanner;

public class KimTuThap {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập số n (số hàng của kim tự tháp)
        System.out.print("Nhap so hang cua kim tu thap : ");
        int n = scanner.nextInt();

        // Duyệt từng hàng và in các số theo yêu cầu
        for (int i = 1; i <= n; i++) {
            // In khoảng trắng (dùng để tạo khoảng cách giữa các số)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");             }

            // In các số từ 1 đến i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }
}