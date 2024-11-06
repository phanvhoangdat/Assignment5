/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5;

import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tạo đối tượng Random để sinh số ngẫu nhiên
        Random random = new Random();
        
        // Tạo một số ngẫu nhiên từ 1 đến 50
        int soNgauNhien = random.nextInt(50) + 1;
        
        // Khởi tạo biến để kiểm tra việc đoán đúng
        int soNguoiDuDoan = 0;
        
        // Vòng lặp cho phép người dùng đoán cho đến khi đúng
        while (soNguoiDuDoan != soNgauNhien) {
            // Yêu cầu người dùng nhập số đoán
            System.out.print("Hay du doan mot so tu 1 den 50 : ");
            soNguoiDuDoan = scanner.nextInt();
            
            // Cung cấp gợi ý dựa trên việc đoán của người dùng
            if (soNguoiDuDoan < soNgauNhien) {
                System.out.println("So cua ban thap hon. Hay thu lai !");
            } else if (soNguoiDuDoan > soNgauNhien) {
                System.out.println("So cua ban cao hon. Hay thu lai !");
            } else {
                System.out.println("Chúc mừng! Bạn đã đoán đúng số!");
            }
        }
        
        // Đóng scanner khi không sử dụng nữa
        scanner.close();
    }
}