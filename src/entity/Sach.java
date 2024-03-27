/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DecimalStyle;

/**
 *
 * @author macbook
 */
public class Sach {
    private int MaSach;
    private String TenSach;
    private double GiaBan;
    private String MoTa;
    private String AnhBia;
    private LocalDate NgayCapNhat;
    private int SoLuongTon;
    private int MaNXB;
    private int MaCoupon;
    private int MaChuDe;

    public Sach() {
    }

    public Sach(int MaSach, String TenSach, double GiaBan, String MoTa, String AnhBia, LocalDate NgayCapNhat, int SoLuongTon, int MaNXB, int MaCoupon, int MaChuDe) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.GiaBan = GiaBan;
        this.MoTa = MoTa;
        this.AnhBia = AnhBia;
        this.NgayCapNhat = NgayCapNhat;
        this.SoLuongTon = SoLuongTon;
        this.MaNXB = MaNXB;
        this.MaCoupon = MaCoupon;
        this.MaChuDe = MaChuDe;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getAnhBia() {
        return AnhBia;
    }

    public void setAnhBia(String AnhBia) {
        this.AnhBia = AnhBia;
    }

    public LocalDate getNgayCapNhat() {
        return NgayCapNhat;
    }

    public void setNgayCapNhat(LocalDate NgayCapNhat) {
        this.NgayCapNhat = NgayCapNhat;
    }

    public int getSoLuongTon() {
        return SoLuongTon;
    }

    public void setSoLuongTon(int SoLuongTon) {
        this.SoLuongTon = SoLuongTon;
    }

    public int getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(int MaNXB) {
        this.MaNXB = MaNXB;
    }

    public int getMaCoupon() {
        return MaCoupon;
    }

    public void setMaCoupon(int MaCoupon) {
        this.MaCoupon = MaCoupon;
    }

    public int getMaChuDe() {
        return MaChuDe;
    }

    public void setMaChuDe(int MaChuDe) {
        this.MaChuDe = MaChuDe;
    }
    
    
}
