/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap8;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Bai1 {
    public class SanPham {
        private String tenSP;
        private double donGia, giamGia;

        public SanPham() {
        }

        public SanPham(String tenSP, double donGia, double giamGia) {
            this.tenSP = tenSP;
            this.donGia = donGia;
            this.giamGia = giamGia;
        }

        public double getThueNhapKhau() {
            double thueNhapKhau;
            thueNhapKhau = (donGia/100)*10;
            return thueNhapKhau;
        }
        
        Scanner sc = new Scanner(System.in);
        
        public void nhap() {
            System.out.println("Nhập tên sản phẩm: ");
                tenSP = sc.nextLine();
            System.out.println("Nhập đơn giá sản phẩm: ");
                donGia = sc.nextDouble();
            System.out.println("Nhập giảm giá: ");
                giamGia = sc.nextDouble();
        }
        
        public void xuat() {
            System.out.println("\n Tên sản phẩm: " +tenSP);
            System.out.println("\n Đơn giá: " +donGia);
            System.out.println("\n Giảm giá: " +giamGia);
            System.out.println("\n Thuế nhập khẩu: %s\n" +getThueNhapKhau());
        }
    }
}
