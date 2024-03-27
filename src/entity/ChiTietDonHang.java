/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author macbook
 */
public class ChiTietDonHang {
    private int MaLSG;
    private int MaDonHang;
    private int MaSach;
    private LichSuGia lichSuGia;
    private DonHang donHang;
    private int soLuong;
    private String donGia;

    public ChiTietDonHang(LichSuGia lichSuGia, DonHang donHang, int soLuong, String donGia) {
        this.lichSuGia = lichSuGia;
        this.donHang = donHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public ChiTietDonHang() {
    }

    public LichSuGia getLichSuGia() {
        return lichSuGia;
    }

    public void setLichSuGia(LichSuGia lichSuGia) {
        this.lichSuGia = lichSuGia;
    }

    public DonHang getDonHang() {
        return donHang;
    }

    public void setDonHang(DonHang donHang) {
        this.donHang = donHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }
    
    
    
    
}
