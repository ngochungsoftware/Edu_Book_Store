/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;

/**
 *
 * @author macbook
 */
public class LichSuGia {
    private int MaLSG;
    private int MaSach;
    private LocalDate NgayBatDau;
    private LocalDate NgayKetThuc;
    private double GiaBan;
    private String GhiChu;

    public LichSuGia() {
    }

    public LichSuGia(int MaLSG, int MaSach, LocalDate NgayBatDau, LocalDate NgayKetThuc, double GiaBan, String GhiChu) {
        this.MaLSG = MaLSG;
        this.MaSach = MaSach;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.GiaBan = GiaBan;
        this.GhiChu = GhiChu;
    }

    public int getMaLSG() {
        return MaLSG;
    }

    public void setMaLSG(int MaLSG) {
        this.MaLSG = MaLSG;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public LocalDate getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(LocalDate NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public LocalDate getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(LocalDate NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
}
