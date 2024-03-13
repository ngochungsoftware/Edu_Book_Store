/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author pc
 */
public class Voucher {
    private int maVoucher;
    private String tenVoucher;
    private String ngayBatDau;
    private String ngayKetThuc;
    private double giamGia;
    private String dieuKien;

    public Voucher(int maVoucher, String tenVoucher, String ngayBatDau, String ngayKetThuc, double giamGia, String dieuKien) {
        this.maVoucher = maVoucher;
        this.tenVoucher = tenVoucher;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.giamGia = giamGia;
        this.dieuKien = dieuKien;
    }

    public Voucher(String tenVoucher, String ngayBatDau, String ngayKetThuc, double giamGia, String dieuKien) {
        this.tenVoucher = tenVoucher;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.giamGia = giamGia;
        this.dieuKien = dieuKien;
    }

    public Voucher() {
    }

    public int getMaVoucher() {
        return maVoucher;
    }

    public void setMaVoucher(int maVoucher) {
        this.maVoucher = maVoucher;
    }

    public String getTenVoucher() {
        return tenVoucher;
    }

    public void setTenVoucher(String tenVoucher) {
        this.tenVoucher = tenVoucher;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public String getDieuKien() {
        return dieuKien;
    }

    public void setDieuKien(String dieuKien) {
        this.dieuKien = dieuKien;
    }

    @Override
    public String toString() {
        return "Voucher{" + "maVoucher=" + maVoucher + ", tenVoucher=" + tenVoucher + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc + ", giamGia=" + giamGia + ", dieuKien=" + dieuKien + '}';
    }
    
    public Object[] toDataRow(){
        return new Object[]{
            maVoucher, tenVoucher, ngayBatDau, ngayKetThuc, giamGia, dieuKien
        };
    }
}
