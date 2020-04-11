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
public class BaiTap4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Khởi tạo
        ChuyenXe chuyenXe1 = new XeNoiThanh("01", 100, "001", "Nguyễn Văn A", "KH1234", 1000000);
        ChuyenXe chuyenXe2 = new XeNoiThanh("02", 200, "002", "Nguyễn Văn B", "KH1313", 1620000);
        ChuyenXe chuyenXe3 = new XeNoiThanh("03", 150, "003", "Nguyễn Văn C", "KH1133", 1300000);
        ChuyenXe chuyenXe4 = new XeNgoaiThanh("TPHCM", 2, "004", "Trần Văn X", "TH1010", 2000000);
        ChuyenXe chuyenXe5 = new XeNgoaiThanh("Hà Nội", 3, "005", "Trần Văn Y", "TH33333", 2300000);
        ChuyenXe chuyenXe6 = new XeNgoaiThanh("Đà Nẵng", 1, "006", "Trần Văn Z", "MH9191", 1550000);
        
        // Thêm vào DS
        QuanLyChuyenXe quanLyChuyenXe = new QuanLyChuyenXe();
        quanLyChuyenXe.themChuyenXe(chuyenXe1);
        quanLyChuyenXe.themChuyenXe(chuyenXe2);
        quanLyChuyenXe.themChuyenXe(chuyenXe3);
        quanLyChuyenXe.themChuyenXe(chuyenXe4);
        quanLyChuyenXe.themChuyenXe(chuyenXe5);
        quanLyChuyenXe.themChuyenXe(chuyenXe6);
        
        // Xuất DS
        quanLyChuyenXe.xuatDS();
        
        // Tính Doanh thu
        System.out.println("Tổng doanh thu xe nội thành: "+quanLyChuyenXe.tongDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu xe ngoại thành: "+quanLyChuyenXe.tongDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu cả 2 loại xe: "+(quanLyChuyenXe.tongDoanhThuNoiThanh()+quanLyChuyenXe.tongDoanhThuNgoaiThanh()));
    }
    
}
