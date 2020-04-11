/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author My PC
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NhanVien nhanVien1 = new NhanVien("Văn A", 21, "Khánh Hòa", 2000000, 210);
        NhanVien nhanVien2 = new NhanVien("Văn B", 25, "Khánh Hòa", 2300000, 190);
        System.out.println(nhanVien1.getThongTin()+"Thưởng:"+nhanVien1.tinhThuong());
        System.out.println(nhanVien2.getThongTin()+"Thưởng:"+nhanVien2.tinhThuong());
    }
    
}
