/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author macbook
 */
public class DonHang {
    private int MaDonHang;
    private int MaNV;
    private int MaVoucher;
    private int ThanhToan;
    private int TinhTrangGiaoHang;
    private LocalDateTime NgayDat;
    private LocalDateTime NgayGiao;
    private int maKH;

    public DonHang() {
    }

    public DonHang(int MaDonHang, int MaNV, int MaVoucher, int ThanhToan, int TinhTrangGiaoHang, LocalDateTime NgayDat, LocalDateTime NgayGiao, int maKH) {
        this.MaDonHang = MaDonHang;
        this.MaNV = MaNV;
        this.MaVoucher = MaVoucher;
        this.ThanhToan = ThanhToan;
        this.TinhTrangGiaoHang = TinhTrangGiaoHang;
        this.NgayDat = NgayDat;
        this.NgayGiao = NgayGiao;
        this.maKH = maKH;
    }

    public int getMaDonHang() {
        return MaDonHang;
    }

    public void setMaDonHang(int MaDonHang) {
        this.MaDonHang = MaDonHang;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public int getMaVoucher() {
        return MaVoucher;
    }

    public void setMaVoucher(int MaVoucher) {
        this.MaVoucher = MaVoucher;
    }

    public int getThanhToan() {
        return ThanhToan;
    }

    public void setThanhToan(int ThanhToan) {
        this.ThanhToan = ThanhToan;
    }

    public int getTinhTrangGiaoHang() {
        return TinhTrangGiaoHang;
    }

    public void setTinhTrangGiaoHang(int TinhTrangGiaoHang) {
        this.TinhTrangGiaoHang = TinhTrangGiaoHang;
    }

    public LocalDateTime getNgayDat() {
        return NgayDat;
    }

    public void setNgayDat(LocalDateTime NgayDat) {
        this.NgayDat = NgayDat;
    }

    public LocalDateTime getNgayGiao() {
        return NgayGiao;
    }

    public void setNgayGiao(LocalDateTime NgayGiao) {
        this.NgayGiao = NgayGiao;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }
    
    
}
