/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment5;
import java.util.Scanner;

public class BangCuuChuong {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập một số
        System.out.print("Nhap mot so tu 1 den 10 de in ra bang cuu chuong : ");
        int so = scanner.nextInt();

        // Kiểm tra nếu số nhập vào nằm trong phạm vi từ 1 đến 10
        if (so >= 1 && so <= 10) {
            System.out.println("Bang cuu chuong cua so  " + so + ":");
            // In bảng cửu chương cho số đó
            for (int i = 1; i <= 10; i++) {
                System.out.println(so + " x " + i + " = " + (so * i));
            }
        } else {
            System.out.println("Vui long nhap mot so trong pham vi tu 1 den 10 .");
        }
    }
}