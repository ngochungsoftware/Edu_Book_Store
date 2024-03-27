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
public class Voucher {
    private int MaVoucher;
    private String TenVoucher;
    private LocalDate NgayBatDau;
    private LocalDate NgayKetThuc;
    private float Giamgia;
    private String DieuKien;

    public Voucher() {
    }

    public Voucher(int MaVoucher, String TenVoucher, LocalDate NgayBatDau, LocalDate NgayKetThuc, float Giamgia, String DieuKien) {
        this.MaVoucher = MaVoucher;
        this.TenVoucher = TenVoucher;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.Giamgia = Giamgia;
        this.DieuKien = DieuKien;
    }

    public int getMaVoucher() {
        return MaVoucher;
    }

    public void setMaVoucher(int MaVoucher) {
        this.MaVoucher = MaVoucher;
    }

    public String getTenVoucher() {
        return TenVoucher;
    }

    public void setTenVoucher(String TenVoucher) {
        this.TenVoucher = TenVoucher;
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

    public float getGiamgia() {
        return Giamgia;
    }

    public void setGiamgia(float Giamgia) {
        this.Giamgia = Giamgia;
    }

    public String getDieuKien() {
        return DieuKien;
    }

    public void setDieuKien(String DieuKien) {
        this.DieuKien = DieuKien;
    }
    
    
}
