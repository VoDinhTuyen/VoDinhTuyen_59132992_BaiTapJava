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
public class SinhVienBiz extends SinhVienPoly{
    
    private double diemMarketing;
    private double diemSales;

    @Override
    public double getDiem() {
        return (2*diemMarketing+diemSales)/3;
    }

    public SinhVienBiz(double diemMarketing, double diemSales, String hoTen) {
        super(hoTen, "BIZ");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public void xuat() {
        super.xuat(); 
        System.out.println("Điểm:"+getDiem()+"\n"+"Học lực:"+ super.getHocLuc()+"\n");
    }
    
    
}
