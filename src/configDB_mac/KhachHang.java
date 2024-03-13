/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author ADMIN
 */
public class KhachHang {
    int MaKH;
    String HoTen;
    String TaiKhoan;
    String MatKhau;
    String Email;
    String DiaChi;
    String DienThoai;
    String GioiTinh;
    String NgaySinh;

    public KhachHang() {
    }

    public KhachHang(int MaKH, String HoTen, String TaiKhoan, String MatKhau, String Email, String DiaChi, String DienThoai, String GioiTinh, String NgaySinh) {
        this.MaKH = MaKH;
        this.HoTen = HoTen;
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.DienThoai = DienThoai;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
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
        return "KhachHang{" + "MaKH=" + MaKH + ", HoTen=" + HoTen + ", TaiKhoan=" + TaiKhoan + ", MatKhau=" + MatKhau + ", Email=" + Email + ", DiaChi=" + DiaChi + ", DienThoai=" + DienThoai + ", GioiTinh=" + GioiTinh + ", NgaySinh=" + NgaySinh + '}';
    }
    
    
}
