/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author macbook
 */
public class NhaXuatBan {
    private int MaNXB;
    private String TenNXB;
    private String DiaChi;
    private String DienThoai;

    public NhaXuatBan() {
    }

    public NhaXuatBan(int MaNXB, String TenNXB, String DiaChi, String DienThoai) {
        this.MaNXB = MaNXB;
        this.TenNXB = TenNXB;
        this.DiaChi = DiaChi;
        this.DienThoai = DienThoai;
    }

    public int getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(int MaNXB) {
        this.MaNXB = MaNXB;
    }

    public String getTenNXB() {
        return TenNXB;
    }

    public void setTenNXB(String TenNXB) {
        this.TenNXB = TenNXB;
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
    
    
}
