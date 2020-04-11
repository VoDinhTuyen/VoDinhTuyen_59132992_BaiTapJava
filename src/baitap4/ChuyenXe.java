/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author My PC
 */
public class ChuyenXe {
    
    private String maSoChuyen;
    private String hoTenTX;
    private String soXe;
    private double doanhThu;

    public ChuyenXe(String maSoChuyen, String hoTenTX, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTX = hoTenTX;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }
    
    public void xuat() {
        System.out.println("Mã số chuyến:"+maSoChuyen+"\n"+"Họ tên tài xế:"+hoTenTX
                            +"\n"+"Số xe:"+soXe+"\n"+"Doanh thu:"+doanhThu);
    }

    public double getDoanhThu() {
        return doanhThu;
    }
    
    
}
