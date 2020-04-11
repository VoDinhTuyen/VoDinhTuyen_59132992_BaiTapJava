/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author My PC
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SinhVienPoly sinhVienPoly = new SinhVienIT(8, 7, 7.5, "Nguyễn Văn A");
        SinhVienIT sinhVienIT = new SinhVienIT(5, 7, 6, "Võ Đình Tuyên");
        SinhVienBiz sinhVienBiz = new SinhVienBiz(9, 9.3, "Nguyễn Văn B");
        sinhVienPoly.xuat();
        sinhVienIT.xuat();
        sinhVienBiz.xuat();
    }
    
}
