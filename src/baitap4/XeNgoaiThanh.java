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
public class XeNgoaiThanh extends ChuyenXe {
    
    private String noiDen;
    private int soNgayDiDuoc;

    public XeNgoaiThanh(String noiDen, int soNgayDiDuoc, String maSoChuyen, String hoTenTX, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTX, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Nơi đến:"+noiDen+"\n"+"Số ngày đi được:"+soNgayDiDuoc+"\n");
    }

    
}
