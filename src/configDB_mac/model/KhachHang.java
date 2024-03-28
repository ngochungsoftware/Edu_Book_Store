/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class KhachHang {
    String MaKH;
    String HoTen;
    String Email;
    String DiaChi;
    String DienThoai;
    String GioiTinh;
    String NgaySinh;

    public KhachHang() {
    }

    public KhachHang(String MaKH, String HoTen, String Email, String DiaChi, String DienThoai, String GioiTinh, String NgaySinh) {
        this.MaKH = MaKH;
        this.HoTen = HoTen;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.DienThoai = DienThoai;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "MaKH=" + MaKH + ", HoTen=" + HoTen + ", Email=" + Email + ", DiaChi=" + DiaChi + ", DienThoai=" + DienThoai + ", GioiTinh=" + GioiTinh + ", NgaySinh=" + NgaySinh + '}';
    }


    
}
