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
public class Coupon {
    private int MaCoupon;
    private String TenCoupon;
    private LocalDate NgayBatDau;
    private LocalDate NgayKetThuc;
    private String Quatang;
    private String DieuKien;

    public Coupon() {
    }

    public Coupon(int MaCoupon, String TenCoupon, LocalDate NgayBatDau, LocalDate NgayKetThuc, String Quatang, String DieuKien) {
        this.MaCoupon = MaCoupon;
        this.TenCoupon = TenCoupon;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.Quatang = Quatang;
        this.DieuKien = DieuKien;
    }

    public int getMaCoupon() {
        return MaCoupon;
    }

    public void setMaCoupon(int MaCoupon) {
        this.MaCoupon = MaCoupon;
    }

    public String getTenCoupon() {
        return TenCoupon;
    }

    public void setTenCoupon(String TenCoupon) {
        this.TenCoupon = TenCoupon;
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

    public String getQuatang() {
        return Quatang;
    }

    public void setQuatang(String Quatang) {
        this.Quatang = Quatang;
    }

    public String getDieuKien() {
        return DieuKien;
    }

    public void setDieuKien(String DieuKien) {
        this.DieuKien = DieuKien;
    }
    
    
    
}
