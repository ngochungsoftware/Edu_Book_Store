/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class TaiKhoan {

    private String TenTaiKhoan;
    private String MaNV;
    private String MaTK;
    private String MatKhau;
    private String Quyen;
    private String TrangThai;

    public TaiKhoan() {
    }

    public TaiKhoan(String TenTaiKhoan, String MaNV, String MaTK, String MatKhau, String Quyen, String TrangThai) {
        this.TenTaiKhoan = TenTaiKhoan;
        this.MaNV = MaNV;
        this.MaTK = MaTK;
        this.MatKhau = MatKhau;
        this.Quyen = Quyen;
        this.TrangThai = TrangThai;
    }

    public String getTenTaiKhoan() {
        return TenTaiKhoan;
    }

    public void setTenTaiKhoan(String TenTaiKhoan) {
        this.TenTaiKhoan = TenTaiKhoan;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaTK() {
        return MaTK;
    }

    public void setMaTK(String MaTK) {
        this.MaTK = MaTK;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getQuyen() {
        return Quyen;
    }

    public void setQuyen(String Quyen) {
        this.Quyen = Quyen;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "TenTaiKhoan=" + TenTaiKhoan + ", MaNV=" + MaNV + ", MaTK=" + MaTK + ", MatKhau=" + MatKhau + ", Quyen=" + Quyen + ", TrangThai=" + TrangThai + '}';
    }


}
