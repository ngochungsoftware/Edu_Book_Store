/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class NhanVien {
    private int MaNV;
    private String HoTen;
    public String TaiKhoan;
    public String MatKhau;
    private String Email;
    private String DiaChi;
    private String DienThoai;
    private String GioiTinh;
    private String NgaySinh;
    public String Vaitro;

    public NhanVien() {
    }

    public NhanVien(int MaNV, String HoTen, String TaiKhoan, String MatKhau, String Email, String DiaChi, String DienThoai, String GioiTinh, String NgaySinh, String Vaitro) {
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.DienThoai = DienThoai;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.Vaitro = Vaitro;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
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

    public String getVaitro() {
        return Vaitro;
    }

    public void setVaitro(String Vaitro) {
        this.Vaitro = Vaitro;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "MaNV=" + MaNV + ", HoTen=" + HoTen + ", TaiKhoan=" + TaiKhoan + ", MatKhau=" + MatKhau + ", Email=" + Email + ", DiaChi=" + DiaChi + ", DienThoai=" + DienThoai + ", GioiTinh=" + GioiTinh + ", NgaySinh=" + NgaySinh + ", Vaitro=" + Vaitro + '}';
    }
    
    
}
