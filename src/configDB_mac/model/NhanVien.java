/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class NhanVien {
    String MaNV;
    String HoTen;
    String Email;
    String DiaChi;
    String DienThoai;
    String GioiTinh;
    String NgaySinh;
    String VaiTro;
    String Luong;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String HoTen, String Email, String DiaChi, String DienThoai, String GioiTinh, String NgaySinh, String VaiTro, String Luong) {
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.DienThoai = DienThoai;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.VaiTro = VaiTro;
        this.Luong = Luong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
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

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }

    public String getLuong() {
        return Luong;
    }

    public void setLuong(String Luong) {
        this.Luong = Luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "MaNV=" + MaNV + ", HoTen=" + HoTen + ", Email=" + Email + ", DiaChi=" + DiaChi + ", DienThoai=" + DienThoai + ", GioiTinh=" + GioiTinh + ", NgaySinh=" + NgaySinh + ", VaiTro=" + VaiTro + ", Luong=" + Luong + '}';
    }

    
}
