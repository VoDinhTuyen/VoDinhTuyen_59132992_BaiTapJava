/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;

/**
 *
 * @author My PC
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IQuanLy qlnv = new QuanLyNhanVien();
        NhanVien nhanVien1 = new NhanVien("Văn A", 21, "Khánh Hòa", 2000000, 210);
        NhanVien nhanVien2 = new NhanVien("Văn B", 25, "Khánh Hòa", 2300000, 190);
        NhanVien nhanVien3 = new NhanVien("Văn C", 30, "Khánh Hòa", 2500000, 200);
        NhanVien nhanVien4 = new NhanVien("Văn D", 33, "Khánh Hòa", 2700000, 198);
        NhanVien nhanVien5 = new NhanVien("Văn E", 20, "Khánh Hòa", 3000000, 210);
        qlnv.them(nhanVien1);
        qlnv.them(nhanVien2);
        qlnv.them(nhanVien3);
        qlnv.them(nhanVien4);
        qlnv.them(nhanVien5);
        qlnv.inDS();

    }
    
}
